package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Geo bias.
 */
public class GeoBias{

	@JsonProperty("lon")
	private double lon;

	@JsonProperty("lat")
	private double lat;

	/**
	 * Set lon.
	 *
	 * @param lon the lon
	 */
	public void setLon(double lon){
		this.lon = lon;
	}

	/**
	 * Get lon double.
	 *
	 * @return the double
	 */
	public double getLon(){
		return lon;
	}

	/**
	 * Set lat.
	 *
	 * @param lat the lat
	 */
	public void setLat(double lat){
		this.lat = lat;
	}

	/**
	 * Get lat double.
	 *
	 * @return the double
	 */
	public double getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"GeoBias{" + 
			"lon = '" + lon + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}