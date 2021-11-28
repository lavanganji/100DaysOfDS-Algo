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
		
		greetLambdaFunc.perform();
		 
		 //  MyAdd addFunction = (int a, int b,int c) -> a+b+c ;


	}
	
	

}

interface MyLambda{
	void lavan();
}
interface MyAdd{
	int kiss(int s , int e);
	
	int a (int s , int e,int c);

}