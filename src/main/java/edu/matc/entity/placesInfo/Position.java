package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position{

	@JsonProperty("lon")
	private double lon;

	@JsonProperty("lat")
	private double lat;

	public void setLon(double lon){
		this.lon = lon;
	}

	public double getLon(){
		return lon;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"Position{" + 
			"lon = '" + lon + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}