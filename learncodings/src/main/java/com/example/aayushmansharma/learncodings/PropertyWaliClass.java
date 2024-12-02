package com.example.aayushmansharma.learncodings;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class PropertyWaliClass {
    @Id
    private int id;
    private String newsType;
    private String description;
    private String location;
    
    @NotNull(message = "News By cannot be null")
    private String newsBy;
	
	
	public PropertyWaliClass(int id, String newsType, String description, String location, String newsBy) {
		super();
		this.id = id;
		this.newsType = newsType;
		this.description = description;
		this.location = location;
		this.newsBy = newsBy;
	}
	
	
	public PropertyWaliClass() {
		super();
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNewsType() {
		return newsType;
	}
	
	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getNewsBy() {
		return newsBy;
	}
	
	public void setNewsBy(String newsBy) {
		this.newsBy = newsBy;
	}
	
	
	

}
