// Create a class to check whether a year is a leap year. Write a separate class for testing this functionality (use only one if statement in the leap year check)

import java.util.Scanner;

class Year {

    int year;

    public String isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap Year" : "Not a Leap Year";
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

public class P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        
        Year yr = new Year();
        yr.setYear(year);
        
        String leapYearStatus = yr.isLeapYear();
        
        System.out.println("\n--- Year Analysis ---");
        System.out.println("Year Entered      : " + yr.getYear());
        System.out.println("Leap Year Status  : " + leapYearStatus);
        System.out.println("-----------------------");
        
        sc.close();
    }
}
