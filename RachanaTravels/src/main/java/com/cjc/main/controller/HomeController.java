package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.repository.HomeRepository;
import com.cjc.main.serviceI.HomeServiceI;

@RestController
public class HomeController {

	@Autowired
	HomeServiceI hsi;
	
	@GetMapping("/getdataRachana/{from}/{to}")
	public List getdataRachana(@PathVariable("from")String trfrom, @PathVariable("to")String trto)
	{
		List list=hsi.logincheck(trfrom, trto);
		return list;
		
	}
}
