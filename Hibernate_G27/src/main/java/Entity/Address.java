package Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String Street;
	private String City;
	private String State;
	
	public Address() {}
	
	public Address(String street, String city, String state) {
		super();
		Street = street;
		City = city;
		State = state;
	}
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	
}
