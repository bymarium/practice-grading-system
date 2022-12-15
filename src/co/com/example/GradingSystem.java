package co.com.example;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a value between 0 and 10");
        int qualification = scanner.nextInt();

        if (qualification >= 9 && qualification <= 10) {
            System.out.println("A");
        } else if (qualification >= 8 && qualification < 9){
            System.out.println("B");
        } else if (qualification >= 7 && qualification < 8){
            System.out.println("C");
        } else if (qualification >= 6 && qualification < 7){
            System.out.println("D");
        } else if (qualification >= 0 && qualification < 6){
            System.out.println("F");
        } else {
            System.out.println("Unknown value");
        }
    }
}
