package com.example.aayushmansharma.learncodings;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class ServiceLayer {
	
	@Autowired
    private	JpaImport jpaImport;
	//get maping
	public List<PropertyWaliClass>getProperty(){

		return jpaImport.findAll();
	}
	
	//get mapping by id
	public Optional<PropertyWaliClass> getPropertybyId(int id){
		return jpaImport.findById(id);
	}
	//post mapping
	String addProperty( PropertyWaliClass propertyWaliClass) {
		 jpaImport.save(propertyWaliClass);
		 return "added successfully";
	}

}
