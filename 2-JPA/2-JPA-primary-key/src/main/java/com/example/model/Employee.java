package com.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLOYEES", schema = "emp_db")
public class Employee {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "E_ID")
//	private int id;

	@EmbeddedId
	private EmpId id;

	@Column(name = "E_NAME")
	private String name;
	private double salary;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private LocalDate dob;
	private LocalDateTime joinDate;
	@Lob
	private String profile;
	@Lob
	private byte[] pic;

	public LocalDateTime getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDateTime joinDate) {
		this.joinDate = joinDate;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public EmpId getId() {
		return id;
	}

	public void setId(EmpId id) {
		this.id = id;
	}

	public String getProfile() {
		return profile;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
