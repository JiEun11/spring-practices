package com.poscoict.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	
	@RequestMapping("/hello") 
	//요청 url을 이 메소드에 매핑한다. 요청 들어오면 이 메소드가 실행된다.
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
}
