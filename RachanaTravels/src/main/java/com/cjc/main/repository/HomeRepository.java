package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Rachana;

@Repository
public interface HomeRepository extends CrudRepository<Rachana,Integer>
{
	public List findAllByTrfromAndTrto(String trfrom, String trto);

}
