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
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplexNumber complex = new ComplexNumber();
        
        System.out.print("Enter the real part: ");
        complex.setReal(sc.nextDouble());
        
        System.out.print("Enter the imaginary part: ");
        complex.setImaginary(sc.nextDouble());
        
        complex.display();
        
        sc.close();
    }
}
