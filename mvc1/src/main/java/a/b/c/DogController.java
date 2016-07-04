package a.b.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Dog;

@RestController
public class DogController {
	
	@Autowired
	Dog dog;
	
	@RequestMapping(value="dog")
	public Dog getDog(){
		dog.setAge(1);
		dog.setName("dog1");
		return dog;
		//returns {"name":"lenny1","age":1}
	}
	
	@RequestMapping(value="dogs")
	public Map<String, List<Dog>> getDogs(){
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		List<Dog> list_dogs = new ArrayList<Dog>();
		list_dogs.add(new Dog("dog1",1));
		list_dogs.add(new Dog("dog2",2));
		map.put("myArray", list_dogs);
		//return list_dogs; [{"name":"dog1","age":1},{"name":"dog2","age":2}]
		return map;		//{"myArray":[{"name":"dog1","age":1},{"name":"dog2","age":2}]}
	}
}
