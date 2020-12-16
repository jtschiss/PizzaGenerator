package edu.matc.entity.placesInfo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Classifications item.
 */
public class ClassificationsItem{

	@JsonProperty("code")
	private String code;

	@JsonProperty("names")
	private List<NamesItem> names;

	/**
	 * Set code.
	 *
	 * @param code the code
	 */
	public void setCode(String code){
		this.code = code;
	}

	/**
	 * Get code string.
	 *
	 * @return the string
	 */
	public String getCode(){
		return code;
	}

	/**
	 * Set names.
	 *
	 * @param names the names
	 */
	public void setNames(List<NamesItem> names){
		this.names = names;
	}

	/**
	 * Get names list.
	 *
	 * @return the list
	 */
	public List<NamesItem> getNames(){
		return names;
	}

	@Override
 	public String toString(){
		return 
			"ClassificationsItem{" + 
			"code = '" + code + '\'' + 
			",names = '" + names + '\'' + 
			"}";
		}
}