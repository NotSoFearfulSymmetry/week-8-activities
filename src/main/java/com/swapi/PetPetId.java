package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PetPetId{

	@JsonProperty("post")
	private Post post;

	@JsonProperty("get")
	private Get get;

	@JsonProperty("delete")
	private Delete delete;

	public void setPost(Post post){
		this.post = post;
	}

	public Post getPost(){
		return post;
	}

	public void setGet(Get get){
		this.get = get;
	}

	public Get getGet(){
		return get;
	}

	public void setDelete(Delete delete){
		this.delete = delete;
	}

	public Delete getDelete(){
		return delete;
	}

	@Override
 	public String toString(){
		return 
			"PetPetId{" + 
			"post = '" + post + '\'' + 
			",get = '" + get + '\'' + 
			",delete = '" + delete + '\'' + 
			"}";
		}
}