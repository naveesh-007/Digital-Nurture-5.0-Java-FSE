package com.example;

public class App {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(2, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
        System.out.println("Multiplication: " + calc.multiply(3, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}