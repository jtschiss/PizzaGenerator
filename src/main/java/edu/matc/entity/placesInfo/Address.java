package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Address.
 */
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

	/**
	 * Set extended postal code.
	 *
	 * @param extendedPostalCode the extended postal code
	 */
	public void setExtendedPostalCode(String extendedPostalCode){
		this.extendedPostalCode = extendedPostalCode;
	}

	/**
	 * Get extended postal code string.
	 *
	 * @return the string
	 */
	public String getExtendedPostalCode(){
		return extendedPostalCode;
	}

	/**
	 * Set country.
	 *
	 * @param country the country
	 */
	public void setCountry(String country){
		this.country = country;
	}

	/**
	 * Get country string.
	 *
	 * @return the string
	 */
	public String getCountry(){
		return country;
	}

	/**
	 * Set country subdivision name.
	 *
	 * @param countrySubdivisionName the country subdivision name
	 */
	public void setCountrySubdivisionName(String countrySubdivisionName){
		this.countrySubdivisionName = countrySubdivisionName;
	}

	/**
	 * Get country subdivision name string.
	 *
	 * @return the string
	 */
	public String getCountrySubdivisionName(){
		return countrySubdivisionName;
	}

	/**
	 * Set country secondary subdivision.
	 *
	 * @param countrySecondarySubdivision the country secondary subdivision
	 */
	public void setCountrySecondarySubdivision(String countrySecondarySubdivision){
		this.countrySecondarySubdivision = countrySecondarySubdivision;
	}

	/**
	 * Get country secondary subdivision string.
	 *
	 * @return the string
	 */
	public String getCountrySecondarySubdivision(){
		return countrySecondarySubdivision;
	}

	/**
	 * Set street number.
	 *
	 * @param streetNumber the street number
	 */
	public void setStreetNumber(String streetNumber){
		this.streetNumber = streetNumber;
	}

	/**
	 * Get street number string.
	 *
	 * @return the string
	 */
	public String getStreetNumber(){
		return streetNumber;
	}

	/**
	 * Set postal code.
	 *
	 * @param postalCode the postal code
	 */
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	/**
	 * Get postal code string.
	 *
	 * @return the string
	 */
	public String getPostalCode(){
		return postalCode;
	}

	/**
	 * Set municipality.
	 *
	 * @param municipality the municipality
	 */
	public void setMunicipality(String municipality){
		this.municipality = municipality;
	}

	/**
	 * Get municipality string.
	 *
	 * @return the string
	 */
	public String getMunicipality(){
		return municipality;
	}

	/**
	 * Set country subdivision.
	 *
	 * @param countrySubdivision the country subdivision
	 */
	public void setCountrySubdivision(String countrySubdivision){
		this.countrySubdivision = countrySubdivision;
	}

	/**
	 * Get country subdivision string.
	 *
	 * @return the string
	 */
	public String getCountrySubdivision(){
		return countrySubdivision;
	}

	/**
	 * Set local name.
	 *
	 * @param localName the local name
	 */
	public void setLocalName(String localName){
		this.localName = localName;
	}

	/**
	 * Get local name string.
	 *
	 * @return the string
	 */
	public String getLocalName(){
		return localName;
	}

	/**
	 * Set street name.
	 *
	 * @param streetName the street name
	 */
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}

	/**
	 * Get street name string.
	 *
	 * @return the string
	 */
	public String getStreetName(){
		return streetName;
	}

	/**
	 * Set country code iso 3.
	 *
	 * @param countryCodeISO3 the country code iso 3
	 */
	public void setCountryCodeISO3(String countryCodeISO3){
		this.countryCodeISO3 = countryCodeISO3;
	}

	/**
	 * Get country code iso 3 string.
	 *
	 * @return the string
	 */
	public String getCountryCodeISO3(){
		return countryCodeISO3;
	}

	/**
	 * Set country code.
	 *
	 * @param countryCode the country code
	 */
	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	/**
	 * Get country code string.
	 *
	 * @return the string
	 */
	public String getCountryCode(){
		return countryCode;
	}

	/**
	 * Set freeform address.
	 *
	 * @param freeformAddress the freeform address
	 */
	public void setFreeformAddress(String freeformAddress){
		this.freeformAddress = freeformAddress;
	}

	/**
	 * Get freeform address string.
	 *
	 * @return the string
	 */
	public String getFreeformAddress(){
		return freeformAddress;
	}

	/**
	 * Set country tertiary subdivision.
	 *
	 * @param countryTertiarySubdivision the country tertiary subdivision
	 */
	public void setCountryTertiarySubdivision(String countryTertiarySubdivision){
		this.countryTertiarySubdivision = countryTertiarySubdivision;
	}

	/**
	 * Get country tertiary subdivision string.
	 *
	 * @return the string
	 */
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