package com.cjc.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.ServiceI.HomeServiceI;
import com.cjc.main.repository.HomeRepository;
@Service
public class HomeServiceImpl implements HomeServiceI
{
	@Autowired
	HomeRepository hr;
	
	@Override
	public List logincheck(String flfrom, String flto) {
		List al1=hr.findAllByFlfromAndFlto(flfrom, flto);
		return al1;
	}

}
