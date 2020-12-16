package edu.matc.entity.placesInfo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClassificationsItem{

	@JsonProperty("code")
	private String code;

	@JsonProperty("names")
	private List<NamesItem> names;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setNames(List<NamesItem> names){
		this.names = names;
	}

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