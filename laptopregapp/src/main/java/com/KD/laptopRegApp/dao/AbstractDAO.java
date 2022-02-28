package com.KD.laptopRegApp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

//import com.kdnavien.crmcn.common.util.Paging;

//import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

public class AbstractDAO {
	protected Log log = LogFactory.getLog(AbstractDAO.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	protected void printQueryId(String queryId) {
		if(log.isDebugEnabled()){
			log.debug("\t QueryId  \t:  " + queryId);
		}
	}
	
	public Object insert(String queryId, Object params){
		printQueryId(queryId);
		return sqlSession.insert(queryId, params);
	}
	
	public Object update(String queryId, Object params){
		printQueryId(queryId);
		return sqlSession.update(queryId, params);
	}
	
	public Object delete(String queryId, Object params){
		printQueryId(queryId);
		return sqlSession.delete(queryId, params);
	}
	
	public Object selectOne(String queryId){
		printQueryId(queryId);
		return sqlSession.selectOne(queryId);
	}
	
	public Object selectOne(String queryId, Object params){
		printQueryId(queryId);
		return sqlSession.selectOne(queryId, params);
	}
	
	@SuppressWarnings("rawtypes")
	public List selectList(String queryId){
		printQueryId(queryId);
		return sqlSession.selectList(queryId);
	}
	
	@SuppressWarnings("rawtypes")
	public List selectList(String queryId, Object params){
		printQueryId(queryId);
		return sqlSession.selectList(queryId,params);
	}
	

	/*
	 * @SuppressWarnings({ "rawtypes", "unchecked" }) public Map
	 * selectPagingList(String total_queryId, String queryId, Object params){
	 * printQueryId(queryId);
	 * 
	 * Map<String,Object> map = (Map<String,Object>)params;
	 * 
	 * Map<String,Object> map2 = sqlSession.selectOne(total_queryId, params);
	 * 
	 * 
	 * Paging paging = new Paging(); if (map.get("pageNo") == null ||
	 * map.get("pageNo").toString().length() == 0) { paging.setPageNo(1); }else{
	 * paging.setPageNo(Integer.parseInt(map.get("pageNo").toString())); }
	 * paging.setPageSize(20); paging.setTotalCount(
	 * Integer.parseInt(map2.get("TOTAL_COUNT").toString())); map.put("START",
	 * (paging.getPageNo()-1)*paging.getPageSize()+1);
	 * map.put("END",paging.getPageSize()*paging.getPageNo()); //(n-1)*size ,
	 * n*size-1
	 * 
	 * 
	 * Map<String,Object> returnMap = new HashMap<String,Object>();
	 * List<Map<String,Object>> list = sqlSession.selectList(queryId,params);
	 * 
	 * returnMap.put("result", list); returnMap.put("data", map2);
	 * returnMap.put("paging", paging); return returnMap; }
	 */
	
	@SuppressWarnings("rawtypes")
	public List selectCodeList(String group_id){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("PARENT_ID", group_id);
		printQueryId("common.CodeList");
		return sqlSession.selectList("common.CodeList",map);
	}
	
}
