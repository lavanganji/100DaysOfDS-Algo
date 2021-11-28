package org.lkg.java8;

public class MyLambdaExample {
	
	public void greet()
	{
		System.out.println("Hello Greet");
	}

	public void greetingInterface(Greeting greet) {
		greet.perform();
	}

	public static void main(String[] args) {
		MyLambdaExample mlf = new MyLambdaExample();
		mlf.greet();
		
		MyInterfaceGreeting interfacegreetingobj = new MyInterfaceGreeting();
		mlf.greetingInterface(interfacegreetingobj);
		
		
		Greeting greetLambdaFunc = () -> System.out.println("This is greeing from lamda");
		
		greetLambdaFunc.perform();  // One way of calling the lambda funcitons 
		 
		 //  MyAdd addFunction = (int a, int b,int c) -> a+b+c ;   
		
		
		Greeting lambdaGreeting = () -> System.out.println("This is from Lambda Greeting.");
		
		
		// Inner Class Anonymous Example
		Greeting innerClassGreeting = new Greeting() {
			
			@Override
			public void perform() {
				System.out.println("This is from inner Class Greeting.");
				
			}
		};
		
		mlf.greetingInterface(lambdaGreeting);
		mlf.greetingInterface(innerClassGreeting);

	}
	
	

}

interface MyLambda{
	void lavan();
}
interface MyAdd{
	int kiss(int s , int e);
	
	int a (int s , int e,int c);

}