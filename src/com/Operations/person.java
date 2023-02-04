package com.Operations;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class person {
	
	@Id
	int id;
	String name;
	
	public person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public person() {
		super();
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	

}
