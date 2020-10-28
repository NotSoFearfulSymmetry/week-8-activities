package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Headers{

	@JsonProperty("X-Rate-Limit")
	private XRateLimit xRateLimit;

	@JsonProperty("X-Expires-After")
	private XExpiresAfter xExpiresAfter;

	public void setXRateLimit(XRateLimit xRateLimit){
		this.xRateLimit = xRateLimit;
	}

	public XRateLimit getXRateLimit(){
		return xRateLimit;
	}

	public void setXExpiresAfter(XExpiresAfter xExpiresAfter){
		this.xExpiresAfter = xExpiresAfter;
	}

	public XExpiresAfter getXExpiresAfter(){
		return xExpiresAfter;
	}

	@Override
 	public String toString(){
		return 
			"Headers{" + 
			"x-Rate-Limit = '" + xRateLimit + '\'' + 
			",x-Expires-After = '" + xExpiresAfter + '\'' + 
			"}";
		}
}