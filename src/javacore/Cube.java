package javacore;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input edge: ");
        Float edge = scanner.nextFloat();

        double volume = Math.pow(edge, 3);
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}
