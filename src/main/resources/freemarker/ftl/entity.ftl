/**
 * @filename:${entityName} ${createTime}
 * @project ${project}  ${version}
 * Copyright(c) 2021 ${author} Co. Ltd.
 * All right reserved. 
 */
package ${entityUrl};

import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;

/**   
 *  
 * @Description:  ${entityComment}
 * @Author:       ${author}   
 * @CreateDate:   ${createTime}
 * @Version:      ${version}
 *    
 */
public class ${entityName} implements Serializable {

	private static final long serialVersionUID = ${agile}L;
	
<#list cis as ci>
	<#if ci.javaType=="Date">
        <#if ci.jdbcType=="date">
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
        <#elseif ci.jdbcType=="time">
    @DateTimeFormat(pattern = "HH:mm:ss")
    @JsonFormat(pattern="HH:mm:ss",timezone = "GMT+8")
        <#else>
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
        </#if>
	</#if>
	@ApiModelProperty(name = "${ci.property}" , value = "${ci.comment}")
	private ${ci.javaType} ${ci.property};
</#list>

<#list cis as ci>
    public ${ci.javaType} set${ci.upFiled}(${ci.javaType} ${ci.property}) {
        <#if ci.javaType=="String">
        this.${ci.property} = ${ci.property} == null ? null : ${ci.property}.trim();
        if ("".equals(this.${ci.property})){
            this.${ci.property} = null;
        }
        <#else>
        this.${ci.property} = ${ci.property};
        </#if>
        return this;
    }
    public ${ci.javaType} get${ci.upFiled}() {
        return this.${ci.property};
    }

</#list>
}
	