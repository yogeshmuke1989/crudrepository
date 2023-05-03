package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.ServiceI.HomeServiceI;

@RestController
public class HomeController {

	@Autowired
	HomeServiceI hsi;
	
	@GetMapping(value="/getData/{from}/{to}")
	public List getDataAirIndia(@PathVariable("from") String flfrom, @PathVariable("to") String flto)
	{
		List al=hsi.logincheck(flfrom, flto);
		
		return al;
		
	}
	
}
