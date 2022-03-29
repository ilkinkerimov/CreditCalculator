package util;

import bean.Credit;
import bean.Customer;
import bean.House;

public class Calculations {


   public static void creditCalculator() throws  Exception {
       Customer customer = (Customer) FileUtility.readFileDeserialize("customer.obj");
       House house = (House) FileUtility.readFileDeserialize("house.obj");
       Credit credit = new Credit();

       if(customer.getAge()>=65){
           System.out.println("too old to die young");
       }
       else{
               if (house.getConstrYear()>2007){
                   credit.setPercent(30);
               }
               else  credit.setPercent(20);

               credit.setInitialPayment(house.getPrice() * credit.getPercent() / 100);
               double remain = house.getPrice() - credit.getInitialPayment();
               double paymentPerMonth = remain/(customer.getOfferedYear()*12);
              if( paymentPerMonth < 0.8 * customer.getSalary() &&
              remain<150000 && (65- customer.getAge()) > customer.getOfferedYear()){

                  System.out.println("Ilkin odenish: " + credit.getInitialPayment() + " AZN");
                  System.out.println("Ayliq kreditiniz: " + paymentPerMonth + " AZN " +
                          customer.getOfferedYear() + " il erzinde");
              }
              else {
                  System.out.println("Shertler uygun deyil");
              }

           }

       }


   }


