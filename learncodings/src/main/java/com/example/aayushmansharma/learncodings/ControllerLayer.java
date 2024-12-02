package com.example.aayushmansharma.learncodings;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class ControllerLayer {
	
	@Autowired
	private ServiceLayer serviceLayer;
	
	@GetMapping("/api/view")
	List<PropertyWaliClass>getProperty(){
		return serviceLayer.getProperty();
	}

	@GetMapping("api/view/{id}")
	Optional<PropertyWaliClass> getPropertybyID(@PathVariable int id){
		return serviceLayer.getPropertybyId(id);
		
		
	}
	
	
	@PostMapping("/api/add")
		String addProperty( @RequestBody @Valid PropertyWaliClass propertyWaliClass) {
		 serviceLayer.addProperty(propertyWaliClass);
		 return serviceLayer.addProperty(propertyWaliClass); 
			
		}
	
	
	}

