package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

	//通过index去访问jsp
	@RequestMapping("/index")
	public String index(){
		
		return "index" ;
	}
	
	//  注释 || 
	@RequestMapping(value = {"/" , "/page"})
	public String page(){
		
		return "page" ;
	}
	
	@RequestMapping("/hello")
	public String hello(){
		
		return "hello" ;
	}
}
