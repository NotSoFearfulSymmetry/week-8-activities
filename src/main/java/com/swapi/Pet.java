package com.swapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pet{

	@JsonProperty("xml")
	private Xml xml;

	@JsonProperty("type")
	private String type;

	@JsonProperty("required")
	private List<String> required;

	@JsonProperty("properties")
	private Properties properties;

	@JsonProperty("post")
	private Post post;

	@JsonProperty("put")
	private Put put;

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

	public void setRequired(List<String> required){
		this.required = required;
	}

	public List<String> getRequired(){
		return required;
	}

	public void setProperties(Properties properties){
		this.properties = properties;
	}

	public Properties getProperties(){
		return properties;
	}

	public void setPost(Post post){
		this.post = post;
	}

	public Post getPost(){
		return post;
	}

	public void setPut(Put put){
		this.put = put;
	}

	public Put getPut(){
		return put;
	}

	@Override
 	public String toString(){
		return 
			"Pet{" + 
			"xml = '" + xml + '\'' + 
			",type = '" + type + '\'' + 
			",required = '" + required + '\'' + 
			",properties = '" + properties + '\'' + 
			",post = '" + post + '\'' + 
			",put = '" + put + '\'' + 
			"}";
		}
}