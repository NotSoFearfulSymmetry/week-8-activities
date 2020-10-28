package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PetFindByTags{

	@JsonProperty("get")
	private Get get;

	public void setGet(Get get){
		this.get = get;
	}

	public Get getGet(){
		return get;
	}

	@Override
 	public String toString(){
		return 
			"PetFindByTags{" + 
			"get = '" + get + '\'' + 
			"}";
		}
}