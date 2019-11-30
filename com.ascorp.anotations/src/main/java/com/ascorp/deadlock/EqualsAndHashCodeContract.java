package com.ascorp.deadlock;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCodeContract {

	private int id;
	private String name;

	public EqualsAndHashCodeContract(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "EqualsAndHashCodeContract [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

		EqualsAndHashCodeContract emp1 = new EqualsAndHashCodeContract(101, "Krishna");
		EqualsAndHashCodeContract emp2 = new EqualsAndHashCodeContract(101, "Krishna");
		EqualsAndHashCodeContract emp3 = new EqualsAndHashCodeContract(101, "Krishna");
		EqualsAndHashCodeContract emp4 = new EqualsAndHashCodeContract(101, "Krishna");
		System.out.println("is Equals---> " + emp1.equals(emp4));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());

		HashMap<EqualsAndHashCodeContract, String> map = new HashMap<>();
		map.put(emp1, "A");
		map.put(emp2, "B");
		map.put(emp3, "C");
		map.put(emp4, "D");
		System.out.println(map);
		System.out.println(map.size());
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + id; result = prime * result + ((name == null) ? 0 :
	 * name.hashCode()); return result; }
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsAndHashCodeContract other = (EqualsAndHashCodeContract) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
