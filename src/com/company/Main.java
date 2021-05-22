package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter radius ");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);
        square.setRadius(radius);

        circle.print();
        square.print();
    }
}
