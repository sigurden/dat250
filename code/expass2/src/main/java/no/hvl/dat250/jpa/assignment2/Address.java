package no.hvl.dat250.jpa.assignment2;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private int number;
    @ManyToMany(mappedBy="addresses")
    private Set<Person> owners;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Set<Person> getOwners() {
		return owners;
	}
	public void setOwners(Set<Person> owners) {
		this.owners = owners;
	}
}
