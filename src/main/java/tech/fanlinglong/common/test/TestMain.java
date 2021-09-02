/**
 * @filename:UserController 2019年4月9日
 * @project wallet-manage  V1.0
 * Copyright(c) 2018 BianPeng Co. Ltd. 
 * All right reserved. 
 */
package tech.fanlinglong.common.test;

import tech.fanlinglong.common.entity.BasisInfo;
import tech.fanlinglong.common.util.EntityInfoUtil;
import tech.fanlinglong.common.util.Generator;
import tech.fanlinglong.common.util.MySqlToJavaUtil;

import java.sql.SQLException;
import java.util.Date;


/**
 * Copyright: Copyright (c) 2021
 * 
 * <p>
 * 说明： 自动生成工具
 * </P>
 * <p>
 * 源码地址：https://github.com/fanlinglonghub/mybatis-generator
 * </P>
 */
public class TestMain {

	// 基础信息：项目名、作者、版本
	public static final String PROJECT = "wallet-manage"; 
	public static final String AUTHOR = "BianPeng";
	public static final String VERSION = "V1.0";

	// 数据库连接信息：连接URL、用户名、秘密、数据库名
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/earn_knife?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&failOverReadOnly=false&useSSL=true&serverTimezone=UTC";
	public static final String NAME = "root";
	public static final String PASS = "pwd2020";
	public static final String DATABASE = "earn_knife";

	// 类信息：类名、对象名（一般是【类名】的首字母小些）、类说明、时间
	public static final String CLASSNAME = "Platform";
	public static final String TABLE = "platform";
	public static final String CLASSCOMMENT = "平台申请";
	public static final String TIME = "2019年5月5日";
	public static final String AGILE = new Date().getTime() + "";

	// 路径信息，分开路径方便聚合工程项目，微服务项目
	public static final String ENTITY_URL = "com.buybit.wm.entity";
	public static final String DAO_URL = "com.buybit.wm.dao";
	public static final String XML_URL = "com.buybit.wm.dao.impl";
	public static final String SERVICE_URL = "com.buybit.wm.service";
	public static final String SERVICE_IMPL_URL = "com.buybit.wm.service.impl";
	public static final String CONTROLLER_URL = "com.buybit.wm.web";

	public static void main(String[] args) {
		BasisInfo bi = new BasisInfo(PROJECT, AUTHOR, VERSION, URL, NAME, PASS, DATABASE, TIME, AGILE, ENTITY_URL,
				DAO_URL, XML_URL, SERVICE_URL, SERVICE_IMPL_URL, CONTROLLER_URL);
		bi.setTable(TABLE);
		bi.setEntityName(MySqlToJavaUtil.getClassName(TABLE));
		bi.setObjectName(MySqlToJavaUtil.changeToJavaFiled(TABLE));
		bi.setEntityComment(CLASSCOMMENT);
		try {
			bi = EntityInfoUtil.getInfo(bi);
			String fileUrl = "E:\\a_item_work\\wallet\\wallet-manage\\wallet-manage-web\\src\\main\\java\\";// 生成文件存放位置
			String aa1 = Generator.createEntity(fileUrl, bi).toString();

			String aa2 = Generator.createDao(fileUrl, bi).toString();
			String aa3 = Generator.createDaoImpl(fileUrl, bi).toString();
			String aa4 = Generator.createService(fileUrl, bi).toString();
			String aa5 = Generator.createServiceImpl(fileUrl, bi).toString();
			String aa6 = Generator.createController(fileUrl, bi).toString();

			// 是否创建swagger配置文件
			// String aa7 = Generator.createSwaggerConfig(fileUrl, bi).toString();

			System.out.println(aa1);
			System.out.println(aa2);
			System.out.println(aa3);
			System.out.println(aa4);
			System.out.println(aa5);
			System.out.println(aa6);

			// System.out.println(aa7);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
