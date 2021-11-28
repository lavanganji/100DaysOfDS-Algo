package org.lkg.java8;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLengthLambda myLambda = (s) -> s.length();  // Here we are not using the String return because it indirectly taken from StringLengthLambda interface
		System.out.println(myLambda.getLength("Hello Lambda"));
		
		
		StringLengthLambda myLambda1 = (s) -> s.length();  // Here we are not using the String return because it indirectly taken from StringLengthLambda interface
		System.out.println(myLambda1.getLength("Hello Lambda"));

		StringLengthLambda myLambda2 = s -> s.length();  // Here we are not using the () return because it compiler will take it  when we have one argument from StringLengthLambda interface
		// when we have the one parameter , we dont have to specify the return type and () , compiler will look into interface.
		System.out.println(myLambda2.getLength("Hello Lambda"));
		
		printLambda(s->s.length());
		
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Lavan Kumar"));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}

}
