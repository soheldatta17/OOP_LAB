// Create a class called number which will have 1 integer as data member & 2 methods for checking whether the number is prime or not & odd or even. Create another class which contains the main method and test the number class.

import java.util.Scanner;

class Number {

    int value;

    public String isPrime() {
        if (value <= 1) {
            return "Not Prime";
        }
        if (value == 2) {
            return "Prime";
        }
        if (value % 2 == 0) {
            return "Not Prime";
        }
        for (int i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }

    public String oddOrEven() {
        return (value % 2 == 0) ? "Even" : "Odd";
    }

    public void setval(int value) {
        this.value = value;
    }

    public int getval() {
        return value;
    }
}

public class P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int value = sc.nextInt();
        
        Number num = new Number();
        num.setval(value);
        
        String primeStatus = num.isPrime();
        String oddOrEven = num.oddOrEven();
        
        System.out.println("\n--- Number Analysis ---");
        System.out.println("Number Entered    : " + num.getval());
        System.out.println("Prime Status      : " + primeStatus);
        System.out.println("Odd or Even       : " + oddOrEven);
        System.out.println("------------------------");
        
        sc.close();
    }
}
