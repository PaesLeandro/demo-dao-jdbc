package model.entities;

import java.io.Serializable;
import java.util.*;
import java.util.Objects;

public class Seller implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer idInteger;
	private String nameString; 
	private String emailString;
	private Date birthDate;
	private Double baseSalaryDouble;
	
	private Department department;
	
	public Seller () {
	}

	public Seller(Integer idInteger, String nameString, String emailString, Date birthDate, Double baseSalaryDouble,
			Department department) {
		this.idInteger = idInteger;
		this.nameString = nameString;
		this.emailString = emailString;
		this.birthDate = birthDate;
		this.baseSalaryDouble = baseSalaryDouble;
		this.department = department;
	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalaryDouble() {
		return baseSalaryDouble;
	}

	public void setBaseSalaryDouble(Double baseSalaryDouble) {
		this.baseSalaryDouble = baseSalaryDouble;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idInteger);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Seller)) {
			return false;
		}
		Seller other = (Seller) obj;
		return Objects.equals(idInteger, other.idInteger);
	}

	@Override
	public String toString() {
		return "Seller [idInteger=" + idInteger + ", nameString=" + nameString + ", emailString=" + emailString
				+ ", birthDate=" + birthDate + ", baseSalaryDouble=" + baseSalaryDouble + ", department=" + department
				+ "]";
	}

	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
