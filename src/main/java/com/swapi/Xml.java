package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Xml{

	@JsonProperty("name")
	private String name;

	@JsonProperty("wrapped")
	private boolean wrapped;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setWrapped(boolean wrapped){
		this.wrapped = wrapped;
	}

	public boolean isWrapped(){
		return wrapped;
	}

	@Override
 	public String toString(){
		return 
			"Xml{" + 
			"name = '" + name + '\'' + 
			",wrapped = '" + wrapped + '\'' + 
			"}";
		}
}