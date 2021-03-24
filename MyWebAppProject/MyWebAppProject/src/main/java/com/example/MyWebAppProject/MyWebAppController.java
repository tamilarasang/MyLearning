package com.example.MyWebAppProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.models.MyObject;

@Controller
public class MyWebAppController {

	@RequestMapping("home")
	public Object home(@RequestParam("objName") String paramvalue) {
		System.out.println("print in console");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", paramvalue);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("objHome")
	public Object home(MyObject obj) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", obj);
		mv.setViewName("ObjHome");
		return mv;
	}
}
