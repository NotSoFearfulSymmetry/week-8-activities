package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User{

	@JsonProperty("xml")
	private Xml xml;

	@JsonProperty("type")
	private String type;

	@JsonProperty("properties")
	private Properties properties;

	@JsonProperty("post")
	private Post post;

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

	public void setPost(Post post){
		this.post = post;
	}

	public Post getPost(){
		return post;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"xml = '" + xml + '\'' + 
			",type = '" + type + '\'' + 
			",properties = '" + properties + '\'' + 
			",post = '" + post + '\'' + 
			"}";
		}
}