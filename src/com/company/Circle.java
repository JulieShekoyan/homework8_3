package com.company;

public class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(double radius) {
        double area = Math.PI * Math.pow(getRadius(), 2);
        return area;
    }

    @Override
    public double calculatePerimeter(double radius) {
        double perimeter = 2 * Math.PI * getRadius();
        return perimeter;
    }

    public void print (){
        System.out.println("The area is " + calculateArea(getRadius()));
        System.out.println("The perimeter is " + calculatePerimeter(getRadius()));

    }

}
