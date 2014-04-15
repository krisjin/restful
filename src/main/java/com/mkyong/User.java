package com.mkyong;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author kris
 * 
 */
@XmlRootElement(name = "user")
public class User {

	private String name;
	private int age;
	private String sex;

	public User(String userName, int age, String sex) {
		this.name = userName;
		this.age = age;
		this.sex = sex;
	}

	public User() {
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@XmlElement
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
