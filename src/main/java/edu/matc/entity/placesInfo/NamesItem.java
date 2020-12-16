package edu.matc.entity.placesInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NamesItem{

	@JsonProperty("nameLocale")
	private String nameLocale;

	@JsonProperty("name")
	private String name;

	public void setNameLocale(String nameLocale){
		this.nameLocale = nameLocale;
	}

	public String getNameLocale(){
		return nameLocale;
	}

	public void setName(String name){
		this.name = name;
	}

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