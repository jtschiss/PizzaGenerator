package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EntryPointsItem{

	@JsonProperty("position")
	private Position position;

	@JsonProperty("type")
	private String type;

	public void setPosition(Position position){
		this.position = position;
	}

	public Position getPosition(){
		return position;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"EntryPointsItem{" + 
			"position = '" + position + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}