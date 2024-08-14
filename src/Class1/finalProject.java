package Class1;

import java.util.Scanner;

public class finalProject {

  public static void main(String[] args)

  {
    Scanner scanner = new Scanner(System.in);

    while (true) {

      System.out.println("Menu");
      System.out.println("1. Calculator");
      System.out.println("2. Multiplication table");
      System.out.println("3. Select smallest number");
      System.out.println("4. Pyramid");
      System.out.println("5. Close");

      int menu = scanner.nextInt();

      switch (menu) {
        case 1:
          System.out.print("\033[H\033[2J");
          System.out.flush();
          Calculator(scanner);
          break;
        case 2:
          System.out.print("\033[H\033[2J");
          System.out.flush();
          multiplicationTableApp(scanner);
          break;
        case 3:
          System.out.print("\033[H\033[2J");
          System.out.flush();
          selectSmallestNumber(scanner);
          break;
        case 4:
          System.out.print("\033[H\033[2J");
          System.out.flush();
          pyramid(scanner);
          break;
        case 5:
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("Closing app");
          scanner.close();
          break;
        default:
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("Invalid option");
          break;
      }
    }
  }

  public static void Calculator(Scanner scanner) {

    while (true) {

      System.out.println("Calculator");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Main menu");

      int calculator = scanner.nextInt();

      if (calculator == 5) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        return;
      }

      System.out.print("\033[H\033[2J");
      System.out.flush();

      System.out.println("Type the first number");
      int firstValue = scanner.nextInt();

      System.out.print("\033[H\033[2J");
      System.out.flush();

      System.out.println("Type the second number");
      int secondValue = scanner.nextInt();

      int result = 0;

      switch (calculator) {
        case 1:
          result = sum(firstValue, secondValue);
          break;
        case 2:
          result = subtraction(firstValue, secondValue);
          break;
        case 3:
          result = multiplication(firstValue, secondValue);
          break;
        case 4:
          result = division(firstValue, secondValue);
          break;
        case 5:
          main(null);
          break;
        default:
          System.out.println("Invalid option");
          break;
      }
      System.out.println("the result is equal to " + result);
      scanner.nextLine();
      System.out.println("Press enter to continue... ");
      scanner.nextLine();
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }
  }

  public static int sum(int value1, int value2) {
    return value1 + value2;
  }

  public static int subtraction(int value1, int value2) {
    return value1 - value2;
  }

  public static int multiplication(int value1, int value2) {
    return value1 * value2;
  }

  public static int division(int value1, int value2) {
    return value1 / value2;
  }

  public static void multiplicationTableApp(Scanner scanner) {

    System.out.println("Type a number to create its multiplication table:");
    final int FIRST_VALUE = scanner.nextInt();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.println("Type the range for the multiplication table, example: 10 for 1x10):");
    int range = scanner.nextInt();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    scanner.nextLine();

    int multiplier = 1;

    while (multiplier <= range) {
      System.out.println(FIRST_VALUE + " x " + multiplier + " = " + (FIRST_VALUE * multiplier));
      multiplier++;
    }

    scanner.nextLine();
    System.out.println("Press Enter to return to the main menu...");
    scanner.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void selectSmallestNumber(Scanner scanner) {

    System.out.println("Choose the number of numbers you want to enter.");
    int size = scanner.nextInt();

    int[] numbers = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.println("Enter number " + (i + 1) + ":");
      numbers[i] = scanner.nextInt();
    }

    int smallest = numbers[0];
    for (int i = 1; i < size; i++) {
      if (numbers[i] < smallest) {
        smallest = numbers[i];
      }
    }

    System.out.println("The smallest number is: " + smallest);
    scanner.nextLine();
    System.out.println("Press Enter to return to the main menu...");
    scanner.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void pyramid(Scanner scanner) {
    System.out.println("Enter the size of the pyramid:");
    int size = scanner.nextInt();

    System.out.print("\033[H\033[2J");
    System.out.flush();

    for (int i = 1; i <= size; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("0");
      }
      System.out.println();
    }

    scanner.nextLine();
    System.out.println("Press Enter to return to the main menu...");
    scanner.nextLine();

    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

}