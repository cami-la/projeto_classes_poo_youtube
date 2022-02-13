package dev.camila;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(4,4);
        double sideA = square.getSideA();
        System.out.println(sideA);

        double area = square.calculateArea();
        double perimeter = square.calculatePerimeter();

        System.out.println(area + " " + perimeter);
    }
}
