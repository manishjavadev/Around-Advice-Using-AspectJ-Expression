package com.manish.javadev.model;

public class CustomerBean {
	private int id;
	private String name;
	private int age;

	public CustomerBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public CustomerBean(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "CustomerBean [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
