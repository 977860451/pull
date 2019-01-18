package com.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExecptionHandler {
@ExceptionHandler
public Object handler(HttpServletRequest req,HttpServletResponse rep,Exception ex){
	ex.printStackTrace();
	ModelAndView mod=new ModelAndView();
	mod.addObject("url",req.getRequestURL());
	mod.setViewName("/error");
	return mod;
	
}
}
