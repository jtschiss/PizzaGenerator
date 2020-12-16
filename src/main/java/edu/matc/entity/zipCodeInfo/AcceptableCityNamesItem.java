package edu.matc.entity.zipCodeInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcceptableCityNamesItem{

	@JsonProperty("city")
	private String city;

	@JsonProperty("state")
	private String state;

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setState(String state){
		this.state = state;
	}

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