package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class CreditCard {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private int limit;
    private int balance;
    
    @OneToOne
    private Pincode pincode;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Bank bank;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Pincode getPincode() {
		return pincode;
	}

	public void setPincode(Pincode pincode) {
		this.pincode = pincode;
	}

	public Bank getOwningBank() {
		return bank;
	}

	public void setOwningBank(Bank owningBank) {
		this.bank = owningBank;
	}
    
}
