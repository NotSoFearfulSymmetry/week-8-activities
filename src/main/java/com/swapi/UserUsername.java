package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserUsername{

	@JsonProperty("get")
	private Get get;

	@JsonProperty("delete")
	private Delete delete;

	@JsonProperty("put")
	private Put put;

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

	public void setPut(Put put){
		this.put = put;
	}

	public Put getPut(){
		return put;
	}

	@Override
 	public String toString(){
		return 
			"UserUsername{" + 
			"get = '" + get + '\'' + 
			",delete = '" + delete + '\'' + 
			",put = '" + put + '\'' + 
			"}";
		}
}