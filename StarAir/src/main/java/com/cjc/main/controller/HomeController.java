package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.StarAir;

@RestController
public class HomeController {

	@RequestMapping("/starair")
	public List getDataStarAir()
	{
		StarAir sa=new StarAir();
		sa.setFightno(601);
		sa.setFlightname("StarAir1");
		sa.setFlightarrivaltime("09.00 am");
		sa.setFlightdeparturetime("09.15 am");
		
		StarAir sa1=new StarAir();
		sa1.setFightno(602);
		sa1.setFlightname("StarAir2");
		sa1.setFlightarrivaltime("11.00 am");
		sa1.setFlightdeparturetime("11.15 am");
		
		StarAir sa2=new StarAir();
		sa2.setFightno(603);
		sa2.setFlightname("StarAir3");
		sa2.setFlightarrivaltime("03.00 pm");
		sa2.setFlightdeparturetime("03.15 pm");
		
		StarAir sa3=new StarAir();
		sa3.setFightno(604);
		sa3.setFlightname("StarAir4");
		sa3.setFlightarrivaltime("06.00 pm");
		sa3.setFlightdeparturetime("06.15 pm");
		
		StarAir sa4=new StarAir();
		sa4.setFightno(605);
		sa4.setFlightname("StarAir5");
		sa4.setFlightarrivaltime("08.00 pm");
		sa4.setFlightdeparturetime("08.15 pm");
		
		List al2=new ArrayList();
		al2.add(sa);
		al2.add(sa1);
		al2.add(sa2);
		al2.add(sa3);
		al2.add(sa4);
		
		return al2;
		
	}
}
