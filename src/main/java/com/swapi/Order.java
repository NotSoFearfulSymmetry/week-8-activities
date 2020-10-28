package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order{

	@JsonProperty("xml")
	private Xml xml;

	@JsonProperty("type")
	private String type;

	@JsonProperty("properties")
	private Properties properties;

	public void setXml(Xml xml){
		this.xml = xml;
	}

	public Xml getXml(){
		return xml;
	}

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
			"Order{" + 
			"xml = '" + xml + '\'' + 
			",type = '" + type + '\'' + 
			",properties = '" + properties + '\'' + 
			"}";
		}
}