package com.app.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class WelcomeController {
	@PersistenceContext
	EntityManager entityManager;

	@RequestMapping(value = { "/welcome" }, method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}

}
