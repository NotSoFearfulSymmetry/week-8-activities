package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Id{

	@JsonProperty("format")
	private String format;

	@JsonProperty("type")
	private String type;

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
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
			"Id{" + 
			"format = '" + format + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}