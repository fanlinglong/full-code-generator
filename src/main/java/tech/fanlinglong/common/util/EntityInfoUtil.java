/**
 * Copyright © 2019 dream horse Info. Tech Ltd. All rights reserved.
 *
 * @Package: tech.fanlinglong.common.util
 * @author: fanlinglong
 * @date: 2021年4月9日 下午8:15:25
 */
package tech.fanlinglong.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tech.fanlinglong.common.entity.BasisInfo;
import tech.fanlinglong.common.entity.PropertyInfo;

/**
 * Copyright: Copyright (c) 2021 
 *
 * <p>说明：  链接数据库并获取表信息</P>
 * @version: v1.0.0
 * @author: fanlinglong
 *
 * Modification History:
 * Date         	Author          Version          Description
 *---------------------------------------------------------------*
 * 2021年4月9日      		fanlinglong   v1.0.0           initialize
 */
public class EntityInfoUtil {

  public static BasisInfo getInfo(BasisInfo bi) throws SQLException {
    List<PropertyInfo> columns = new ArrayList<PropertyInfo>();
    // 创建连接
    Connection con = null;
    PreparedStatement pstemt = null;
    //sql
    String sql =
        "select column_name,data_type,column_comment from information_schema.columns where table_schema='"
            + bi.getDatabase() + "' and table_name='" + bi.getTable() + "'";
    try {
      con = DriverManager.getConnection(bi.getDbUrl(), bi.getDbName(), bi.getDbPassword());
      pstemt = con.prepareStatement(sql);
      ResultSet executeQuery = pstemt.executeQuery();
      while (executeQuery.next()) {
        String column = executeQuery.getString(1);
        String jdbcType = executeQuery.getString(2);
        String comment = executeQuery.getString(3);
        PropertyInfo ci = new PropertyInfo();
        ci.setColumn(column);
        if (jdbcType.equalsIgnoreCase("int")) {
          ci.setJdbcType("Integer");
        } else if (jdbcType.equalsIgnoreCase("datetime")) {
          ci.setJdbcType("timestamp");
        } else {
          ci.setJdbcType(jdbcType);
        }
        ci.setComment(comment);
        ci.setProperty(MySqlToJavaUtil.changeToJavaFiled(column));
        ci.setJavaType(MySqlToJavaUtil.jdbcTypeToJavaType(jdbcType));
        //设置注解类型
        if ("id".equalsIgnoreCase(column)) {
          bi.setIdType(ci.getJavaType());
          bi.setIdJdbcType(ci.getJdbcType());
        } else if (column.endsWith("id")) {
          bi.setIdType(ci.getJavaType());
          bi.setIdJdbcType(ci.getJdbcType());
        }
        columns.add(ci);
      }
      bi.setCis(columns);
      return bi;
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException("自动生成实体类错误：" + e.getMessage());
    } finally {
      pstemt.close();
      con.close();
    }
  }
}
