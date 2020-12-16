package edu.matc.entity.zipCodeInfo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ZipCode{

	@JsonProperty("lng")
	private double lng;

	@JsonProperty("city")
	private String city;

	@JsonProperty("timezone")
	private Timezone timezone;

	@JsonProperty("acceptable_city_names")
	private List<AcceptableCityNamesItem> acceptableCityNames;

	@JsonProperty("area_codes")
	private List<Integer> areaCodes;

	@JsonProperty("state")
	private String state;

	@JsonProperty("zip_code")
	private String zipCode;

	@JsonProperty("lat")
	private double lat;

	public void setLng(double lng){
		this.lng = lng;
	}

	public double getLng(){
		return lng;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setTimezone(Timezone timezone){
		this.timezone = timezone;
	}

	public Timezone getTimezone(){
		return timezone;
	}

	public void setAcceptableCityNames(List<AcceptableCityNamesItem> acceptableCityNames){
		this.acceptableCityNames = acceptableCityNames;
	}

	public List<AcceptableCityNamesItem> getAcceptableCityNames(){
		return acceptableCityNames;
	}

	public void setAreaCodes(List<Integer> areaCodes){
		this.areaCodes = areaCodes;
	}

	public List<Integer> getAreaCodes(){
		return areaCodes;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}

	public String getZipCode(){
		return zipCode;
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
			"ZipCode{" + 
			"lng = '" + lng + '\'' + 
			",city = '" + city + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",acceptable_city_names = '" + acceptableCityNames + '\'' + 
			",area_codes = '" + areaCodes + '\'' + 
			",state = '" + state + '\'' + 
			",zip_code = '" + zipCode + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}