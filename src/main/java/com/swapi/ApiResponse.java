package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse{

	@JsonProperty("type")
	private String type;

	@JsonProperty("properties")
	private Properties properties;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setProperties(Properties properties){
		this.properties = properties;
	}

	public Properties getProperties(){
		return properties;
	}

	@Override
 	public String toString(){
		return 
			"ApiResponse{" + 
			"type = '" + type + '\'' + 
			",properties = '" + properties + '\'' + 
			"}";
		}
}