package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Items{

	@JsonProperty("xml")
	private Xml xml;

	@JsonProperty("$ref")
	private String ref;

	@JsonProperty("type")
	private String type;

	public void setXml(Xml xml){
		this.xml = xml;
	}

	public Xml getXml(){
		return xml;
	}

	public void setRef(String ref){
		this.ref = ref;
	}

	public String getRef(){
		return ref;
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
			"Items{" + 
			"xml = '" + xml + '\'' + 
			",$ref = '" + ref + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}