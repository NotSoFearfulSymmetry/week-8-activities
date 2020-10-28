package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties{

	@JsonProperty("photoUrls")
	private PhotoUrls photoUrls;

	@JsonProperty("name")
	private Name name;

	@JsonProperty("id")
	private Id id;

	@JsonProperty("category")
	private Category category;

	@JsonProperty("tags")
	private Tags tags;

	@JsonProperty("status")
	private Status status;

	@JsonProperty("code")
	private Code code;

	@JsonProperty("type")
	private Type type;

	@JsonProperty("message")
	private Message message;

	@JsonProperty("firstName")
	private FirstName firstName;

	@JsonProperty("lastName")
	private LastName lastName;

	@JsonProperty("password")
	private Password password;

	@JsonProperty("userStatus")
	private UserStatus userStatus;

	@JsonProperty("phone")
	private Phone phone;

	@JsonProperty("email")
	private Email email;

	@JsonProperty("username")
	private Username username;

	@JsonProperty("petId")
	private PetId petId;

	@JsonProperty("quantity")
	private Quantity quantity;

	@JsonProperty("shipDate")
	private ShipDate shipDate;

	@JsonProperty("complete")
	private Complete complete;

	public void setPhotoUrls(PhotoUrls photoUrls){
		this.photoUrls = photoUrls;
	}

	public PhotoUrls getPhotoUrls(){
		return photoUrls;
	}

	public void setName(Name name){
		this.name = name;
	}

	public Name getName(){
		return name;
	}

	public void setId(Id id){
		this.id = id;
	}

	public Id getId(){
		return id;
	}

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public void setTags(Tags tags){
		this.tags = tags;
	}

	public Tags getTags(){
		return tags;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	public void setCode(Code code){
		this.code = code;
	}

	public Code getCode(){
		return code;
	}

	public void setType(Type type){
		this.type = type;
	}

	public Type getType(){
		return type;
	}

	public void setMessage(Message message){
		this.message = message;
	}

	public Message getMessage(){
		return message;
	}

	public void setFirstName(FirstName firstName){
		this.firstName = firstName;
	}

	public FirstName getFirstName(){
		return firstName;
	}

	public void setLastName(LastName lastName){
		this.lastName = lastName;
	}

	public LastName getLastName(){
		return lastName;
	}

	public void setPassword(Password password){
		this.password = password;
	}

	public Password getPassword(){
		return password;
	}

	public void setUserStatus(UserStatus userStatus){
		this.userStatus = userStatus;
	}

	public UserStatus getUserStatus(){
		return userStatus;
	}

	public void setPhone(Phone phone){
		this.phone = phone;
	}

	public Phone getPhone(){
		return phone;
	}

	public void setEmail(Email email){
		this.email = email;
	}

	public Email getEmail(){
		return email;
	}

	public void setUsername(Username username){
		this.username = username;
	}

	public Username getUsername(){
		return username;
	}

	public void setPetId(PetId petId){
		this.petId = petId;
	}

	public PetId getPetId(){
		return petId;
	}

	public void setQuantity(Quantity quantity){
		this.quantity = quantity;
	}

	public Quantity getQuantity(){
		return quantity;
	}

	public void setShipDate(ShipDate shipDate){
		this.shipDate = shipDate;
	}

	public ShipDate getShipDate(){
		return shipDate;
	}

	public void setComplete(Complete complete){
		this.complete = complete;
	}

	public Complete getComplete(){
		return complete;
	}

	@Override
 	public String toString(){
		return 
			"Properties{" + 
			"photoUrls = '" + photoUrls + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",category = '" + category + '\'' + 
			",tags = '" + tags + '\'' + 
			",status = '" + status + '\'' + 
			",code = '" + code + '\'' + 
			",type = '" + type + '\'' + 
			",message = '" + message + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",password = '" + password + '\'' + 
			",userStatus = '" + userStatus + '\'' + 
			",phone = '" + phone + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			",petId = '" + petId + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",shipDate = '" + shipDate + '\'' + 
			",complete = '" + complete + '\'' + 
			"}";
		}
}