package Class1;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;

public class othersExercises {

  public static void main(String[] args) {

    String name = "Juan";
    int age = 39;
    String city = "Caracas";

    System.out.println(name + " is " + age + " years old and lives in the city of " + city);
    main();
  }

  public static void main() {

    String title = "The Adventures of the God of Time";
    String Author = "Jose Antonio Casillas";
    double price = 19.99;

    System.out.println("The book: " + title + "from the author " + Author + "it only cost $" + price);
    Area();
  }

  public static void Area() {

    double length = 10.5;
    double widht = 12.7;

    double area = length * widht;

    double perimeter = 2 * length + widht;

    System.out.println("The Area is equal to " + area + "and the perimeter is equal to " + perimeter);
    older();
  }

  public static void older() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type a number");
    int number = scanner.nextInt();

    if (number > 100) {
      System.out.println("The number entered is greater than 100");
    } else if (number < 50) {
      System.out.println("The number entered is less than 50");
    } else {
      System.out.println("The number entered is between 50 and 100");
    }
    scanner.close();
    selective(scanner);
  }

  public static void selective(Scanner scanner) {

    System.out.println("choose one of the following options");
    System.out.println("1. See welcome message");
    System.out.println("2. View the current date");
    System.out.println("3. View the current time");
    System.out.println("4. close");

    int option = scanner.nextInt();

    switch (option) {
      case 1:
        System.out.println("Welcome! Enjoy your stay!");
        break;
      case 2:
        LocalDate currentLocalDate = LocalDate.now();
        System.out.println("The current date is " + currentLocalDate);
        break;
      case 3:
        LocalTime currentLocalTime = LocalTime.now();
        System.out.println("The current time is " + currentLocalTime);
        break;
      case 4:
        System.out.println("Closing the program...");
        System.exit(0);
        break;
      default:
        System.out.println("Invalid option");
        break;
    }
    valueNumber(scanner);
  }

  public static void valueNumber(Scanner scanner) {
    System.err.println("Type a number ");
    int number = scanner.nextInt();

    if (number >= 1) {
      System.out.println("The number " + " entered is positive");
    } else if (number <= -1) {
      System.out.println("The number " + " entered is negative");
    } else {
      System.out.println("The number is equal to " + number);
    }
  }

  public static void main(Scanner scanner) {

    System.err.println("Type a number No.1");
    int firstNumber = scanner.nextInt();
    System.err.println("Type a number No.2");
    int secondNumber = scanner.nextInt();

    if (firstNumber > secondNumber) {
      System.out.println("The first number is older to second number");
    } else if (secondNumber > firstNumber) {
      System.out.println("The second number is older to first number");
    } else {
      System.out.println("the 2 numbers are the same");
    }
  }

  public static void mai () {
    
    int [] prueba = new int [5];

    prueba [0] = 12;

    int prue = prueba [0];
    
    ArrayList <Integer> numbers = new ArrayList<>(); 

  }

}
