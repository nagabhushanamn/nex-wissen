package com.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLOYEES", schema = "emp_db")
public class Employee {

	@Id
	@Column(name = "E_ID")
	private int id;
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

	@ElementCollection
	@CollectionTable(name="EMP_ADDRESS",joinColumns= {@JoinColumn(name="E_ID")})
	private List<Address> addresses=new ArrayList<>();

//	@Embedded
//	private Address address;

//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name="street",column=@Column(name="o_street")),
//		@AttributeOverride(name="city",column=@Column(name="o_city")),
//		@AttributeOverride(name="country",column=@Column(name="o_country"))
//	})
//	private Address officeAddress;

//	public Address getOfficeAddress() {
//		return officeAddress;
//	}
//
//	public void setOfficeAddress(Address officeAddress) {
//		this.officeAddress = officeAddress;
//	}

	public String getProfile() {
		return profile;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

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
