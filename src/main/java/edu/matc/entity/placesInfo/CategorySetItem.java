package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategorySetItem{

	@JsonProperty("id")
	private int id;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"CategorySetItem{" + 
			"id = '" + id + '\'' + 
			"}";
		}
}