package com.fpoly.sd18306.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	
	@GetMapping("/productsManager")
	public String product() {
		
		return "/admin/qlsanpham";
	}
	
	@GetMapping("/add-productsManager")
	public String AddProduct() {
		
		return "/admin/qlsanpham";
	}
	
	@GetMapping("/add-productsManager")
	public String AddProductSave() {
		
		return "/admin/qlsanpham";
	}
}
