// Program to demonstrate final Variable
package Day5;
public class FinalVariable {

	 //final int x; // Error:final instance variable must be initialized

	final int x = 100;

	// Declare a static blank final variable.
	final static int Y;

	// Declare & intialize static final variable.
	final static int Z = 10;

	// instatnce method
	void change() {
		//x = 30; // Error:final variables can't be reassigned
		//Y = 200; // Error:final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		//Z = 100; // Once intialized can't be reassigned
		System.out.println("Value of Y: " + Y);
	}
	public static void main(String[] args) {
		FinalVariable o=new FinalVariable();
		System.out.println(o);
	}

}
