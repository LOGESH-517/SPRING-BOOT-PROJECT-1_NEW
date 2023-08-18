package com.example.demo.Day2.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
@Value("${var}")
private String name;
@GetMapping("name")
public String getName()
{
	return name;
}
}
