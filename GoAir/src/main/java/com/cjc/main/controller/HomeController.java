package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.GoAir;

@RestController
public class HomeController {

	@RequestMapping("/goair")
	public List getDataGoAir()
	{
		GoAir ga=new GoAir();
		ga.setFlightno(701);
		ga.setFlightname("GoAir1");
		ga.setFlightarrivaltime("07.00 am");
		ga.setFlightdeparturetime("07.15 am");
		
		GoAir ga1=new GoAir();
		ga1.setFlightno(702);
		ga1.setFlightname("GoAir2");
		ga1.setFlightarrivaltime("10.00 am");
		ga1.setFlightdeparturetime("10.15 am");
		
		GoAir ga2=new GoAir();
		ga2.setFlightno(703);
		ga2.setFlightname("GoAir3");
		ga2.setFlightarrivaltime("01.00 pm");
		ga2.setFlightdeparturetime("01.15 pm");
		
		GoAir ga3=new GoAir();
		ga3.setFlightno(704);
		ga3.setFlightname("GoAir4");
		ga3.setFlightarrivaltime("03.00 pm");
		ga3.setFlightdeparturetime("03.15 pm");
		
		GoAir ga4=new GoAir();
		ga4.setFlightno(705);
		ga4.setFlightname("GoAir5");
		ga4.setFlightarrivaltime("05.00 pm");
		ga4.setFlightdeparturetime("05.15 pm");
		
		
		
		List al3=new ArrayList();
		al3.add(ga);
		al3.add(ga1);
		al3.add(ga2);
		al3.add(ga3);
		al3.add(ga4);
		
		return al3;
		
	}
}
