import java.util.Scanner;

public class conditionals {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Abre el scanner para que el usuario pueda ingresar datos

    System.out.println("Elija que proyecto quiere ejecutar");
    System.out.println("1. App para Verificar la edad");
    System.out.println("2. App para ver si el alumno aprobo");
    System.out.println("3. App para ver que número es menor");
    System.out.println("4. App para si el número es par o impar");
    System.out.println("5. App para ver si un número es negativo o positivo");
    System.out.println("6. App para ver el tipo de triangulo");

    int next = scanner.nextInt();

    switch (next) {
      case 1:
        ageverifier(scanner);
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
        System.out.println("opción no valida");
        break;
    }
    scanner.close();
  }

  public static void ageverifier(Scanner scanner) {
    System.out.println("Digite su edad:");
    int age = scanner.nextInt();

    if (age >= 18) {
      System.out.println("Eres mayor de edad");
    } else {
      System.out.println("Eres menor de edad");
    }
  }

  public static void student(Scanner scanner) {

    System.out.println("Ingrese la primera nota");
    int nota1 = scanner.nextInt();

    System.out.println("Ingrese la segunda nota");
    int nota2 = scanner.nextInt();

    System.out.println("Ingrese la tercera nota");
    int nota3 = scanner.nextInt();

    System.out.println("Ingrese la cuarta nota");
    int nota4 = scanner.nextInt();

    System.out.println("Ingrese la quinta nota");
    int nota5 = scanner.nextInt();

    double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5.0;

    if (promedio >= 70) {
      System.out.println("¡Felicitaciones!, has pasado de curso, tu promedio fue de " + promedio);
    } else {
      System.out.println("Te quemaste, esfuerzate más para la proxima, tu promedio fue de " + promedio);

      scanner.close();
    }
  }

  public static void minor(Scanner scanner) {

    System.out.println("Ingrese el primer número");
    int number1 = scanner.nextInt();

    System.out.println("Ingrese el Segundo número");
    int number2 = scanner.nextInt();

    System.out.println("Ingrese el tercer número");
    int number3 = scanner.nextInt();

    int numberminor;

    if (number1 <= number2 && number1 < number3) {
      numberminor = number1;
    } else if (number2 <= number1 && number2 < number3) {
      numberminor = number2;
    } else {
      numberminor = number3;
    }

    System.out.println("El número menor es " + numberminor);

    scanner.close();
  }

  public static void numbers(Scanner scanner)

  {

  }

  public static void negative(Scanner scanner) {

  }

  public static void triangle(Scanner scanner) {

  }

}
