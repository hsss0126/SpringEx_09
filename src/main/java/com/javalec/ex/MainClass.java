package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");

		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();

		Family family = ctx.getBean("family", Family.class);
		family.getFamilyInfo();

		ctx.close();
	}
}
