package model.entities;

import java.util.Objects;

public class Department {
	private Integer id;
	private String name;
	
	
	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}


	public synchronized Integer getId() {
		return id;
	}


	public synchronized void setId(Integer id) {
		this.id = id;
	}


	public synchronized String getName() {
		return name;
	}


	public synchronized void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
}