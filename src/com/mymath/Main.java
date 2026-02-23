/**
 *  Java program to demonstrate Complex Numbers.
 */

package com.mymath;

import java.util.Objects;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating Complex Numbers.
        ComplexNumber number = new ComplexNumber(2, 3);
        ComplexNumber number1 = new ComplexNumber(-6, 8);

        // Printing numbers to console.
        System.out.println(number); // Output: 2 + 3i
        System.out.println(number1); // Output: -6 + 8i

        // Adding numbers and printing result.
        System.out.println(number.add(number1)); // Output: -4 + 11i

        // Subtract numbers and printing result.
        System.out.println(number.subtract(number1)); // Output: 8 + 11i

        // Multiplying numbers and printing result.
        System.out.println(number.multiply(number1)); // Output: -12 + 24i

        // Dividing numbers and printing result.
        System.out.println(number.divide(number1)); // Output: 0 + 0i

    }
}

/**
 *  ComplexNumbers class.
 */
class ComplexNumber {

    int real;
    int imaginary;

    // Constructor with parameters.
    public ComplexNumber(int real, int imaginary) {

        this.real = real;
        this.imaginary = imaginary;

    }

    // Adding numbers.
    public ComplexNumber add(ComplexNumber number) {

        ComplexNumber cn = new ComplexNumber(real + number.real, imaginary + number.imaginary);

        return cn;
    }

    // Subtraction numbers.
    public ComplexNumber subtract(ComplexNumber number) {

        ComplexNumber cn = new ComplexNumber(real - number.real, imaginary + number.imaginary);

        return cn;
    }

    // Multiplication of numbers.
    public ComplexNumber multiply(ComplexNumber number) {

        ComplexNumber cn = new ComplexNumber(real * number.real, imaginary * number.imaginary);

        return cn;
    }

    // Division of numbers.
    public ComplexNumber divide(ComplexNumber number) {

        ComplexNumber cn = new ComplexNumber(real / number.real, imaginary / number.imaginary);

        return cn;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return real == that.real && imaginary == that.imaginary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}