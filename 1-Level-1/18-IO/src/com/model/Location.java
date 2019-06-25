package com.model;

import java.io.Serializable;

public class Location implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public Location(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}


}
