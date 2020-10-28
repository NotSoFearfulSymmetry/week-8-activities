package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Responses{

	@JsonProperty("400")
	private JsonMember400 jsonMember400;

	@JsonProperty("404")
	private JsonMember404 jsonMember404;

	@JsonProperty("200")
	private JsonMember200 jsonMember200;

	@JsonProperty("405")
	private JsonMember405 jsonMember405;

	@JsonProperty("default")
	private JsonMemberDefault jsonMemberDefault;

	public void setJsonMember400(JsonMember400 jsonMember400){
		this.jsonMember400 = jsonMember400;
	}

	public JsonMember400 getJsonMember400(){
		return jsonMember400;
	}

	public void setJsonMember404(JsonMember404 jsonMember404){
		this.jsonMember404 = jsonMember404;
	}

	public JsonMember404 getJsonMember404(){
		return jsonMember404;
	}

	public void setJsonMember200(JsonMember200 jsonMember200){
		this.jsonMember200 = jsonMember200;
	}

	public JsonMember200 getJsonMember200(){
		return jsonMember200;
	}

	public void setJsonMember405(JsonMember405 jsonMember405){
		this.jsonMember405 = jsonMember405;
	}

	public JsonMember405 getJsonMember405(){
		return jsonMember405;
	}

	public void setJsonMemberDefault(JsonMemberDefault jsonMemberDefault){
		this.jsonMemberDefault = jsonMemberDefault;
	}

	public JsonMemberDefault getJsonMemberDefault(){
		return jsonMemberDefault;
	}

	@Override
 	public String toString(){
		return 
			"Responses{" + 
			"400 = '" + jsonMember400 + '\'' + 
			",404 = '" + jsonMember404 + '\'' + 
			",200 = '" + jsonMember200 + '\'' + 
			",405 = '" + jsonMember405 + '\'' + 
			",default = '" + jsonMemberDefault + '\'' + 
			"}";
		}
}