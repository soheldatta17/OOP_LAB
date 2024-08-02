// Create a class called Person with name,age and address as data members and write a method to compare the age of 2 people

import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String compareAge(Person person1, Person person2) {
        if (person1.age > person2.age) {
            return person1.name + " is older than " + person2.name;
        } else if (person1.age < person2.age) {
            return person1.name + " is younger than " + person2.name;
        } else {
            return person1.name + " and " + person2.name + " are of the same age";
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println("Enter details for the first person:");
        System.out.print("Name: ");
        person1.setName(sc.nextLine());
        System.out.print("Age: ");
        person1.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Address: ");
        person1.setAddress(sc.nextLine());

        System.out.println("Enter details for the second person:");
        System.out.print("Name: ");
        person2.setName(sc.nextLine());
        System.out.print("Age: ");
        person2.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Address: ");
        person2.setAddress(sc.nextLine());

        System.out.println("\nFirst person details:");
        person1.display();
        System.out.println("\nSecond person details:");
        person2.display();

        System.out.println("\nComparison result:");
        System.out.println(Person.compareAge(person1, person2));

        sc.close();
    }
}
