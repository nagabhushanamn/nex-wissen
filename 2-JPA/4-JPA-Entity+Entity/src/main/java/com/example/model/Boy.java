package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Boy {

	@Id
	private int id;
	private String name;

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	//@JoinColumn(name="g_id")
	@JoinTable(name="BOY_GIRL",
			  joinColumns= {@JoinColumn(name="b_id")},
			  inverseJoinColumns= {@JoinColumn(name="g_id")})	
	private Girl girl;

	public Girl getGirl() {
		return girl;
	}

	public void setGirl(Girl girl) {
		this.girl = girl;
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

}
