package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Name{

	@JsonProperty("type")
	private String type;

	@JsonProperty("example")
	private String example;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setExample(String example){
		this.example = example;
	}

	public String getExample(){
		return example;
	}

	@Override
 	public String toString(){
		return 
			"Name{" + 
			"type = '" + type + '\'' + 
			",example = '" + example + '\'' + 
			"}";
		}
}