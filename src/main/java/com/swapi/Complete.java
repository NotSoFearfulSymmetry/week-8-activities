package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Complete{

	@JsonProperty("type")
	private String type;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"Complete{" + 
			"type = '" + type + '\'' + 
			"}";
		}
}