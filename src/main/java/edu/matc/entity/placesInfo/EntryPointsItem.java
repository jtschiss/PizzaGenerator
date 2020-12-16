package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Entry points item.
 */
public class EntryPointsItem{

	@JsonProperty("position")
	private Position position;

	@JsonProperty("type")
	private String type;

	/**
	 * Set position.
	 *
	 * @param position the position
	 */
	public void setPosition(Position position){
		this.position = position;
	}

	/**
	 * Get position position.
	 *
	 * @return the position
	 */
	public Position getPosition(){
		return position;
	}

	/**
	 * Set type.
	 *
	 * @param type the type
	 */
	public void setType(String type){
		this.type = type;
	}

	/**
	 * Get type string.
	 *
	 * @return the string
	 */
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