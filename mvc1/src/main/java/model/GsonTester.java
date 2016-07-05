package model;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTester {
	
	Gson gson = new Gson();
	
	public String createGson(Dog dog){
		String json="";
		System.out.println("this is dog: "+gson.toJson(dog));
		return json;
	}

	
	public String createArrayGson(Map<String, List<Dog>>  map){
		String json="";
		
		System.out.println("this is array:"+gson.toJson(map));
		return json;
		
	}
}
