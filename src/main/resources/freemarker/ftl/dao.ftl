/**
 * @filename:${entityName}Dao ${createTime}
 * @project ${project}  ${version}
 * Copyright(c) 2021 ${author} Co. Ltd.
 * All right reserved. 
 */
package ${daoUrl};

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ${entityUrl}.${entityName};

/**   
 *  
 * @Description:  ${entityComment}——DAO
 * @Author:       ${author}   
 * @CreateDate:   ${createTime}
 * @Version:      ${version}
 *    
 */
@Mapper
public interface ${entityName}Dao {
	
	${entityName} selectByPrimaryKey(${idType} id);
	
	int deleteByPrimaryKey(${idType} id);
	
	int insertSelective(${entityName} ${objectName});
	
	int updateByPrimaryKeySelective(${entityName} ${objectName});
	
	List<${entityName}> query${entityName}List(${entityName} ${objectName});
}
	