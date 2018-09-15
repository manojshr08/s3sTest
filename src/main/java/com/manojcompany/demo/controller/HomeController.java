package com.manojcompany.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

	@GetMapping({"/home","/"})
	public String home(@RequestParam(name = "name", required = false, defaultValue))
}
