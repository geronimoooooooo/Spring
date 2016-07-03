package model;

public class Table {
	
	public Table(){}
	public Table(String name, int number){
		this.name = name;
		this.number = number;	
	}
	
	public String name;
	public int number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	


}
