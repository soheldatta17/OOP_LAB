// Create a class ComplexNumber. Implement the appropriate accessor and mutator methods for setting and displaying a complex number in Java

import java.util.Scanner;

class ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        }
    }

    public ComplexNumber add(ComplexNumber other) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(this.real + other.real);
        result.setImaginary(this.imaginary + other.imaginary);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber other) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(this.real * other.real - this.imaginary * other.imaginary);
        result.setImaginary(this.real * other.imaginary + this.imaginary * other.real);
        return result;
    }

    public boolean isEqual(ComplexNumber other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ComplexNumber complex1 = new ComplexNumber();
        ComplexNumber complex2 = new ComplexNumber();
        
        System.out.print("Enter the real part of the first complex number: ");
        complex1.setReal(sc.nextDouble());
        System.out.print("Enter the imaginary part of the first complex number: ");
        complex1.setImaginary(sc.nextDouble());

        System.out.print("Enter the real part of the second complex number: ");
        complex2.setReal(sc.nextDouble());
        System.out.print("Enter the imaginary part of the second complex number: ");
        complex2.setImaginary(sc.nextDouble());
        
        System.out.print("First complex number: ");
        complex1.display();
        System.out.print("Second complex number: ");
        complex2.display();
        
        ComplexNumber sum = complex1.add(complex2);
        System.out.print("Sum of the complex numbers: ");
        sum.display();
        
        ComplexNumber product = complex1.multiply(complex2);
        System.out.print("Product of the complex numbers: ");
        product.display();
        
        if (complex1.isEqual(complex2)) {
            System.out.println("The complex numbers are equal.");
        } else {
            System.out.println("The complex numbers are not equal.");
        }
        
        sc.close();
    }
}
