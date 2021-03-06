package com.swapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Get{

	@JsonProperty("summary")
	private String summary;

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

	@JsonProperty("security")
	private List<SecurityItem> security;

	@JsonProperty("deprecated")
	private boolean deprecated;

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
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

	public void setSecurity(List<SecurityItem> security){
		this.security = security;
	}

	public List<SecurityItem> getSecurity(){
		return security;
	}

	public void setDeprecated(boolean deprecated){
		this.deprecated = deprecated;
	}

	public boolean isDeprecated(){
		return deprecated;
	}

	@Override
 	public String toString(){
		return 
			"Get{" + 
			"summary = '" + summary + '\'' + 
			",produces = '" + produces + '\'' + 
			",description = '" + description + '\'' + 
			",operationId = '" + operationId + '\'' + 
			",responses = '" + responses + '\'' + 
			",parameters = '" + parameters + '\'' + 
			",tags = '" + tags + '\'' + 
			",security = '" + security + '\'' + 
			",deprecated = '" + deprecated + '\'' + 
			"}";
		}
}