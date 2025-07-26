package com.practice.Level3.TaxiBookingSystem;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        TaxiBookingSystem taxi=new TaxiBookingSystem(2);
        while(true){
            System.out.println("**************************************");
            System.out.println("Welcome to the taxi booking system");
            System.out.println("1. Book Taxi");
            System.out.println("2. Display Taxi's");
            System.out.println("3. Exit");
            System.out.println();
            System.out.println("Enter your choice:");
            int choice=input.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the pickup Location (A to E):");
                    char pickUpLocation=input.next().toUpperCase().charAt(0);

                    System.out.println("Enter the drop Location (A to E):");
                    char dropLocation=input.next().toUpperCase().charAt(0);

                    if(pickUpLocation<'A' || pickUpLocation >'E' || dropLocation <'A' || dropLocation > 'E'){
                        System.out.println("Please enter a valid locations ! ");
                        break;
                    }

                    System.out.println("Enter the pickup Time: (24 Hours)");
                    int pickUpTime=input.nextInt();

                    if(pickUpTime < 0 || pickUpTime > 23){
                        System.out.println("Please enter a valid time !");
                        break;
                    }

                    taxi.bookTaxi(pickUpLocation,dropLocation,pickUpTime);
                    break;

                case 2:
                    taxi.displayTaxis();
                    break;

                case 3:
                    System.out.println("Thank you for using our taxi booking system :)");
                    input.close();
                    return ;

                default:
                    System.out.println("Please enter a valid choice !");
                    break;
            }

        }
    }
}
