package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalDocs{

	@JsonProperty("description")
	private String description;

	@JsonProperty("url")
	private String url;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"ExternalDocs{" + 
			"description = '" + description + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}