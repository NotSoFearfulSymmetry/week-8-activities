package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Paths{

	@JsonProperty("/pet")
	private Pet pet;

	@JsonProperty("/user/{username}")
	private UserUsername userUsername;

	@JsonProperty("/pet/findByStatus")
	private PetFindByStatus petFindByStatus;

	@JsonProperty("/user/createWithList")
	private UserCreateWithList userCreateWithList;

	@JsonProperty("/pet/{petId}/uploadImage")
	private PetPetIdUploadImage petPetIdUploadImage;

	@JsonProperty("/store/inventory")
	private StoreInventory storeInventory;

	@JsonProperty("/user/login")
	private UserLogin userLogin;

	@JsonProperty("/user")
	private User user;

	@JsonProperty("/user/createWithArray")
	private UserCreateWithArray userCreateWithArray;

	@JsonProperty("/pet/findByTags")
	private PetFindByTags petFindByTags;

	@JsonProperty("/store/order")
	private StoreOrder storeOrder;

	@JsonProperty("/user/logout")
	private UserLogout userLogout;

	@JsonProperty("/pet/{petId}")
	private PetPetId petPetId;

	@JsonProperty("/store/order/{orderId}")
	private StoreOrderOrderId storeOrderOrderId;

	public void setPet(Pet pet){
		this.pet = pet;
	}

	public Pet getPet(){
		return pet;
	}

	public void setUserUsername(UserUsername userUsername){
		this.userUsername = userUsername;
	}

	public UserUsername getUserUsername(){
		return userUsername;
	}

	public void setPetFindByStatus(PetFindByStatus petFindByStatus){
		this.petFindByStatus = petFindByStatus;
	}

	public PetFindByStatus getPetFindByStatus(){
		return petFindByStatus;
	}

	public void setUserCreateWithList(UserCreateWithList userCreateWithList){
		this.userCreateWithList = userCreateWithList;
	}

	public UserCreateWithList getUserCreateWithList(){
		return userCreateWithList;
	}

	public void setPetPetIdUploadImage(PetPetIdUploadImage petPetIdUploadImage){
		this.petPetIdUploadImage = petPetIdUploadImage;
	}

	public PetPetIdUploadImage getPetPetIdUploadImage(){
		return petPetIdUploadImage;
	}

	public void setStoreInventory(StoreInventory storeInventory){
		this.storeInventory = storeInventory;
	}

	public StoreInventory getStoreInventory(){
		return storeInventory;
	}

	public void setUserLogin(UserLogin userLogin){
		this.userLogin = userLogin;
	}

	public UserLogin getUserLogin(){
		return userLogin;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setUserCreateWithArray(UserCreateWithArray userCreateWithArray){
		this.userCreateWithArray = userCreateWithArray;
	}

	public UserCreateWithArray getUserCreateWithArray(){
		return userCreateWithArray;
	}

	public void setPetFindByTags(PetFindByTags petFindByTags){
		this.petFindByTags = petFindByTags;
	}

	public PetFindByTags getPetFindByTags(){
		return petFindByTags;
	}

	public void setStoreOrder(StoreOrder storeOrder){
		this.storeOrder = storeOrder;
	}

	public StoreOrder getStoreOrder(){
		return storeOrder;
	}

	public void setUserLogout(UserLogout userLogout){
		this.userLogout = userLogout;
	}

	public UserLogout getUserLogout(){
		return userLogout;
	}

	public void setPetPetId(PetPetId petPetId){
		this.petPetId = petPetId;
	}

	public PetPetId getPetPetId(){
		return petPetId;
	}

	public void setStoreOrderOrderId(StoreOrderOrderId storeOrderOrderId){
		this.storeOrderOrderId = storeOrderOrderId;
	}

	public StoreOrderOrderId getStoreOrderOrderId(){
		return storeOrderOrderId;
	}

	@Override
 	public String toString(){
		return 
			"Paths{" + 
			"/pet = '" + pet + '\'' + 
			",/user/{username} = '" + userUsername + '\'' + 
			",/pet/findByStatus = '" + petFindByStatus + '\'' + 
			",/user/createWithList = '" + userCreateWithList + '\'' + 
			",/pet/{petId}/uploadImage = '" + petPetIdUploadImage + '\'' + 
			",/store/inventory = '" + storeInventory + '\'' + 
			",/user/login = '" + userLogin + '\'' + 
			",/user = '" + user + '\'' + 
			",/user/createWithArray = '" + userCreateWithArray + '\'' + 
			",/pet/findByTags = '" + petFindByTags + '\'' + 
			",/store/order = '" + storeOrder + '\'' + 
			",/user/logout = '" + userLogout + '\'' + 
			",/pet/{petId} = '" + petPetId + '\'' + 
			",/store/order/{orderId} = '" + storeOrderOrderId + '\'' + 
			"}";
		}
}