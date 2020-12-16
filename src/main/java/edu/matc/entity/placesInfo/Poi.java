package edu.matc.entity.placesInfo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Poi.
 */
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

	/**
	 * Set classifications.
	 *
	 * @param classifications the classifications
	 */
	public void setClassifications(List<ClassificationsItem> classifications){
		this.classifications = classifications;
	}

	/**
	 * Get classifications list.
	 *
	 * @return the list
	 */
	public List<ClassificationsItem> getClassifications(){
		return classifications;
	}

	/**
	 * Set phone.
	 *
	 * @param phone the phone
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}

	/**
	 * Get phone string.
	 *
	 * @return the string
	 */
	public String getPhone(){
		return phone;
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

	/**
	 * Set categories.
	 *
	 * @param categories the categories
	 */
	public void setCategories(List<String> categories){
		this.categories = categories;
	}

	/**
	 * Get categories list.
	 *
	 * @return the list
	 */
	public List<String> getCategories(){
		return categories;
	}

	/**
	 * Set category set.
	 *
	 * @param categorySet the category set
	 */
	public void setCategorySet(List<CategorySetItem> categorySet){
		this.categorySet = categorySet;
	}

	/**
	 * Get category set list.
	 *
	 * @return the list
	 */
	public List<CategorySetItem> getCategorySet(){
		return categorySet;
	}

	/**
	 * Set brands.
	 *
	 * @param brands the brands
	 */
	public void setBrands(List<BrandsItem> brands){
		this.brands = brands;
	}

	/**
	 * Get brands list.
	 *
	 * @return the list
	 */
	public List<BrandsItem> getBrands(){
		return brands;
	}

	/**
	 * Set url.
	 *
	 * @param url the url
	 */
	public void setUrl(String url){
		this.url = url;
	}

	/**
	 * Get url string.
	 *
	 * @return the string
	 */
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