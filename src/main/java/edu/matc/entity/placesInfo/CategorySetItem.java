package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Category set item.
 */
public class CategorySetItem{

	@JsonProperty("id")
	private int id;

	/**
	 * Set id.
	 *
	 * @param id the id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * Get id int.
	 *
	 * @return the int
	 */
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