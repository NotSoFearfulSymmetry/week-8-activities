package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMemberDefault{

	@JsonProperty("description")
	private String description;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	@Override
 	public String toString(){
		return 
			"JsonMemberDefault{" + 
			"description = '" + description + '\'' + 
			"}";
		}
}