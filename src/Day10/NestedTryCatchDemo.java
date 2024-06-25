package Day10;  // This line declares that the class is part of the 'Day10' package.

import java.util.InputMismatchException;  // This line imports the 'InputMismatchException' class from the 'java.util' package.
import java.util.Scanner;  // This line imports the 'Scanner' class from the 'java.util' package.

public class NestedTryCatchDemo {  // This line declares a public class named 'NestedTryCatchDemo'.

    public static void main(String[] a) {  // This line defines the main method, the entry point of the program.
        String name;  // This line declares a variable 'name' of type String.
        int pos;  // This line declares a variable 'pos' of type int.

        try (Scanner sc = new Scanner(System.in)) {  // This line creates a Scanner object 'sc' for reading input from the user. The 'try' block ensures that the Scanner is closed automatically.

            try {  // This is the outer try block.
                System.out.println("Enter your name : ");  // This line prompts the user to enter their name.
                name = sc.next();  // This line reads the user's name and stores it in the variable 'name'.

                System.out.println("Enter the position : ");  // This line prompts the user to enter a position (index).
                pos = sc.nextInt();  // This line reads an integer input from the user and stores it in the variable 'pos'.

                try {  // This is the inner try block.
                    // This line prints the character at the specified position in the user's name.
                    System.out.println("character at index " + pos + " in '" + name + "' is " + name.charAt(pos));
                } catch (StringIndexOutOfBoundsException e) {  // This line catches an exception if the specified position is out of bounds for the given string.
                    System.out.println(e.getMessage());  // This line prints the exception message.
                }

            } catch (InputMismatchException e) {  // This line catches an exception if the input is not an integer.
                System.out.println("Please enter integer ");  // This line prints an error message indicating that the input should be an integer.
            }

        }  // The Scanner 'sc' is automatically closed here because of the try-with-resources statement.

    }  // This marks the end of the main method.

}  // This marks the end of the class.
