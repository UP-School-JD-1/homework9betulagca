package p2ch10hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Person implements Comparable<Object> {
	private final String name;
	private final String surname;
	private ArrayList<String> address;
	private ArrayList<Integer> phones;

	public Person(String name, String surname, List<String> p1Address, List<Integer> p1Phones) {
		this.name = name;
		this.surname = surname;
		this.address = (ArrayList<String>) p1Address;
		this.phones = (ArrayList<Integer>) p1Phones;

	}
	public ArrayList<String> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}

	public ArrayList<Integer> getPhones() {
		return phones;
	}

	public void setPhones(ArrayList<Integer> phones) {
		this.phones = phones;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	
	public int compareTo(Object o) {
		Person person = (Person) o;
		return surname.compareTo(person.getSurname());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", address=" + address + ", phones=" + phones + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name, phones, surname);
	}

	
       
	
        
}
