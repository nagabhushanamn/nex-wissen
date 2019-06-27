package com.example.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmpId implements Serializable {

	private int id;
	private int depId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depId;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpId other = (EmpId) obj;
		if (depId != other.depId)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
