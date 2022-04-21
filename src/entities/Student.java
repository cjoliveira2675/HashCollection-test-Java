package entities;

import java.util.Objects;

public class Student {

	private Integer cod;
		
	public Student(Integer cod) {
		this.cod = cod;
	}
	
	public Integer getCod() {
		return cod;
	}
	
	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return "Student [cod=" + cod + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(cod, other.cod);
	}
}
