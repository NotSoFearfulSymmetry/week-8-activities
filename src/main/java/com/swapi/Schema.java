package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Schema{

	@JsonProperty("$ref")
	private String ref;

	public void setRef(String ref){
		this.ref = ref;
	}

	public String getRef(){
		return ref;
	}

	@Override
 	public String toString(){
		return 
			"Schema{" + 
			"$ref = '" + ref + '\'' + 
			"}";
		}
}