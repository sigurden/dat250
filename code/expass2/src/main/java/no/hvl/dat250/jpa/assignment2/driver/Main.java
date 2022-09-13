package no.hvl.dat250.jpa.assignment2.driver;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import no.hvl.dat250.jpa.assignment2.Address;
import no.hvl.dat250.jpa.assignment2.Bank;
import no.hvl.dat250.jpa.assignment2.CreditCard;
import no.hvl.dat250.jpa.assignment2.Person;
import no.hvl.dat250.jpa.assignment2.Pincode;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        var person = createPerson("Max Mustermann");
        var address = createAddress("Inndalsveien", 28);
        var pincode = createPincode("123", 1);
        var bank = createBank("Pengebank");
        var creditCard1 = createCreditCard(12345, -5000, -10000, bank, pincode);
        var creditCard2 = createCreditCard(123, 1, 2000, bank, pincode);
        
        person.setAdresses(Arrays.asList(address));
        
        address.setOwners(Set.of(person));
        
        person.setCreditCards(Arrays.asList(creditCard1, creditCard2));
        bank.setOwnedCards(Set.of(creditCard1, creditCard2));
        
        em.getTransaction().begin();
        em.persist(person);
        em.persist(address);
        em.persist(pincode);
        em.persist(bank);
        em.persist(creditCard1);
        em.persist(creditCard2);

        em.getTransaction().commit();
        em.close();
    }
    
    private static CreditCard createCreditCard(int number, int balance, int limit, Bank bank, Pincode pincode) {
    	CreditCard creditCard = new CreditCard();
    	creditCard.setNumber(number);
        creditCard.setBalance(balance);
        creditCard.setLimit(limit);
        creditCard.setOwningBank(bank);
        creditCard.setPincode(pincode);
        return creditCard;
    }
    private static Pincode createPincode(String pincodeCode, int count) {
    	Pincode pincode = new Pincode();
    	pincode.setPincode(pincodeCode);
    	pincode.setCount(count);
        return pincode;
    }
    private static Bank createBank(String name) {
    	var bank = new Bank();
    	bank.setName(name);
        return bank;
    }
    private static Address createAddress(String street, int number) {
    	var address = new Address();
    	address.setStreet(street);
    	address.setNumber(number);
        return address;
    }
    private static Person createPerson(String name) {
    	var person = new Person();
    	person.setName(name);
        return person;
    }
    
}
