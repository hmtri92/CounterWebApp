package com.mkyong.controller;

import org.springframework.ui.ModelMap;

import junit.framework.TestCase;

public class BaseControllerTest extends TestCase {

	public BaseControllerTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testWelcome() {
		ModelMap model = new ModelMap();		
		BaseController a = new BaseController();
		assertEquals ("index", a.welcome(model));
		
	}

	public void testWelcomeName() {
		fail("Not yet implemented");
		ModelMap model = new ModelMap();		
		BaseController a = new BaseController();
		assertEquals ("index", a.welcome(model));

	}

}
