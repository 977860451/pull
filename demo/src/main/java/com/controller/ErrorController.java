package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/err")
public class ErrorController {
	@RequestMapping("/get")
public  String getUser(){
	return  "/index";
}
}
