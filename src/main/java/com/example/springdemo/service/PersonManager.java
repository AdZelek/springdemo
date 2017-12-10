package com.example.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.domain.Family;
import com.example.springdemo.domain.Person;

@Component
public class PersonManager {

	@Autowired
	private Family family;

	public String sayName() {
		
		return "I'm " + family.getDziecko().getFirstName() + "!";
	}
	public String sayNamesFamily() {
		
		return "Dziadek: " + family.getDziadek().getFirstName() + " " +
		"Babcia: " + family.getBabcia().getFirstName() +  " " +
		"Mama: " + family.getMama().getFirstName() + " " +
		"Tata: " + family.getTata().getFirstName() + " " +
		"Dziecko: " + family.getDziecko().getFirstName();
	}

}
