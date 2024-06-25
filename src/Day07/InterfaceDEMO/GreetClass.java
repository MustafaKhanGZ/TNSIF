//Program to demonstrate FunctionalInterface - Child Class
package Day07.InterfaceDEMO;

public class GreetClass implements GreetInterface {

	@Override
	public String greet() {		
		return "Welcome to the world of Java";
	}

}
