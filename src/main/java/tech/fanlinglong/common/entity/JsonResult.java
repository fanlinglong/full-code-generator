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
 * <p>说明： 返回结果json对象</P>
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
public class JsonResult implements Serializable{
	
	private static final long serialVersionUID = 123126L;
	
	private Integer code;
	
	private String message;
	
	private Object data;
}
