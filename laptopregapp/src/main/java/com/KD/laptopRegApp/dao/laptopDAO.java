package com.KD.laptopRegApp.dao;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("laptopDAO")
public class laptopDAO extends AbstractDAO{

	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectUserInform(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>)selectList("laptop.selectUserInform", map);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectSerial(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>)selectList("laptop.selectSerial", map);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> save(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>)selectList("laptop.save", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> returnlaptop(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>)selectList("laptop.returnlaptop", map);
	}

}
