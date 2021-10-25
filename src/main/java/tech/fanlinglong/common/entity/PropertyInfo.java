/**   
 * Copyright © 2019 dream horse Info. Tech Ltd. All rights reserved.
 * @Package: tech.fanlinglong.common.entity
 * @author: fanlinglong  
 * @date: 2021年4月9日 下午8:15:25 
 */
package tech.fanlinglong.common.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**   
 * Copyright: Copyright (c) 2021 
 * 
 * <p>说明： 获取到数据库的信息</P>
 * @version: v1.0.0
 * @author: fanlinglong
 * 
 * Modification History:
 * Date         	Author          Version          Description
 *---------------------------------------------------------------*
 * 2021年4月9日      		fanlinglong   v1.0.0           initialize
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyInfo implements Serializable{
	
	private static final long serialVersionUID = 123124L;

	// 数据库字段
	private String column;

	// 数据库字段类型
	private String jdbcType;

	// 数据库字段备注
	private String comment;

	// java 字段
	private String property;

	// java 字段（首字母大写）
	private String upFiled;

	// java类型
	private String javaType;
}
