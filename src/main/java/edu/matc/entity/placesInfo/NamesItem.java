package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Names item.
 */
public class NamesItem{

	@JsonProperty("nameLocale")
	private String nameLocale;

	@JsonProperty("name")
	private String name;

	/**
	 * Set name locale.
	 *
	 * @param nameLocale the name locale
	 */
	public void setNameLocale(String nameLocale){
		this.nameLocale = nameLocale;
	}

	/**
	 * Get name locale string.
	 *
	 * @return the string
	 */
	public String getNameLocale(){
		return nameLocale;
	}

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"NamesItem{" + 
			"nameLocale = '" + nameLocale + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}