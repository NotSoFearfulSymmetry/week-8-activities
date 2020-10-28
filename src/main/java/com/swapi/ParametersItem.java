package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParametersItem{

	@JsonProperty("in")
	private String in;

	@JsonProperty("name")
	private String name;

	@JsonProperty("format")
	private String format;

	@JsonProperty("description")
	private String description;

	@JsonProperty("type")
	private String type;

	@JsonProperty("minimum")
	private int minimum;

	@JsonProperty("required")
	private boolean required;

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

	public void setFormat(String format){
		this.format = format;
	}

	public String getFormat(){
		return format;
	}

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

	public void setMinimum(int minimum){
		this.minimum = minimum;
	}

	public int getMinimum(){
		return minimum;
	}

	public void setRequired(boolean required){
		this.required = required;
	}

	public boolean isRequired(){
		return required;
	}

	@Override
 	public String toString(){
		return 
			"ParametersItem{" + 
			"in = '" + in + '\'' + 
			",name = '" + name + '\'' + 
			",format = '" + format + '\'' + 
			",description = '" + description + '\'' + 
			",type = '" + type + '\'' + 
			",minimum = '" + minimum + '\'' + 
			",required = '" + required + '\'' + 
			"}";
		}
}