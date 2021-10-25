/**
 * @filename:${entityName}Service ${createTime}
 * @project ${project}  ${version}
 * Copyright(c) 2021 ${author} Co. Ltd.
 * All right reserved. 
 */
package ${serviceUrl};

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.github.gencode.bean.AppPage;
import ${entityUrl}.${entityName};
/**   
 *  
 * @Description:  ${entityComment}——SERVICE
 * @Author:       ${author}   
 * @CreateDate:   ${createTime}
 * @Version:      ${version}
 *    
 */
public interface ${entityName}Service {
	
	/**
	 * @explain 查询${entityComment}对象
	 * @param   id：对象参数
	 * @return  ${entityName}
	 * @author  ${author}
	 */
	${entityName} selectByPrimaryKey(${idType} id);
	
	/**
	 * @explain 删除${entityComment}对象
	 * @param   id：对象参数
	 * @return  int
	 * @author  ${author}
	 */
	int deleteByPrimaryKey(${idType} id);
	
	/**
	 * @explain 添加${entityComment}对象
	 * @param   ${entityName}：对象参数
	 * @return  int
	 * @author  ${author}
	 */
	int insertSelective(${entityName} ${objectName});
	
	/**
	 * @explain 修改${entityComment}对象
	 * @param   ${entityName}：对象参数
	 * @return  int
	 * @author  ${author}
	 */
	int updateByPrimaryKeySelective(${entityName} ${objectName});
	
	/**
	 * @explain 查询${entityComment}集合
	 * @param   ${entityName}：对象参数
	 * @return  List<${entityName}>
	 * @author  ${author}
	 */
	List<${entityName}> query${entityName}List(${entityName} ${objectName});
	
	/**
	 * @explain 分页查询${entityComment}
	 * @param   ${entityName}：对象参数
	 * @return  PageInfo<${entityName}>
	 * @author  ${author}
	 */
	PageInfo<${entityName}> get${entityName}BySearch(AppPage<${entityName}> page);
}