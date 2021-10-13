/**   
 * Copyright © 2019 dream horse Info. Tech Ltd. All rights reserved.
 * @Package: tech.fanlinglong.common.convert
 * @author: fanlinglong  
 * @date: 2021年4月9日 下午8:15:25 
 */
package tech.fanlinglong.common.convert;

/**   
 * Copyright: Copyright (c) 2021 
 * 
 * <p>说明： 数据库时间类型 到 实体类时间类型 对应策略</P>
 * @version: v1.0.0
 * @author: fanlinglong
 * 
 * Modification History:
 * Date         	Author          Version          Description
 *---------------------------------------------------------------*
 * 2021年4月9日      		fanlinglong   v1.0.0           initialize
 */
public enum DateType {
    /**
     * 
     * <p>只使用 java.util.date 代替</p>
     */
    ONLY_DATE,
    /**
     * <p>使用 java.sql 包下的</p>
     */
    SQL_PACK,
    /**
     * <p>使用 java.time 包下的</p>
     * <p>java8 新的时间类型</p>
     */
    TIME_PACK
}

