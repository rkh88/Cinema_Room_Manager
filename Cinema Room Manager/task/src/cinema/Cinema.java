package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        System.out.print("Cinema:");
        int count = 0;
        for(int i = 0; i < 9; i++) {
            if(i == 0){
                System.out.print("\n ");
            }
            if(i > 0 && i != 8){
                count++;
                System.out.print(count + " ");
            }
            if (i == 8) {
                System.out.print(i);
            }
        }
        for (int i = 1; i < 8; i++) {

            for(int j = 0; j < 9; j++) {
                if(j == 0){
                    System.out.print("\n" + i + " ");
                }
                if(j > 0 && j != 8){
                    System.out.print("S ");
                }
                if (j == 8) {
                    System.out.print("S");
                }
            }

        }

        System.out.println("\nEnter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = sc.nextInt();

        int totalSeats = rows * seats;

        if(totalSeats <= 60){
            int ticketPrice = 10;
            int totalIncome = totalSeats * ticketPrice;
            System.out.println("Total income: " + "\n$" + totalIncome);
        } else {
                int totalIncome = (rows/2) * seats * 10 + (rows - rows/2) * seats * 8;
                System.out.println("Total income: " + "\n$" + totalIncome);
            }
        }


        // Write your code here

}