package com.train;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of tickets: ");
        int totalTicket = scanner.nextInt();

        System.out.print("How many round-trip tickets: ");
        int roundTripTicket = scanner.nextInt();

        System.out.print("Total tickets: " + totalTicket +
                         " Round-trip: " + roundTripTicket +
                         " Total: " + tester.getSum(totalTicket, roundTripTicket));
    }
}