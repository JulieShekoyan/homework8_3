package com.company;

public class Square extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(double radius) {
        double firstArea = Math.pow(2 * getRadius(), 2);
        return firstArea;
    }

    public double calculateSecondArea(double radius) {
        double secondArea = Math.pow(Math.sqrt(2) * getRadius(), 2);
        return secondArea;
    }

    @Override
    public double calculatePerimeter(double radius) {
        double firstPerimeter = 2 * getRadius() * 4;
        return firstPerimeter;
    }

    public double calculateSecondPerimeter(double radius) {
        double secondPerimeter = Math.sqrt(2) * getRadius() * 4;
        return secondPerimeter;
    }

    public void print (){
        System.out.println("The first area is " + calculateArea(getRadius()));
        System.out.println("The second area is " + calculateSecondArea(getRadius()));
        System.out.println("The first perimeter is " + calculatePerimeter(getRadius()));
        System.out.println("The first perimeter is " + calculateSecondPerimeter(getRadius()));

    }
}
