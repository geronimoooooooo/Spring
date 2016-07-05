package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Service
public class Dog {
	
	public Dog(){}
	public Dog(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String name;
	private int age;	
	private String color;
		
	private List<Dog> list_dogs;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<Dog> getList_dogs() {
		return list_dogs;
	}
	public void setList_dogs(List<Dog> list_dogs) {
		this.list_dogs = list_dogs;
	}
	
	
	
}
