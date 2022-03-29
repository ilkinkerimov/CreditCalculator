package main;

import bean.Customer;
import bean.House;
import util.FileUtility;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    public static void register() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.println("Enter your name");
        customer.setName(scanner.nextLine());

        System.out.println("Enter your surname");
        customer.setSurname(scanner.nextLine());

        System.out.println("Enter your age");
        customer.setAge(scanner.nextInt());

        System.out.println("Enter your salary");
        customer.setSalary(scanner.nextInt());

        System.out.println("Offer year");
        customer.setOfferedYear(scanner.nextInt());

        FileUtility.WriteObjectToFile(customer,"customer.obj");

        House house = new House();
        System.out.println("Enter price");
        house.setPrice(scanner.nextInt());

        System.out.println("Enter construction year");
        house.setConstrYear(scanner.nextInt());

        FileUtility.WriteObjectToFile(house, "house.obj");
    }
}
