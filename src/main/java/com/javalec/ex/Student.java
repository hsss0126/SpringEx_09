package com.javalec.ex;

public class Student {

	private String name;
	private double height;
	private double weight;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getStudentInfo() {
		System.out.println("이름: "+getName());
		System.out.println("키: "+getHeight());
		System.out.println("몸무게: "+getWeight());
		System.out.println("나이: "+getAge());
	}

}
