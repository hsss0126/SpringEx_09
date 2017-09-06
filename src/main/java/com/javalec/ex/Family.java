package com.javalec.ex;

public class Family {

	private String father;
	private String mother;
	private String brother;

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getBrother() {
		return brother;
	}

	public void setBrother(String brother) {
		this.brother = brother;
	}

	public void getFamilyInfo() {
		System.out.println("아빠 : "+ getFather());
		System.out.println("엄마 : "+ getMother());
		System.out.println("형 : "+ getBrother());
	}
}
