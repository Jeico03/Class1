import java.util.Scanner;

public class Tarea1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); // Abre el scanner para que el usuario pueda ingresar datos

    System.out.println("Digite su edad"); // se le pregunta al usuario su edad :v
    int age = scanner.nextInt();

    if (age >= 18) {
      System.out.println("Eres mayor de edad");
    } else
      System.out.println("Eres menor de edad");

    scanner.close();

  }
}
