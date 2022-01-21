package com.poscoict.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poscoict.guestbook.repository.GuestbookRepository;
import com.poscoict.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {
	
	@Autowired
	private GuestbookRepository guestbookrepository;
	
	@RequestMapping("")
	public String index(Model model) {
		System.out.println(guestbookrepository);
		List<GuestbookVo> list = new GuestbookRepository().findAll();
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(GuestbookVo vo) {
		new GuestbookRepository().insert(vo);
		System.out.println(vo);
		return "redirect:/";
	}
	
	@RequestMapping(value="/delete/{no}", method=RequestMethod.GET)
	public String deleteform(@PathVariable("no") int no, Model model ) {
		System.out.println(no);
		model.addAttribute("no", no);
		return "/WEB-INF/views/delete.jsp";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(int no, String password) {
		System.out.println();
		new GuestbookRepository().delete(no, password);
		return "redirect:/";
	}
}
