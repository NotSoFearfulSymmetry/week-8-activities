package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Definitions{

	@JsonProperty("Order")
	private Order order;

	@JsonProperty("Category")
	private Category category;

	@JsonProperty("User")
	private User user;

	@JsonProperty("Tag")
	private Tag tag;

	@JsonProperty("ApiResponse")
	private ApiResponse apiResponse;

	@JsonProperty("Pet")
	private Pet pet;

	public void setOrder(Order order){
		this.order = order;
	}

	public Order getOrder(){
		return order;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setTag(Tag tag){
		this.tag = tag;
	}

	public Tag getTag(){
		return tag;
	}

	public void setApiResponse(ApiResponse apiResponse){
		this.apiResponse = apiResponse;
	}

	public ApiResponse getApiResponse(){
		return apiResponse;
	}

	public void setPet(Pet pet){
		this.pet = pet;
	}

	public Pet getPet(){
		return pet;
	}

	@Override
 	public String toString(){
		return 
			"Definitions{" + 
			"order = '" + order + '\'' + 
			",category = '" + category + '\'' + 
			",user = '" + user + '\'' + 
			",tag = '" + tag + '\'' + 
			",apiResponse = '" + apiResponse + '\'' + 
			",pet = '" + pet + '\'' + 
			"}";
		}
}