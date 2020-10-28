package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonMember200{

	@JsonProperty("schema")
	private Schema schema;

	@JsonProperty("description")
	private String description;

	@JsonProperty("headers")
	private Headers headers;

	public void setSchema(Schema schema){
		this.schema = schema;
	}

	public Schema getSchema(){
		return schema;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setHeaders(Headers headers){
		this.headers = headers;
	}

	public Headers getHeaders(){
		return headers;
	}

	@Override
 	public String toString(){
		return 
			"JsonMember200{" + 
			"schema = '" + schema + '\'' + 
			",description = '" + description + '\'' + 
			",headers = '" + headers + '\'' + 
			"}";
		}
}