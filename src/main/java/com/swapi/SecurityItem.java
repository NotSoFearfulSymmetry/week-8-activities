package com.swapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SecurityItem{

	@JsonProperty("petstore_auth")
	private List<String> petstoreAuth;

	public void setPetstoreAuth(List<String> petstoreAuth){
		this.petstoreAuth = petstoreAuth;
	}

	public List<String> getPetstoreAuth(){
		return petstoreAuth;
	}

	@Override
 	public String toString(){
		return 
			"SecurityItem{" + 
			"petstore_auth = '" + petstoreAuth + '\'' + 
			"}";
		}
}