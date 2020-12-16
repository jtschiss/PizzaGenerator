package edu.matc.entity.zipCodeInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Acceptable city names item.
 */
public class AcceptableCityNamesItem{

	@JsonProperty("city")
	private String city;

	@JsonProperty("state")
	private String state;

	/**
	 * Set city.
	 *
	 * @param city the city
	 */
	public void setCity(String city){
		this.city = city;
	}

	/**
	 * Get city string.
	 *
	 * @return the string
	 */
	public String getCity(){
		return city;
	}

	/**
	 * Set state.
	 *
	 * @param state the state
	 */
	public void setState(String state){
		this.state = state;
	}

	/**
	 * Get state string.
	 *
	 * @return the string
	 */
	public String getState(){
		return state;
	}

	@Override
 	public String toString(){
		return 
			"AcceptableCityNamesItem{" + 
			"city = '" + city + '\'' + 
			",state = '" + state + '\'' + 
			"}";
		}
}