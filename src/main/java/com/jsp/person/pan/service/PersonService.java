package com.jsp.person.pan.service;

import com.jsp.person.pan.dao.PersonDao;
import com.jsp.person.pan.dto.Person;


public class PersonService 
{
	PersonDao personDao = new PersonDao();

	public Person createPerson(Person person) {
		return personDao.createPerson(person);
	}

	public Person gePersonById(int id) {
		return personDao.getPersonById(id);
	}

	public Person deletePersonById(int id) {
		return personDao.deletePerosnById(id);
	}

	public Person updatePersonById(int id, String name, String gmail) {

		return personDao.updatePersonById(id, name, gmail);
	}
}
