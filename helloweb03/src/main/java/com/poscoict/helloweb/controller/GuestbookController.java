package com.poscoict.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *  @RequestMapping 클래스(타입) 단독 매핑 
 */

@Controller
@RequestMapping("/guestbook/*")	
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping("/guestbook/list")
	public String list() {
		// /guestbook/list 하면 이 핸들러 실행된다.
		return "GuestbookController.list()";
	}
	
	@ResponseBody
	@RequestMapping("/guestbook/delete")
	public String delete() {
		// /guestbook/delete 하면 이 핸들러 실행된다.
		return "GuestbookController.delete()";
	}
	
}
