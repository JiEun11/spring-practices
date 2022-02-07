package com.poscoict.container.user;

public class User {

	private String name = "김지은";
	
	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
	
}
