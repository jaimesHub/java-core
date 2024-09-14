package javacore;

import java.util.Scanner;

public class Ractangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Width: ");
        Float width = scanner.nextFloat();

        System.out.print("Height: ");
        Float height = scanner.nextFloat();

        System.out.println("perimeter: " + (width + height) / 2);
        System.out.println("area: " + (width + height));
        System.out.println("smallestEdge: " + Math.min(width, height));

        scanner.close();
    }
}
