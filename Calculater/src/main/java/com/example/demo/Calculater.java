package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculater {
	@GetMapping("{operation}/{a}/{b}/{c}/{d}")
	int calculation(@PathVariable String operation, @PathVariable int a, @PathVariable int b,@PathVariable int c,@PathVariable int d) {
		if (operation.equals("add")) {
			return a + b + c + d;
		}
		if (operation.equals("sub")) {
			return a - b - c - d;
		}
		if (operation.equals("mul")) {
			return a * b;
		}
		if (operation.equals("div")) {
			return a / b / c / d;
		}
		return 0;
		
	}
}
