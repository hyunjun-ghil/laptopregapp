package com.KD.laptopRegApp.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public interface laptopService {

	List<Map<String, Object>> selectUserInform(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> selectSerial(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> save(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> returnlaptop(Map<String, Object> map) throws Exception;

}
