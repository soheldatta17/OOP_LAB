# OOP Lab Assignment

## Question 1: Prime Number and Odd/Even Checker

### Description:
Create a class called `Number` which will have one integer as a data member and two methods for checking whether the number is prime or not and whether it is odd or even.

### Requirements:
- Implement a `Number` class with:
  - **Data Member:**
    - `int value`: The number to be checked.
  - **Methods:**
    - `boolean isPrime()`: Checks if the number is prime.
    - `String oddOrEven()`: Determines if the number is odd or even.
    - `void setVal(int value)`: Sets the value of the number.
    - `int getVal()`: Gets the value of the number.
- Create another class containing the `main` method to test the `Number` class.

## Question 2: Leap Year Checker

### Description:
Create a class for checking whether a year is a leap year or not. Write a separate class for testing the above class.

### Requirements:
- Implement a `Year` class with:
  - **Data Member:**
    - `int year`: The year to be checked.
  - **Methods:**
    - `String isLeapYear()`: Checks if the year is a leap year and returns "Leap Year" or "Not a Leap Year". (Use only one if statement)
    - `void setYear(int year)`: Sets the value of the year.
    - `int getYear()`: Gets the value of the year.
- Create another class containing the `main` method to test the `Year` class.

## Question 3: Complex Number Class

### Description:
Create a class to represent complex numbers and implement appropriate accessor and mutator methods for setting and displaying a complex number in Java.

### Requirements:
- Implement a `ComplexNumber` class with:
  - **Data Members:**
    - `double real`: The real part of the complex number.
    - `double imaginary`: The imaginary part of the complex number.
  - **Methods:**
    - `double getReal()`: Gets the real part of the complex number.
    - `void setReal(double real)`: Sets the real part of the complex number.
    - `double getImaginary()`: Gets the imaginary part of the complex number.
    - `void setImaginary(double imaginary)`: Sets the imaginary part of the complex number.
    - `void display()`: Displays the complex number in the format "real + imaginary i".
- Create another class containing the `main` method to test the `ComplexNumber` class.

## Question 4: Person Age Comparison

### Description:
Create a class called `Person` with `name`, `age`, and `address` as data members. Write methods to compare the age of two `Person` objects.

### Requirements:
- Implement a `Person` class with:
  - **Data Members:**
    - `String name`: The name of the person.
    - `int age`: The age of the person.
    - `String address`: The address of the person.
  - **Methods:**
    - `String compareAge(Person person)`: Compares the age of the current person with another person and returns a string indicating which person is older or if they are of the same age.
    - `void setName(String name)`: Sets the name of the person.
    - `String getName()`: Gets the name of the person.
    - `void setAge(int age)`: Sets the age of the person.
    - `int getAge()`: Gets the age of the person.
    - `void setAddress(String address)`: Sets the address of the person.
    - `String getAddress()`: Gets the address of the person.
    - `void display()`: Displays the details of the person.
- Create another class containing the `main` method to test the `Person` class.
