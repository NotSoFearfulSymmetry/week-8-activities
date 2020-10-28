package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiKey{

	@JsonProperty("in")
	private String in;

	@JsonProperty("name")
	private String name;

	@JsonProperty("type")
	private String type;

	public void setIn(String in){
		this.in = in;
	}

	public String getIn(){
		return in;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"ApiKey{" + 
			"in = '" + in + '\'' + 
			",name = '" + name + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}