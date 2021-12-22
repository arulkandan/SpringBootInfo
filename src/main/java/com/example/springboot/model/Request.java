package com.example.springboot.model;

import io.swagger.annotations.ApiModelProperty;

public class Request {
	private String id;
	@ApiModelProperty(position = 1, required = true, value = "1")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@ApiModelProperty(position = 2, required = true, value = "Arul")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@ApiModelProperty(position = 3, required = true, value = "Chicago")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String name;
	private String location;
}
