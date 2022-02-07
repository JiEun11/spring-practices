package com.poscoict.container.user;

public class User {

	private Long no = 0L;
	private String name = "김지은";
	
	public User() {
		
	}
	
	public User(String name) {
		this.name = name;
	}

	public User(String name, Long no) {
		this.name = name;
		this.no = no;
	}

	
	public void setNo(Long no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + "]";
	}

	
}