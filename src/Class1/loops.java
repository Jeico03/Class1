package Class1;

import java.util.Scanner;

public class loops {

  public static void main(String[] args) {
    loops1();
  }

  public static void loops1() { // app that shows the first 100 integers starting from 1.
    for (int loop1 = 1; loop1 <= 100; loop1++) {
      System.out.println(loop1);
    }
    loops2();
  }

  public static void loops2() { // app that shows the first 100 numbers in reverse, that is, from 100 to 1
    for (int loop2 = 100; loop2 >= 1; loop2--) {
      System.out.println(loop2);
    }
    loops3();
  }

  public static void loops3() { // app that shows only even numbers in the range from 1 to 100
    for (int loop3 = 1; loop3 <= 100; loop3++) {
      if (loop3 % 2 == 0) {
        System.out.println(loop3);
      }
    }
    loops4();
  }

  public static void loops4() { // app that shows the sum of numbers from 1 to 100
    int addition = 0;
    for (int loop4 = 1; loop4 <= 100; loop4++) {
      addition += loop4;
    }
    System.out.println("The sum of the numbers from 1 to 100 results in " + addition);
    loops5();
  }

  public static void loops5() { // app that shows the sum of odd numbers from 1 to 100
    int sum = 0;
    for (int loop5 = 1; loop5 <= 100; loop5++) {
      if (loop5 % 2 != 0) {
        sum += loop5;
      }
    }
    System.out.println("The sum of odd numbers from 1 to 100 is: " + sum);
    loops6();
  }

  public static void loops6() { // app that asks for numbers as long as a negative one is not entered. At the
                                // end, the sum of the numbers entered should be displayed
    Scanner scanner = new Scanner(System.in);
    int accumulation = 0;
    int number = 0;

    while (true) {
      System.out.println("Enter a number");
      number = scanner.nextInt();
      if (number <= -1) {
        break;
      }
      accumulation += number;
    }

    System.out.println("The sum of number entered is " + accumulation);
    scanner.close();
    loops7();
  }

  public static void loops7() { // calculator app
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Select one of the following options:");
      System.out.println("A. Addition");
      System.out.println("B. Subtraction");
      System.out.println("C. Multiplication");
      System.out.println("D. Division");
      System.out.println("E. Close");

      String option = scanner.nextLine().toUpperCase();

      switch (option) {
        case "A":
          addition(scanner);
          break;
        case "B":
          subtraction(scanner);
          break;
        case "C":
          multiplication(scanner);
          break;
        case "D":
          division(scanner);
          break;
        case "E":
          close(scanner);
          return;
        default:
          System.out.println("Invalid option. Please try again.");
          break;
      }
    }
  }

  public static void addition(Scanner scanner) {
    System.out.println("Enter the first number:");
    int num1 = scanner.nextInt();
    System.out.println("Enter the second number:");
    int num2 = scanner.nextInt();
    int result = num1 + num2;
    System.out.println("The result is: " + result);
    scanner.nextLine();
  }

  public static void subtraction(Scanner scanner) {
    System.out.println("Enter the first number:");
    int num1 = scanner.nextInt();
    System.out.println("Enter the second number:");
    int num2 = scanner.nextInt();
    int result = num1 - num2;
    System.out.println("The result is: " + result);
    scanner.nextLine();
  }

  public static void multiplication(Scanner scanner) {
    System.out.println("Enter the first number:");
    int num1 = scanner.nextInt();
    System.out.println("Enter the second number:");
    int num2 = scanner.nextInt();
    int result = num1 * num2;
    System.out.println("The result is: " + result);
    scanner.nextLine();
  }

  public static void division(Scanner scanner) {
    System.out.println("Enter the first number:");
    int num1 = scanner.nextInt();
    System.out.println("Enter the second number:");
    int num2 = scanner.nextInt();
    if (num2 != 0) {
      int result = num1 / num2;
      System.out.println("The result is: " + result);
    } else {
      System.out.println("Division by zero is not allowed.");
    }
    scanner.nextLine();
  }

  public static void close(Scanner scanner) {
    System.out.println("Calculator closed.");
    loops8();
  }

  public static void loops8() { // app that asks for 2 integers and prints even numbers between them, validating
                                // that the second number is greater than the first
    Scanner scanner = new Scanner(System.in);

    int num1, num2;
    System.out.println("Enter the first integer:");
    num1 = scanner.nextInt();

    do {
      System.out.println("Enter the second integer (must be greater than the first):");
      num2 = scanner.nextInt();
      if (num2 <= num1) {
        System.out.println("The second number must be greater than the first. Please try again.");
      }
    } while (num2 <= num1);

    System.out.println("Even numbers between " + num1 + " and " + num2 + " are:");
    for (int i = num1; i <= num2; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    scanner.close();
  }
}
