//Program to demonstrate Command Line Arguments 
package Day09;

import java.util.Scanner;

public class WrapperClassDemoOne {

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		/*
		 we have to provide the integer values when we run the java code through the terminal.
		 when we give less than 2 numbers it will execute the below if condition.
		 when the integer values are given they are parsed and the sum is displayed.
		 we have to compile first in terminal by javac WrapperClassDemoOne.java
		 then we have to run by giving following command
		 java WrapperClassDemoOne 10 20
		 */
		if(args.length<2){
			System.out.println("Less than two arguments");//if there are less than 2 numbers it will print this and return
			return;
		}
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a+b;
			System.out.println("command line argument sum"+c);
		}
		catch(Exception e){
			System.out.println("provide valid integers");
		}
		int a=in.nextInt();
		int b=in.nextInt();
		int c=a+b;
		System.out.println("the scanner input sum is "+c);
		/*
		 the above code is used for taking Scanner input where the system waits until
		 the programmer gives the input and press enter.
		 but command line arguments have to be given during the runtime in terminal,
		 if not given it will give ArrayOutOfBoundException.
		 */
	}

}
