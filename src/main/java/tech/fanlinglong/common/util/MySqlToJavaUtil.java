/**   
 * Copyright © 2019 dream horse Info. Tech Ltd. All rights reserved.
 * @Package: tech.fanlinglong.common.util
 * @author: fanlinglong  
 * @date: 2021年4月9日 下午8:15:25 
 */
package tech.fanlinglong.common.util;

import tech.fanlinglong.common.convert.DateType;
import tech.fanlinglong.common.convert.MySqlTypeConvert;
/**   
 * Copyright: Copyright (c) 2021 
 * 
 * <p>说明： 获奖java中需要的驼峰命名</P>
 * @version: v1.0.0
 * @author: fanlinglong
 * 
 * Modification History:
 * Date         	Author          Version          Description
 *---------------------------------------------------------------*
 * 2021年4月9日      		fanlinglong   v1.0.0           initialize
 */
public class MySqlToJavaUtil {
	
	/**
     * <p>说明:获取java类名</p>
     * @param table  表名
     * @return String
     */
	public static String getClassName(String table) {
		table=changeToJavaFiled(table);
		StringBuilder builder = new StringBuilder();
		char[] cs = table.toCharArray();
		cs[0] -= 32;
		builder.append(String.valueOf(cs));
		return builder.toString();
	}
	
	/**
     * <p>说明:获取字段名，把"_"后面字母变大写</p>
     * @param field  字段名
     * @return String
     */
	public static String changeToJavaFiled(String field) {
		String[] fields = field.split("_");
		StringBuilder builder = new StringBuilder(fields[0]);
		for (int i = 1; i < fields.length; i++) {
			char[] cs = fields[i].toCharArray();
			cs[0] -= 32;
			builder.append(String.valueOf(cs));
		}
		return builder.toString();
	}
	

	/**
     * <p>说明:把sql的数据类型转为java需要的类型</p>
     * @param sqlType  sql类型
     * @return String  java类型
     */
	public static String jdbcTypeToJavaType(String sqlType) {
		MySqlTypeConvert typeConvert= new MySqlTypeConvert();
		return typeConvert.processTypeConvert(DateType.ONLY_DATE, sqlType).getType();
	}
}
