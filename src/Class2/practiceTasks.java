package Class2;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Class2.ProjectFinal.Persona;

public class practiceTasks {

  public static void main(String[] args) {

    // #region mini project 1 class 2 step 1

    Persona persona1 = new Persona("Jeico", "Arias", 17);

    Persona persona2 = new Persona("Ana", "Gonzalez", 22);

    Persona persona3 = new Persona("Luis", "Perez", 28);

    Persona persona4 = new Persona("Maria", "Fernandez", 39);

    Persona persona5 = new Persona("Juanito", "Perez", 94);

    Persona persona6 = new Persona("Juanito", "Perez", 94);

    // #region mini project 6 class 2 step 5

    Persona persona7 = new Persona("Marco", "felix");

    Persona persona8 = new Persona("Antonio", "Torres");

    Persona persona9 = new Persona("armando");

    Persona persona10 = new Persona("Leo");

    Persona persona11 = new Persona();

    Persona persona12 = new Persona();

    System.out.println(persona1);
    System.out.println(persona2);
    System.out.println(persona3);
    System.out.println(persona4);
    System.out.println(persona5);
    System.out.println(persona6);
    System.out.println(persona7);
    System.out.println(persona8);
    System.out.println(persona9);
    System.out.println(persona10);
    System.out.println(persona11);
    System.out.println(persona12);
  }
}

interface IVehiculo {

  String startUp();

  String brake();
}

interface IDibujable {

  void dibujar();

}

// #region mini project 7 class 2 step 6

abstract class figuraGeometrica {

  String color = "hola";
  int height = 0;
  int width = 0;

  public figuraGeometrica(String color, int height, int width) {
    this.color = color;
    this.height = height;
    this.width = width;
  }

  public figuraGeometrica() {
  }

  public abstract int calculateArea();

  public String printInformation() {
    return "color " + color + ", height " + height + ", width " + width;
  }

}

class Cuadrado extends figuraGeometrica implements IDibujable {

  int length = 2;
  int width = 2;

  public Cuadrado(String color, int height, int width, int length, int width2) {
    super(color, height, width);
    this.length = length;
    width = width2;
  }

  public Cuadrado() {
  }

  @Override
  public int calculateArea() {
    return length * width;
  }

  @Override
  public void dibujar() {
    for (int i = 0; i < 4; i++) {
      System.out.println("0 0");
      System.out.println("0 0");
    }
  }
}

class Circulo extends figuraGeometrica implements IDibujable {

  int length = 2;
  int width = 4;

  public Circulo(String color, int height, int width, int length, int width2) {
    super(color, height, width);
    this.length = length;
    this.width = width;
  }

  public Circulo() {
  }

  @Override
  public int calculateArea() {
    return length * width;
  }

  @Override
  public void dibujar() {
    System.out.println(" 000 ");
    System.out.println("0   0");
    System.out.println("0   0");
    System.out.println(" 000 ");
  }
}

class Persona {

  String name;
  String lastName;
  int age;

  @Override
  public String toString() {
    return "Persona [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
  }

  Persona(String name, String lastName, int age) {
    this.name = name;
    this.lastName = lastName;
    this.age = age;
  }

  public Persona(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
  }

  public Persona(String name) {
    this.name = name;
  }

  public Persona() {
  }

}

// #region mini project 2 class 2 step 1

class Empleado {
  String name;
  String lastName;
  int salary;
  int hiringDate;

  public String seeAllEmployeeInformation() {
    return "Name: " + name + " last name: " + lastName + " salary: " + salary + " hiring Date: " + hiringDate;
  }

  public int annualSalary() {
    return salary * 12;
  }

  public int seniorityInTheCompany() {
    return Year.now().getValue() - hiringDate;
  }
}

// #region mini project 3 class 2 step 2

class vehicle {
  String brand;
  String model;
  int year;

  public String getInformation() {
    return "Brand: " + brand + " Model: " + model + "Year: " + year;
  }
}

// #region mini project 4 class 2 step 3

class Automobile extends vehicle {

  private String color;
  boolean hasSunroof;
  public int numberOfWheels;
  protected int numberOfDoors;
  private String engine;
  public String owner;

  public Automobile(String color, boolean hasSunroof, int numberOfWheels, int numberOfDoors, String engine,
      String owner) {
    this.color = color;
    this.hasSunroof = hasSunroof;
    this.numberOfWheels = numberOfWheels;
    this.numberOfDoors = numberOfDoors;
    this.engine = engine;
    this.owner = owner;
  }

  public Automobile() {
  }

  public String getInformation() {
    return "Brand: " + brand + " Model: " + model + " Year: " + year + " color: " + color + "Has sunroof:" + hasSunroof
        + "engine: " + engine;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}

// #region mini project 5 class 2 step 4

class car extends Automobile implements IVehiculo {
  boolean clasic;

  @Override
  public String startUp() {
    return "Starting the automobile";
  }

  @Override
  public String brake() {
    return "braking the automobile";
  }

  public String information() {
    return "clasic: " + clasic + ", number of doors " + numberOfDoors;
  }
}

class van extends vehicle {
  String seats;
  int numberOfDoors;

  public String getInformation() {
    return "Brand: " + brand + " Model: " + model + " Year: " + year + " seats " + seats + " numberOfDoors "
        + numberOfDoors;
  }
}

class motorcycle extends vehicle implements IVehiculo {
  String color;
  boolean isElectric;

  @Override
  public String startUp() {
    return "Starting the motorcycle";
  }

  @Override
  public String brake() {
    return "braking the motorcycle";
  }

  public String getInformation() {
    return "Brand: " + brand + " Model: " + model + " Year: " + year + " color: " + color + " Is electric: "
        + isElectric;
  }

}

// #region mini project 8 class 2 step 7
class Lista<T> {

  private List<T> list = new ArrayList<>();

  public Lista(ArrayList<T> list) {
    this.list = list;
  }

  public void create(T elemento) {
    list.add(elemento);
  }

  public T read(int indice) {
    if (indice < 0 || indice >= list.size()) {
      throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
    }
    return list.get(indice);
  }

  public T remove(int indice) {
    if (indice < 0 || indice >= list.size()) {
      throw new IndexOutOfBoundsException("Índice fuera de rango: " + indice);
    }
    return list.remove(indice);
  }

}

// #region mini project 9 class 2 step 8
class Excepciones {

  public static void Exception() {

    try {
      int[] numeros = { 1, 2, 3 };
      int numero = numeros[5];
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Índice de array fuera de límites.");
    }
  }
}