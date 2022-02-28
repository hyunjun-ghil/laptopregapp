package com.KD.laptopRegApp.common;
 
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
 
public class CommandMap {
    Map<String,Object> map = new HashMap<String,Object>();
     
    public Object get(String key){
    	if(map.get(key) != null && map.get(key).getClass().getName().contains("String")){
			if(!map.get(key).getClass().isArray()){
				this.put(key,  cleanXSS(map.get(key).toString()));
			}
		}    	
        return map.get(key);
    }
     
    public void put(String key, Object value){
        map.put(key, value);
    }
     
    public Object remove(String key){
        return map.remove(key);
    }
     
    public boolean containsKey(String key){
        return map.containsKey(key);
    }
     
    public boolean containsValue(Object value){
        return map.containsValue(value);
    }
     
    public void clear(){
        map.clear();
    }
     
    public Set<Entry<String, Object>> entrySet(){
        return map.entrySet();
    }
     
    public Set<String> keySet(){
        return map.keySet();
    }
     
    public boolean isEmpty(){
        return map.isEmpty();
    }
     
    public void putAll(Map<? extends String, ?extends Object> m){
        map.putAll(m);
    }
     
    public Map<String,Object> getMap(){
		for(String key : this.keySet()){
    		if(map.get(key) != null && map.get(key).getClass().getName().contains("String")){
    			if(!map.get(key).getClass().isArray()){
    				this.put(key,  cleanXSS(map.get(key).toString()));
    			}
    		}
     	}        		
	    	
        return map;
    }
    
    

    public Map<String,Object> getMap(HttpServletRequest request){
    	
		for(String key : this.keySet()){
    		if(map.get(key) != null && map.get(key).getClass().getName().contains("String")){
    			if(!map.get(key).getClass().isArray()){
    				this.put(key,  cleanXSS(map.get(key).toString()));
    			}
    		}
     	}
		if(request.getSession().getAttribute("LoginType") != null){
	    	this.put("USERID", request.getSession().getAttribute("USERID").toString());
	    	this.put("CarNo", request.getSession().getAttribute("CarNo").toString());    	
	    	this.put("OutNo", request.getSession().getAttribute("OutNo").toString());
	    	this.put("LoginType", request.getSession().getAttribute("LoginType").toString());
	    	this.put("MOB_NUMBER", request.getSession().getAttribute("USERID").toString());
	    	this.put("CustCd", request.getSession().getAttribute("CustCd").toString());
		}
        return map;
    }    
    
    
    public String cleanXSS(String value) {
        //You'll need to remove the spaces from the html entities below
    	value = value.replaceAll("%3C", "&lt;").replaceAll("%3E", "&gt;");
    	value = value.replaceAll("%3c", "&lt;").replaceAll("%3e", "&gt;");    	
		value = value.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
		value = value.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
		value = value.replaceAll("'", "&#39;");
		value = value.replaceAll("eval\\((.*)\\)", "");
		value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
		value = value.replaceAll("script", "");
		return value;
    }
    
    public Map<String,Object> getMap2(String UId, String FName, String Type, String Val){
    	this.put("UID", UId);
    	this.put("FNAME", FName);
    	this.put("TYPE", Type);
    	this.put("VAL", Val);

        return map;
    }

    public String convertVal(){
    	String str = new String();
    	
    	for(Map.Entry<String, Object> entry : map.entrySet()){
    		if(entry.getKey().equals("url"))
    			continue;
    		if(!str.isEmpty())
    			str += "||";
    		str += entry.getValue();
    	}
    	
    	return str;
    }
    
}