/**   
 * Copyright © 2019 dream horse Info. Tech Ltd. All rights reserved.
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * @Package: tech.fanlinglong.common.convert
 * @author: fanlinglong 
 * @date: 2021年4月9日 下午8:09:35 
 */
package tech.fanlinglong.common.convert;

/**   
* Copyright: Copyright (c) 2021 
* 
* <p>说明： 获取实体类字段属性类信息接口</p>
* @version: v1.0.0
* @author: fanlinglong
*
* Modification History:
* Date         		Author          Version          Description
*---------------------------------------------------------------*
* 2021年4月9日      		fanlinglong   v1.0.0           initialize
*/
public interface IColumnType {
	/**
     * <p>获取字段类型</p>
     *
     * @return 字段类型
     */
    String getType();

    /**
     * <p> 获取字段类型完整名</p>
     *
     * @return 字段类型完整名
     */
    String getPkg();
}
