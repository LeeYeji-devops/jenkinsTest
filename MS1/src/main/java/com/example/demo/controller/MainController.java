package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/ms1/first")
	public String mainP() {
		List<String> list = new ArrayList<String>();
		list.add("test");
		list.add("test2");
		list.add("test3");
		return "main";
	}
}
