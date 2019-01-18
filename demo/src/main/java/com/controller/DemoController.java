package com.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.JsonResult;
import com.pojo.Resource;
import com.pojo.User;

@RestController
@RequestMapping("/user")
public class DemoController {
	@Autowired Resource resource;
	@RequestMapping("/get")
public  JsonResult getUser(){
	User u = new User();
	u.setAge("11");
	u.setName("张三");
	u.setPsw("23");
	u.setDate(new Date());
	return  JsonResult.ok(u);
}
	@RequestMapping("/getResource")
	public  Resource getResource(){
		Resource u = new Resource();
		BeanUtils.copyProperties(resource, u);
		return  u;
	}	
}
