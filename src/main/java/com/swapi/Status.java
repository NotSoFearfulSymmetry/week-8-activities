package com.swapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Status{

	@JsonProperty("description")
	private String description;

	@JsonProperty("type")
	private String type;

	@JsonProperty("enum")
	private List<String> jsonMemberEnum;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setJsonMemberEnum(List<String> jsonMemberEnum){
		this.jsonMemberEnum = jsonMemberEnum;
	}

	public List<String> getJsonMemberEnum(){
		return jsonMemberEnum;
	}

	@Override
 	public String toString(){
		return 
			"Status{" + 
			"description = '" + description + '\'' + 
			",type = '" + type + '\'' + 
			",enum = '" + jsonMemberEnum + '\'' + 
			"}";
		}
}