package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tags{

	@JsonProperty("xml")
	private Xml xml;

	@JsonProperty("type")
	private String type;

	@JsonProperty("items")
	private Items items;

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

	public void setItems(Items items){
		this.items = items;
	}

	public Items getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"Tags{" + 
			"xml = '" + xml + '\'' + 
			",type = '" + type + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}