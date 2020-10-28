package com.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Scopes{

	@JsonProperty("write:pets")
	private String writePets;

	@JsonProperty("read:pets")
	private String readPets;

	public void setWritePets(String writePets){
		this.writePets = writePets;
	}

	public String getWritePets(){
		return writePets;
	}

	public void setReadPets(String readPets){
		this.readPets = readPets;
	}

	public String getReadPets(){
		return readPets;
	}

	@Override
 	public String toString(){
		return 
			"Scopes{" + 
			"write:pets = '" + writePets + '\'' + 
			",read:pets = '" + readPets + '\'' + 
			"}";
		}
}