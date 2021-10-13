package tech.fanlinglong.common.test;


import java.sql.SQLException;
import java.util.Date;
import tech.fanlinglong.common.entity.BasisInfo;
import tech.fanlinglong.common.util.EntityInfoUtil;
import tech.fanlinglong.common.util.Generator;
import tech.fanlinglong.common.util.MySqlToJavaUtil;

public class TestMain {

  //基础信息
  public static final String PROJECT = "wifi";
  public static final String AUTHOR = "fanll";
  public static final String VERSION = "V1.0";
  //数据库连接信息
  public static final String URL = "jdbc:mariadb://192.168.0.10:3306/db_wifi";
  public static final String NAME = "root";
  public static final String PASSWORD = "123456";
  public static final String DATABASE = "db_wifi";
  //类信息
  public static final String TABLE = "tb_mac";
  public static final String CLASS_NAME = "MAC";
  public static final String CLASS_COMMENT = "终端数据表";
  public static final String TIME = "2021年8月26日";
  public static final String AGILE = new Date().getTime() + "";
  //路径信息
  public static final String ENTITY_URL = "tech.fanll.wifi.demo.entity";
  public static final String DAO_URL = "tech.fanll.wifi.demo.dao";
  public static final String DAO_IMPL_URL = "mappers";
  public static final String SERVICE_URL = "tech.fanll.wifi.demo.service";
  public static final String SERVICE_IMPL_URL = "tech.fanll.wifi.demo.service.impl";
  public static final String CONTROLLER_URL = "tech.fanll.wifi.demo.controller";


  public static void main(String[] args) {
    BasisInfo bi = new BasisInfo(PROJECT, AUTHOR, VERSION, URL, NAME, PASSWORD, DATABASE, TIME,
        AGILE, ENTITY_URL, DAO_URL, DAO_IMPL_URL, SERVICE_URL, SERVICE_IMPL_URL, CONTROLLER_URL);
    bi.setTable(TABLE);
    bi.setEntityName(MySqlToJavaUtil.getClassName(TABLE));
    bi.setObjectName(MySqlToJavaUtil.changeToJavaFiled(TABLE));
    bi.setEntityComment(CLASS_COMMENT);
    try {
      bi = EntityInfoUtil.getInfo(bi);
      String aa1 = Generator.createEntity("D:\\fanll\\wifi\\", bi).toString();
      String aa2 = Generator.createDao("D:\\fanll\\wifi\\", bi).toString();
      String aa3 = Generator.createDaoImpl("D:\\fanll\\wifi\\", bi).toString();
      String aa4 = Generator.createService("D:\\fanll\\wifi\\", bi).toString();
      String aa5 = Generator.createServiceImpl("D:\\fanll\\wifi\\", bi).toString();
      String aa6 = Generator.createController("D:\\fanll\\wifi\\", bi).toString();

      System.out.println(aa1);
      System.out.println(aa2);
      System.out.println(aa3);
      System.out.println(aa4);
      System.out.println(aa5);
      System.out.println(aa6);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
