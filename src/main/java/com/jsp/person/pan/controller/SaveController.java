package com.jsp.person.pan.controller;

import com.jsp.person.pan.service.PanService;
import com.jsp.person.pan.service.PersonService;
import com.jsp.person.pan.dto.Person;
import com.jsp.person.pan.dto.Pan;

public class SaveController 
{
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		PanService panService = new PanService();
		
		Pan pan = new Pan();
		pan.setName("sahil janbandhu");
		pan.setPan_no(123456l);
		panService.createPan(pan);
		
		Person person = new Person();
		person.setName("Sahil");
		person.setEmail("sahil14498@gmail.com");
		person.setPan(pan);
		personService.createPerson(person);
	
	}
}
