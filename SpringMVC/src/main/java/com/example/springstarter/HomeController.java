package com.example.springstarter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController
{
	@RequestMapping("shiwani")
	public String home()
	{
		System.out.println("Welcome to TechnoServe");
		return "home.jsp";
	}

}
