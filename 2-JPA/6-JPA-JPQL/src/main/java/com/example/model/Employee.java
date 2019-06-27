package com.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "EMPLOYEES", schema = "emp_db")
@NamedQueries({ 
	@NamedQuery(name = "findAll", query = "from Employee") 
})
@NamedNativeQueries({
	@NamedNativeQuery(name="getAll",query="select * from EMPLOYEES",resultClass= Employee.class)
})
public class Employee {

	@Id
	@GeneratedValue
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

	@ManyToOne
	private Department department;

	public String getProfile() {
		return profile;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gender=" + gender + ", dob=" + dob
				+ ", joinDate=" + joinDate + ", profile=" + profile + ", pic=" + Arrays.toString(pic) + "]";
	}

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
