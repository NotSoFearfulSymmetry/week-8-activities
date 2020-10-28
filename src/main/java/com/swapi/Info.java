package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info{

	@JsonProperty("license")
	private License license;

	@JsonProperty("contact")
	private Contact contact;

	@JsonProperty("description")
	private String description;

	@JsonProperty("termsOfService")
	private String termsOfService;

	@JsonProperty("title")
	private String title;

	@JsonProperty("version")
	private String version;

	public void setLicense(License license){
		this.license = license;
	}

	public License getLicense(){
		return license;
	}

	public void setContact(Contact contact){
		this.contact = contact;
	}

	public Contact getContact(){
		return contact;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTermsOfService(String termsOfService){
		this.termsOfService = termsOfService;
	}

	public String getTermsOfService(){
		return termsOfService;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	@Override
 	public String toString(){
		return 
			"Info{" + 
			"license = '" + license + '\'' + 
			",contact = '" + contact + '\'' + 
			",description = '" + description + '\'' + 
			",termsOfService = '" + termsOfService + '\'' + 
			",title = '" + title + '\'' + 
			",version = '" + version + '\'' + 
			"}";
		}
}