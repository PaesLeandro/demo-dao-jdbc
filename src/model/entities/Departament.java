package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Departament implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer idInteger;
	private String nameString;
	
	public Departament(Integer idInteger, String nameString) {
		
		this.idInteger = idInteger;
		this.nameString = nameString;
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

	@Override
	public int hashCode() {
		return Objects.hash(idInteger);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Departament)) {
			return false;
		}
		Departament other = (Departament) obj;
		return Objects.equals(idInteger, other.idInteger);
	}

	@Override
	public String toString() {
		return "Departament [idInteger=" + idInteger + ", nameString=" + nameString + "]";
	}
	
	
	
}
	