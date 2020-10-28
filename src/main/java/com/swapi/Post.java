package com.swapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Post{

	@JsonProperty("summary")
	private String summary;

	@JsonProperty("security")
	private List<SecurityItem> security;

	@JsonProperty("produces")
	private List<String> produces;

	@JsonProperty("description")
	private String description;

	@JsonProperty("operationId")
	private String operationId;

	@JsonProperty("responses")
	private Responses responses;

	@JsonProperty("parameters")
	private List<ParametersItem> parameters;

	@JsonProperty("tags")
	private List<String> tags;

	@JsonProperty("consumes")
	private List<String> consumes;

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setSecurity(List<SecurityItem> security){
		this.security = security;
	}

	public List<SecurityItem> getSecurity(){
		return security;
	}

	public void setProduces(List<String> produces){
		this.produces = produces;
	}

	public List<String> getProduces(){
		return produces;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setOperationId(String operationId){
		this.operationId = operationId;
	}

	public String getOperationId(){
		return operationId;
	}

	public void setResponses(Responses responses){
		this.responses = responses;
	}

	public Responses getResponses(){
		return responses;
	}

	public void setParameters(List<ParametersItem> parameters){
		this.parameters = parameters;
	}

	public List<ParametersItem> getParameters(){
		return parameters;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	public void setConsumes(List<String> consumes){
		this.consumes = consumes;
	}

	public List<String> getConsumes(){
		return consumes;
	}

	@Override
 	public String toString(){
		return 
			"Post{" + 
			"summary = '" + summary + '\'' + 
			",security = '" + security + '\'' + 
			",produces = '" + produces + '\'' + 
			",description = '" + description + '\'' + 
			",operationId = '" + operationId + '\'' + 
			",responses = '" + responses + '\'' + 
			",parameters = '" + parameters + '\'' + 
			",tags = '" + tags + '\'' + 
			",consumes = '" + consumes + '\'' + 
			"}";
		}
}