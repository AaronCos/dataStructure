package com.wcc.link;

public class MyLink {
	public static void main(String[] args) {
		LinkbList linklist = new LinkbList();
		linklist.insertData("aaron", 18);
	}

}
class Linkb{
	private String name;
	private int age;
	public Linkb next;
	public Linkb(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Linkb() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Linkb [name=" + name + ", age=" + age + ", next=" + next + "]";
	}
	
	
	
}

class LinkbList{
	private Linkb first;
	
	public void insertData(String a,int b){
		Linkb link = new Linkb(a,b);
		link.next = first;
		first = link;
		System.out.println("kkkk"+link.toString());
		
	}
	
	
	
	
	
	
}
