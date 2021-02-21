package com.example.au.couchbasedemo.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.au.couchbasedemo.model.FootBall;
import com.example.au.couchbasedemo.model.Movie;


public interface FootBallRepository extends CrudRepository< FootBall, String> {
	
	FootBall findByCountryName(String country);
	Movie findByID(String id);	
	
}