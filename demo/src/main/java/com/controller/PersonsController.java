package com.controller;

import java.util.Date;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.JsonResult;
import com.pojo.Persons;
import com.service.PersonsMapperService;

@RestController
@RequestMapping("/person")
public class 	PersonsController {
	@Autowired
	PersonsMapperService  service;
	@Autowired
	Sid sid;
	@RequestMapping("/insert")
public  JsonResult insertUser(){
		Persons p = new Persons();
//		p.setId(888);
		p.setBirth(new Date());
		p.setEmail("22123@qq.com");
		p.setLastName(sid.nextShort());
		try {
			service.saveUser(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JsonResult.ok();
}
}
