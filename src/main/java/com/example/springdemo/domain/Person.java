package com.example.springdemo.domain;

import java.util.ArrayList;
import java.util.List;


public class Person {
	
	private Person mama;
	private Person tata;
	private Person babci;
	private Person dziadek;
	private Person dziecko; 
	
	private String firstName;
    private int yob;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	public Person getMama() {
		return mama;
	}
	public void setMama(Person mama) {
		this.mama = mama;
	}
	public Person getTata() {
		return tata;
	}
	public void setTata(Person tata) {
		this.tata = tata;
	}
	public Person getBabci() {
		return babci;
	}
	public void setBabci(Person babci) {
		this.babci = babci;
	}
	public Person getDziadek() {
		return dziadek;
	}
	public void setDziadek(Person dziadek) {
		this.dziadek = dziadek;
	}
	public Person getDziecko() {
		return dziecko;
	}
	public void setDziecko(Person dziecko) {
		this.dziecko = dziecko;
	}
	
	
	
	
	
}
