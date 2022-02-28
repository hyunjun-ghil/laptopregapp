package com.KD.laptopRegApp.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.KD.laptopRegApp.dao.*;;

@Service("laptopService")
public class laptopImpl implements laptopService {

	@Resource(name = "laptopDAO")
	private laptopDAO laptopDAO;

	public List<Map<String, Object>> selectUserInform(Map<String, Object> map) throws Exception {
		return laptopDAO.selectUserInform(map);
	}
	
	public List<Map<String, Object>> selectSerial(Map<String, Object> map) throws Exception {
		return laptopDAO.selectSerial(map);
	}

	public List<Map<String, Object>> save(Map<String, Object> map) throws Exception {
		return laptopDAO.save(map);
	}
	
	public List<Map<String, Object>> returnlaptop(Map<String, Object> map) throws Exception {
		return laptopDAO.returnlaptop(map);
	}

}
