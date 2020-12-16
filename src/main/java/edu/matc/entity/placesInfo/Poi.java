package edu.matc.entity.placesInfo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Poi{

	@JsonProperty("classifications")
	private List<ClassificationsItem> classifications;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("name")
	private String name;

	@JsonProperty("categories")
	private List<String> categories;

	@JsonProperty("categorySet")
	private List<CategorySetItem> categorySet;

	@JsonProperty("brands")
	private List<BrandsItem> brands;

	@JsonProperty("url")
	private String url;

	public void setClassifications(List<ClassificationsItem> classifications){
		this.classifications = classifications;
	}

	public List<ClassificationsItem> getClassifications(){
		return classifications;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCategories(List<String> categories){
		this.categories = categories;
	}

	public List<String> getCategories(){
		return categories;
	}

	public void setCategorySet(List<CategorySetItem> categorySet){
		this.categorySet = categorySet;
	}

	public List<CategorySetItem> getCategorySet(){
		return categorySet;
	}

	public void setBrands(List<BrandsItem> brands){
		this.brands = brands;
	}

	public List<BrandsItem> getBrands(){
		return brands;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Poi{" + 
			"classifications = '" + classifications + '\'' + 
			",phone = '" + phone + '\'' + 
			",name = '" + name + '\'' + 
			",categories = '" + categories + '\'' + 
			",categorySet = '" + categorySet + '\'' + 
			",brands = '" + brands + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}