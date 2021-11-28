/**
 * 
 */
package org.lkg.java8;

/**
 * @author lavan
 *
 */
public class Greeter {
	
	
	public void greetFunction() {
		System.out.println("Heelo Greet");
	}
	
	public void interfaceGreetFuntion(Greeting greeting) {
		
		greeting.perform();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Greeter greet = new Greeter();
		greet.greetFunction();
		
		MyInterfaceGreeting myinterfacegreeting = new MyInterfaceGreeting();
		greet.interfaceGreetFuntion(myinterfacegreeting);
	}

}
