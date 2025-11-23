package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceIMPL;


@RestController
public class ControllerClass {
	
	@Autowired
	ServiceIMPL ser;
	
	@GetMapping("get")
	public String gettingHellow() {
		return ser.getMethoed() ;
	}
	
}
