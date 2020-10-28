package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PetstoreAuth{

	@JsonProperty("authorizationUrl")
	private String authorizationUrl;

	@JsonProperty("scopes")
	private Scopes scopes;

	@JsonProperty("type")
	private String type;

	@JsonProperty("flow")
	private String flow;

	public void setAuthorizationUrl(String authorizationUrl){
		this.authorizationUrl = authorizationUrl;
	}

	public String getAuthorizationUrl(){
		return authorizationUrl;
	}

	public void setScopes(Scopes scopes){
		this.scopes = scopes;
	}

	public Scopes getScopes(){
		return scopes;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setFlow(String flow){
		this.flow = flow;
	}

	public String getFlow(){
		return flow;
	}

	@Override
 	public String toString(){
		return 
			"PetstoreAuth{" + 
			"authorizationUrl = '" + authorizationUrl + '\'' + 
			",scopes = '" + scopes + '\'' + 
			",type = '" + type + '\'' + 
			",flow = '" + flow + '\'' + 
			"}";
		}
}