package Class1;

import java.util.Scanner;

public class conditionals {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Opens the scanner to let the user input data

    System.out.println("Choose which project you want to run:");
    System.out.println("1. App to Check Age");
    System.out.println("2. App to Check if the Student Passed");
    System.out.println("3. App to Find the Smallest Number");
    System.out.println("4. App to Check if a Number is Even or Odd");
    System.out.println("5. App to Check if a Number is Negative or Positive");
    System.out.println("6. App to Determine the Type of Triangle");

    int menu = scanner.nextInt();

    switch (menu) {
      case 1:
        ageVerifier(scanner);
        break;
      case 2:
        student(scanner);
        break;
      case 3:
        minor(scanner);
        break;
      case 4:
        numbers(scanner);
        break;
      case 5:
        negative(scanner);
        break;
      case 6:
        triangle(scanner);
        break;
      default:
        System.out.println("Invalid option");
        break;
    }
    scanner.close();
  }

  public static void ageVerifier(Scanner scanner) {
    System.out.println("Enter your age:");
    int age = scanner.nextInt();

    if (age >= 18) {
      System.out.println("You are an adult.");
    } else {
      System.out.println("You are a minor.");
    }
  }

  public static void student(Scanner scanner) {
    System.out.println("Enter the first grade:");
    int grade1 = scanner.nextInt();

    System.out.println("Enter the second grade:");
    int grade2 = scanner.nextInt();

    System.out.println("Enter the third grade:");
    int grade3 = scanner.nextInt();

    System.out.println("Enter the fourth grade:");
    int grade4 = scanner.nextInt();

    System.out.println("Enter the fifth grade:");
    int grade5 = scanner.nextInt();

    double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;

    if (average >= 70) {
      System.out.println("Congratulations! You passed with an average of " + average);
    } else {
      System.out.println("You didn't pass. Your average was " + average + ". Try harder next time.");
    }
  }

  public static void minor(Scanner scanner) {
    System.out.println("Enter the first number:");
    int number1 = scanner.nextInt();

    System.out.println("Enter the second number:");
    int number2 = scanner.nextInt();

    System.out.println("Enter the third number:");
    int number3 = scanner.nextInt();

    int smallestNumber;

    if (number1 <= number2 && number1 <= number3) {
      smallestNumber = number1;
    } else if (number2 <= number1 && number2 <= number3) {
      smallestNumber = number2;
    } else {
      smallestNumber = number3;
    }

    System.out.println("The smallest number is " + smallestNumber);
  }

  public static void numbers(Scanner scanner) {
    System.out.println("Enter a number:");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }
  }

  public static void negative(Scanner scanner) {
    System.out.println("Enter a number:");
    int number = scanner.nextInt();

    if (number > 0) {
      System.out.println("The number is positive.");
    } else if (number < 0) {
      System.out.println("The number is negative.");
    } else {
      System.out.println("The number is zero.");
    }
  }

  public static void triangle(Scanner scanner) {
    System.out.println("Enter the length of the first side of the triangle:");
    int side1 = scanner.nextInt();

    System.out.println("Enter the length of the second side of the triangle:");
    int side2 = scanner.nextInt();

    System.out.println("Enter the length of the third side of the triangle:");
    int side3 = scanner.nextInt();

    if (side1 == side2 && side2 == side3) {
      System.out.println("The triangle is equilateral.");
    } else if (side1 == side2 || side2 == side3 || side1 == side3) {
      System.out.println("The triangle is isosceles.");
    } else {
      System.out.println("The triangle is scalene.");
    }
  }
}
