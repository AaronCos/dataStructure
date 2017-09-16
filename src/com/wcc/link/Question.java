package com.wcc.link;

public class Question {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.pname());
	}

}
class Dog{
	private Dog hello;
	private String dname;
	
	public Dog pname(){
		return hello;
	}
}
class Shoe{
	private Dog dog;
	public Dog saydog(){
		return dog;
		
	}
	
	
}
