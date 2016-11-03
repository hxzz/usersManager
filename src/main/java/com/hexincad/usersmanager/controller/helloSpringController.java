package com.hexincad.usersmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class helloSpringController {
	String message = "欢迎使用合新智造开发的在线建模系统";
			
	@RequestMapping("/system/{jobID}")
	public String showMessage(@PathVariable("jobID") String jobID,Model model){
	//去数据库读取相应的模型操作

	model.addAttribute("message", message);
	model.addAttribute("jobID", jobID);
/*	ModelAndView mv = new ModelAndView("/modeling/modeling");
	mv.addObject("message",message);
	mv.addObject("jobID",jobID);*/
	return "/modeling/modeling";
	}
}
