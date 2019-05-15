package com.mi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mi.service.HrEntryMainService;
import com.mi.vo.HrEntryMain;

@Controller
public class HrEntryMainController {

	@Autowired
	private HrEntryMainService hrEntryMainService;

	@ResponseBody
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello World!";
	}
	
	@ResponseBody
	@RequestMapping("/select")
	public HrEntryMain select(HttpServletRequest request,HttpServletResponse response) {
		String id = request.getParameter("id");
		HrEntryMain select = hrEntryMainService.select(id);
		return select;
	}
	
}

