package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCreateWithList{

	@JsonProperty("post")
	private Post post;

	public void setPost(Post post){
		this.post = post;
	}

	public Post getPost(){
		return post;
	}

	@Override
 	public String toString(){
		return 
			"UserCreateWithList{" + 
			"post = '" + post + '\'' + 
			"}";
		}
}