package javacore;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Name: ");
        String name = scanner.nextLine();

        System.out.printf("Score: ");
        Float score = scanner.nextFloat();

        System.out.println("Student's name: " + name);
        System.out.println("Student's score: " + score);

        scanner.close();
    }
}
