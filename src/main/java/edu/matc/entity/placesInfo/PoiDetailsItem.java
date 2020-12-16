package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Poi details item.
 */
public class PoiDetailsItem{

	@JsonProperty("id")
	private String id;

	@JsonProperty("sourceName")
	private String sourceName;

	/**
	 * Set id.
	 *
	 * @param id the id
	 */
	public void setId(String id){
		this.id = id;
	}

	/**
	 * Get id string.
	 *
	 * @return the string
	 */
	public String getId(){
		return id;
	}

	/**
	 * Set source name.
	 *
	 * @param sourceName the source name
	 */
	public void setSourceName(String sourceName){
		this.sourceName = sourceName;
	}

	/**
	 * Get source name string.
	 *
	 * @return the string
	 */
	public String getSourceName(){
		return sourceName;
	}

	@Override
 	public String toString(){
		return 
			"PoiDetailsItem{" + 
			"id = '" + id + '\'' + 
			",sourceName = '" + sourceName + '\'' + 
			"}";
		}
}