package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact{

	@JsonProperty("email")
	private String email;

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"Contact{" + 
			"email = '" + email + '\'' + 
			"}";
		}
}