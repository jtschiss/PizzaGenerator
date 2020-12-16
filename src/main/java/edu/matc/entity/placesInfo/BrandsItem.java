package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandsItem{

	@JsonProperty("name")
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"BrandsItem{" + 
			"name = '" + name + '\'' + 
			"}";
		}
}