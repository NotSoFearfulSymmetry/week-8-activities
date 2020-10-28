package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StoreOrderOrderId{

	@JsonProperty("get")
	private Get get;

	@JsonProperty("delete")
	private Delete delete;

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
			"StoreOrderOrderId{" + 
			"get = '" + get + '\'' + 
			",delete = '" + delete + '\'' + 
			"}";
		}
}