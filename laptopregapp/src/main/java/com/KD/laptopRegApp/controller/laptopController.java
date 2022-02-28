package com.KD.laptopRegApp.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.KD.laptopRegApp.service.laptopService;
import com.KD.laptopRegApp.common.*;;

/**
 * Handles requests for the application home page.
 */
@Controller
public class laptopController {

	@Resource(name = "laptopService")
	private laptopService laptopservice;

	private static final Logger logger = LoggerFactory.getLogger(laptopController.class);

	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public ModelAndView register(Locale locale, Model model, CommandMap commandMap, HttpServletResponse response, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("serial", request.getParameter("serial"));
		mv.setViewName("/register");
		return mv;
	}
	
	@RequestMapping(value = "/returnPage.do", method = RequestMethod.POST)
	public ModelAndView returnPage(Locale locale, Model model, CommandMap commandMap, HttpServletResponse response, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("serial", request.getParameter("serial"));
		mv.setViewName("/returnPage");
		return mv;
	}
	
	@RequestMapping(value = "/returnPageManual.do", method = RequestMethod.POST)
	public ModelAndView returnPage_Manual(Locale locale, Model model, CommandMap commandMap, HttpServletResponse response, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/returnPageManual");
		return mv;
	}
	
	@RequestMapping(value = "/registerCamera.do", method = RequestMethod.POST)
	public ModelAndView registerCamera(Locale locale, Model model, CommandMap commandMap, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/registerCamera");
		return mv;
	}
	
	@RequestMapping(value = "/returnCamera.do", method = RequestMethod.POST)
	public ModelAndView returnCamera(Locale locale, Model model, CommandMap commandMap, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/returnCamera");
		return mv;
	}
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model, CommandMap commandMap, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/main");
		return mv;
	}


	@RequestMapping(value = "/searchUser.do", method = RequestMethod.POST)
	@ResponseBody
	public List<Map<String, Object>> searchUser(@RequestParam Map<String, Object> map, ModelMap model) throws Exception {

		List<Map<String, Object>> list = laptopservice.selectUserInform(map);
		System.out.println(list);
		return list;
	}

	@RequestMapping(value = "/searchSerial.do", method = RequestMethod.POST)
	@ResponseBody
	public List<Map<String, Object>> searchSerial(@RequestParam Map<String, Object> map, ModelMap model) throws Exception {

		List<Map<String, Object>> list = laptopservice.selectSerial(map);
		System.out.println(list);
		return list;
	}	
	
	@RequestMapping(value = "/save.do", method = RequestMethod.POST)
	@ResponseBody
	public List<Map<String, Object>> save(@RequestParam Map<String, Object> map) throws Exception {
		List<Map<String, Object>> list = laptopservice.save(map);
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(value = "/returnlaptop.do", method = RequestMethod.POST)
	@ResponseBody
	public List<Map<String, Object>> returnlaptop(@RequestParam Map<String, Object> map) throws Exception {
		List<Map<String, Object>> list = laptopservice.returnlaptop(map);
		System.out.println(list);
		return list;
	}

		
}
