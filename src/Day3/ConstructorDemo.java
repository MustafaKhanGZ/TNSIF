package Day3;

import java.util.Scanner;

class Customer {
    private String customerName;
    private int customerId;
    private String customerCity;

    // Default constructor
    public Customer() {
    }

    // Parameterized constructor
    public Customer(String name, int id, String city) {
        this.customerName = name;
        this.customerId = id;
        this.customerCity = city;
    }

    // Getter and Setter methods
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    // Override toString method to display customer details
    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity=" + customerCity + "]";
    }
}

public class ConstructorDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;

        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();

        sc.nextLine(); // consume the newline character
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        System.out.println(" ");

        Customer c1 = new Customer(); // default constructor invoked
        c1.setCustomerName(name);
        c1.setCustomerId(id);
        c1.setCustomerCity(city);
        System.out.println(c1);

        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();

        sc.nextLine(); // consume the newline character
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        Customer c2 = new Customer(name, id, city); // parameterized constructor invoked
        System.out.println(c2);

        sc.close();
    }
}
