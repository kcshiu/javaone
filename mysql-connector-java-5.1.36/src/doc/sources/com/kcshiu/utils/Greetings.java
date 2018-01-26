package com.kcshiu.utils;

public class Greetings {
	Greetings() {
		super();
	}

	public boolean sayHello(String name, String greet) {
		System.out.format("%s, %s!", greet, name);
		return true;
	}
}
