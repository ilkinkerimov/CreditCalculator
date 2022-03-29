package main;

import bean.Customer;
import util.Calculations;
import util.FileUtility;

public class Main {
    public static void main(String[] args) throws Exception {
        Register.register();
        Calculations.creditCalculator();

    }
}
