package com.example.springdemo.domain;

public class Family {
	
	private Person mama;
	private Person tata;
	private Person babcia;
	private Person dziadek;
	private Person dziecko;
	
	
	public Family(Person mama, Person tata, Person babcia, Person dziadek, Person dziecko) {
		super();
		this.mama = mama;
		this.tata = tata;
		this.babcia = babcia;
		this.dziadek = dziadek;
		this.dziecko = dziecko;
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
	public Person getBabcia() {
		return babcia;
	}
	public void setBabcia(Person babcia) {
		this.babcia = babcia;
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
