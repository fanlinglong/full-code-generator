/**   
 * Copyright © 2019 dream horse Info. Tech Ltd. All rights reserved.
 * @Package: tech.fanlinglong.common.entity
 * @author: flying-cattle  
 * @date: 2019年4月9日 下午8:15:25 
 */
package tech.fanlinglong.common.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**   
 * Copyright: Copyright (c) 2019 
 * 
 * <p>说明： 获取到数据库的信息</P>
 * @version: v2.1.0
 * @author: flying-cattle
 * 
 * Modification History:
 * Date         	Author          Version          Description
 *---------------------------------------------------------------*
 * 2019年4月9日      		flying-cattle   v2.1.0           initialize
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyInfo implements Serializable{
	
	private static final long serialVersionUID = 123124L;
	
	private String column;

	private String jdbcType;
	 
	private String comment;
	 
	private String property;
	 
	private String javaType;
}
