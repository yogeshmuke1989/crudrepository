package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.AirIndia;

@Repository
public interface HomeRepository extends CrudRepository<AirIndia, Integer> {
public List findAllByFlfromAndFlto(String flfrom, String flto);

}
