package com.poscoict.emaillist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poscoict.emaillist.repository.EmaillistRepository;
import com.poscoict.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController {
	@Autowired
	private EmaillistRepository emaillistRepository;

	@RequestMapping("")
	public String index(Model model) {
		System.out.println(emaillistRepository);
		List<EmaillistVo> list = new EmaillistRepository().findAll();
		model.addAttribute("list",list);
		
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "/WEB-INF/views/form.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(EmaillistVo vo) {
		System.out.println(vo);
		emaillistRepository.insert(vo);
		return "redirect:/";
	}
}
