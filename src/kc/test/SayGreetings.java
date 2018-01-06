package kc.test;

public class SayGreetings {
	SayGreetings() {
		super();
	}

	public boolean sayHello(String greetings) {
		System.out.format("Hello %s!\n", greetings);
		return true;
	}

	public static void main(String[] args) {
		SayGreetings sayGreetings = new SayGreetings();
		sayGreetings.sayHello("Ken");
	}
}
