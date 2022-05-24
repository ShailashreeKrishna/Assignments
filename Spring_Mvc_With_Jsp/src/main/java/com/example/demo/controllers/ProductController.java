package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private Product entity;
	@Autowired
    private ProductRepository repos;


	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String initForm(Model model) {
		
		model.addAttribute("title","Product List");
		model.addAttribute("command", entity);
		
		return "addProduct";
	}
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Product entity) {
	
		int rowAdded;
		try {
			rowAdded = this.repos.add(entity);
			return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "failure";
		}
		
//		int rowAdded=this.repos.add(entity);
//		
//		return "addProduct";
	}
	
	@RequestMapping(value = "/product/srch",method = RequestMethod.GET)
	public String initSearchForm(Model model) {
	   
		
		model.addAttribute("title", "SearchProducts");
		
	   
		return "searchProduct";
	}

	@RequestMapping(value = "/product/srch",method = RequestMethod.POST)
	public String searchForm(@RequestParam("id")int id,Model model) {
	  
	
		Product entity = this.repos.findById(id);
		model.addAttribute("found", entity);
		return "showProduct";
	
		
	}
	@RequestMapping(value = "/product/delete",method = RequestMethod.GET)
	public String initDeleteForm(Model model) {
	   
		
		model.addAttribute("title", "DeleteProducts");
		
	   
		return "findProduct";
	}
		
	@RequestMapping(value = "/product/delete",method = RequestMethod.POST)
	public String deleteForm(@RequestParam("id")int id,Model model) {
	  
	
		int result = this.repos.remove(id);
		model.addAttribute("delete",result);
		return "deleteProduct";
	
		
	}
	
	@RequestMapping(value="/product/order",method=RequestMethod.GET)
	public String initIndexPage (Model model) {
		model.addAttribute("index","Product");
	      return "index";
	}

		
			
	}


