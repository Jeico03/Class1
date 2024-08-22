package Class2;

public class practiceTasks {

  public static void main(String[] args) {

    // #region mini project 1 class 2

    Persona persona1 = new Persona();

    persona1.name = "Jeico";
    persona1.lastName = "Arias Brito";
    persona1.Age = 17;

    Persona persona2 = new Persona();
    persona2.name = "Ana";
    persona2.lastName = "Gonzalez";
    persona2.Age = 22;

    Persona persona3 = new Persona();
    persona3.name = "Luis";
    persona3.lastName = "Martinez";
    persona3.Age = 30;

    Persona persona4 = new Persona();
    persona4.name = "Maria";
    persona4.lastName = "Fernandez";
    persona4.Age = 27;

    Persona persona5 = new Persona();
    persona5.name = "Pedro";
    persona5.lastName = "Lopez";
    persona5.Age = 35;

    System.out.println(persona1.showInformation());
    System.out.println(persona2.showInformation());
    System.out.println(persona3.showInformation());
    System.out.println(persona4.showInformation());
    System.out.println(persona5.showInformation());
  }
}

class Persona {

  String name;
  String lastName;
  int Age;

  public String showInformation() {
    return "Name: " + name + " last name: " + lastName + " Age: " + Age;
  }
}

// #region mini project 2 class 2

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
    return 2024 - hiringDate;
  }
}

class vehicle {
  String brand;
  String model;
  int year;

  public String getInformation() {
    return "Brand: " + brand + " Model: " + model + "Year: " + year;
  }
}

class Automobile extends vehicle {

}

class van extends vehicle {

}

class motorcycle extends vehicle {

}