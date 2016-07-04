package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Dog {
	
	public Dog(){}
	public Dog(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String name;
	public int age;
	
	private List<Dog> list_dogs = new ArrayList<Dog>();

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
	
	
	
}
