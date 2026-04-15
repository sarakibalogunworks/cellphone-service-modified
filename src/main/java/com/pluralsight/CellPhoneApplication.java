package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        CellPhone cellPhone1 = new CellPhone();

        System.out.println("--- Enter information for Phone 1 ---");
        System.out.print("What is the serial number? ");
        cellPhone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        cellPhone1.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        cellPhone1.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        cellPhone1.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellPhone1.setOwner(scanner.nextLine());


        CellPhone cellPhone2 = new CellPhone();
        System.out.println("\n-- Enter information for Phone 2 --" );

        System.out.println("What is the serial number? ");
        cellPhone2.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What model is the phone? ");
        cellPhone2.setModel(scanner.nextLine());

        System.out.println("Who is the carrier? ");
        cellPhone2.setCarrier(scanner.nextLine());

        System.out.println("What is the phone number? ");
        cellPhone2.setPhoneNumber(scanner.nextLine());

        System.out.println("Who is the owner of the phone? ");
        cellPhone2.setOwner(scanner.nextLine());


        System.out.println("\n--- Phone 1 Information ---");
        display(cellPhone1);

        System.out.println("\n--- Phone 2 Information---");
        display(cellPhone2);

        System.out.println("\n--- Making Calls ---");
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        scanner.close();

    }





}
