package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;


@RequestMapping("/mvc")
@Controller
public class WelcomeController {
	

	private ModelAndView modelview;
	private ProductRepository repos;//we can access method found in productrepository through autowired
	
	
	@Autowired
	public WelcomeController(ModelAndView modelview, ProductRepository repos) {
		super();
		this.modelview = modelview;
		this.repos = repos;
	}

	@RequestMapping(value="/first",method=RequestMethod.GET)
	public String getFirstPage() {
		return "welcome";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView getHomePage() {
		
		List<Product> prodList=repos.findAll();
		
		// modelview.addObject("msg","Mark List");//model=(key,value)
		 //key can be anything string,list of string etc

		 modelview.addObject("list",prodList);
		 modelview.setViewName("home");//view
		 
		 
		 
		 return modelview;
	}

}
