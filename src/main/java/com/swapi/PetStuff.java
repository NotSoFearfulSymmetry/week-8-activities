package com.swapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PetStuff{

	@JsonProperty("basePath")
	private String basePath;

	@JsonProperty("paths")
	private Paths paths;

	@JsonProperty("host")
	private String host;

	@JsonProperty("schemes")
	private List<String> schemes;

	@JsonProperty("externalDocs")
	private ExternalDocs externalDocs;

	@JsonProperty("securityDefinitions")
	private SecurityDefinitions securityDefinitions;

	@JsonProperty("definitions")
	private Definitions definitions;

	@JsonProperty("swagger")
	private String swagger;

	@JsonProperty("info")
	private Info info;

	@JsonProperty("tags")
	private List<TagsItem> tags;

	public void setBasePath(String basePath){
		this.basePath = basePath;
	}

	public String getBasePath(){
		return basePath;
	}

	public void setPaths(Paths paths){
		this.paths = paths;
	}

	public Paths getPaths(){
		return paths;
	}

	public void setHost(String host){
		this.host = host;
	}

	public String getHost(){
		return host;
	}

	public void setSchemes(List<String> schemes){
		this.schemes = schemes;
	}

	public List<String> getSchemes(){
		return schemes;
	}

	public void setExternalDocs(ExternalDocs externalDocs){
		this.externalDocs = externalDocs;
	}

	public ExternalDocs getExternalDocs(){
		return externalDocs;
	}

	public void setSecurityDefinitions(SecurityDefinitions securityDefinitions){
		this.securityDefinitions = securityDefinitions;
	}

	public SecurityDefinitions getSecurityDefinitions(){
		return securityDefinitions;
	}

	public void setDefinitions(Definitions definitions){
		this.definitions = definitions;
	}

	public Definitions getDefinitions(){
		return definitions;
	}

	public void setSwagger(String swagger){
		this.swagger = swagger;
	}

	public String getSwagger(){
		return swagger;
	}

	public void setInfo(Info info){
		this.info = info;
	}

	public Info getInfo(){
		return info;
	}

	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	public List<TagsItem> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"PetStuff{" + 
			"basePath = '" + basePath + '\'' + 
			",paths = '" + paths + '\'' + 
			",host = '" + host + '\'' + 
			",schemes = '" + schemes + '\'' + 
			",externalDocs = '" + externalDocs + '\'' + 
			",securityDefinitions = '" + securityDefinitions + '\'' + 
			",definitions = '" + definitions + '\'' + 
			",swagger = '" + swagger + '\'' + 
			",info = '" + info + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}