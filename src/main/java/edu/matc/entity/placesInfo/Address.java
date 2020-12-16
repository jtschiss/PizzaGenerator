package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address{

	@JsonProperty("extendedPostalCode")
	private String extendedPostalCode;

	@JsonProperty("country")
	private String country;

	@JsonProperty("countrySubdivisionName")
	private String countrySubdivisionName;

	@JsonProperty("countrySecondarySubdivision")
	private String countrySecondarySubdivision;

	@JsonProperty("streetNumber")
	private String streetNumber;

	@JsonProperty("postalCode")
	private String postalCode;

	@JsonProperty("municipality")
	private String municipality;

	@JsonProperty("countrySubdivision")
	private String countrySubdivision;

	@JsonProperty("localName")
	private String localName;

	@JsonProperty("streetName")
	private String streetName;

	@JsonProperty("countryCodeISO3")
	private String countryCodeISO3;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("freeformAddress")
	private String freeformAddress;

	@JsonProperty("countryTertiarySubdivision")
	private String countryTertiarySubdivision;

	public void setExtendedPostalCode(String extendedPostalCode){
		this.extendedPostalCode = extendedPostalCode;
	}

	public String getExtendedPostalCode(){
		return extendedPostalCode;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCountrySubdivisionName(String countrySubdivisionName){
		this.countrySubdivisionName = countrySubdivisionName;
	}

	public String getCountrySubdivisionName(){
		return countrySubdivisionName;
	}

	public void setCountrySecondarySubdivision(String countrySecondarySubdivision){
		this.countrySecondarySubdivision = countrySecondarySubdivision;
	}

	public String getCountrySecondarySubdivision(){
		return countrySecondarySubdivision;
	}

	public void setStreetNumber(String streetNumber){
		this.streetNumber = streetNumber;
	}

	public String getStreetNumber(){
		return streetNumber;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setMunicipality(String municipality){
		this.municipality = municipality;
	}

	public String getMunicipality(){
		return municipality;
	}

	public void setCountrySubdivision(String countrySubdivision){
		this.countrySubdivision = countrySubdivision;
	}

	public String getCountrySubdivision(){
		return countrySubdivision;
	}

	public void setLocalName(String localName){
		this.localName = localName;
	}

	public String getLocalName(){
		return localName;
	}

	public void setStreetName(String streetName){
		this.streetName = streetName;
	}

	public String getStreetName(){
		return streetName;
	}

	public void setCountryCodeISO3(String countryCodeISO3){
		this.countryCodeISO3 = countryCodeISO3;
	}

	public String getCountryCodeISO3(){
		return countryCodeISO3;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setFreeformAddress(String freeformAddress){
		this.freeformAddress = freeformAddress;
	}

	public String getFreeformAddress(){
		return freeformAddress;
	}

	public void setCountryTertiarySubdivision(String countryTertiarySubdivision){
		this.countryTertiarySubdivision = countryTertiarySubdivision;
	}

	public String getCountryTertiarySubdivision(){
		return countryTertiarySubdivision;
	}

	@Override
 	public String toString(){
		return 
			"Address{" + 
			"extendedPostalCode = '" + extendedPostalCode + '\'' + 
			",country = '" + country + '\'' + 
			",countrySubdivisionName = '" + countrySubdivisionName + '\'' + 
			",countrySecondarySubdivision = '" + countrySecondarySubdivision + '\'' + 
			",streetNumber = '" + streetNumber + '\'' + 
			",postalCode = '" + postalCode + '\'' + 
			",municipality = '" + municipality + '\'' + 
			",countrySubdivision = '" + countrySubdivision + '\'' + 
			",localName = '" + localName + '\'' + 
			",streetName = '" + streetName + '\'' + 
			",countryCodeISO3 = '" + countryCodeISO3 + '\'' + 
			",countryCode = '" + countryCode + '\'' + 
			",freeformAddress = '" + freeformAddress + '\'' + 
			",countryTertiarySubdivision = '" + countryTertiarySubdivision + '\'' + 
			"}";
		}
}