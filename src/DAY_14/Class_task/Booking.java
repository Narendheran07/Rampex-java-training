package DAY_14.Class_task;

import java.util.Scanner;

public class Booking {

    public static void main(String[] args) {

        try {
            bookTicket();
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }

    public static void bookTicket() throws InvalidAgeException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 18) {
            throw new InvalidAgeException();
        } else {
            System.out.print("Enter your ticket number: ");
            int ticketNo = sc.nextInt();

            System.out.println("Ticket Number: " + ticketNo + " printed successfully.");
        }
    }
}

class InvalidAgeException extends Exception {

    InvalidAgeException() {
        super("You must be at least 18 years old to book a ticket.");
    }
}