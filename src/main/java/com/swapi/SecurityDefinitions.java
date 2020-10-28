package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SecurityDefinitions{

	@JsonProperty("petstore_auth")
	private PetstoreAuth petstoreAuth;

	@JsonProperty("api_key")
	private ApiKey apiKey;

	public void setPetstoreAuth(PetstoreAuth petstoreAuth){
		this.petstoreAuth = petstoreAuth;
	}

	public PetstoreAuth getPetstoreAuth(){
		return petstoreAuth;
	}

	public void setApiKey(ApiKey apiKey){
		this.apiKey = apiKey;
	}

	public ApiKey getApiKey(){
		return apiKey;
	}

	@Override
 	public String toString(){
		return 
			"SecurityDefinitions{" + 
			"petstore_auth = '" + petstoreAuth + '\'' + 
			",api_key = '" + apiKey + '\'' + 
			"}";
		}
}