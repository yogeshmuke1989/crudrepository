package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.repository.HomeRepository;
import com.cjc.main.serviceI.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{

	@Autowired
	HomeRepository hr;
	
	@Override
	public List logincheck(String trfrom, String trto) {
	List al1=hr.findAllByTrfromAndTrto(trfrom, trto);
			
			return al1;
	}

}
