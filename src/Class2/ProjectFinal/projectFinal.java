package Class2.ProjectFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class projectFinal {
  public static void main(String[] args) {
    Service service = new Service();
    Scanner scanner = new Scanner(System.in);

    int option;

    while (true) {
      System.out.println("Employee manager");
      System.out.println("1. Add new employees");
      System.out.println("2. Update existing employees");
      System.out.println("3. Eliminate any employee");
      System.out.println("4. Show existing employees who are in the system");
      System.out.println("5. Close the program");

      option = scanner.nextInt();

      System.out.print("\033[H\033[2J");
      System.out.flush();

      try {
        switch (option) {
          case 1:
            Empleado empleado = service.askUserForData(scanner);
            service.addEmpleado(empleado);
            break;
          case 2:
            System.out.println("Enter employee index to update:");
            int indexToUpdate = scanner.nextInt();
            Empleado updatedEmpleado = service.askUserForData(scanner);
            service.updateEmpleado(indexToUpdate, updatedEmpleado);
            break;
          case 3:
            System.out.println("Enter employee index to delete:");
            int indexToDelete = scanner.nextInt();
            service.deleteEmpleado(indexToDelete);
            break;
          case 4:
            service.showEmpleados();
            break;
          case 5:
            scanner.close();
            return;
          default:
            System.out.println("Invalid option");
            break;
        }
      } catch (NumberFormatException e) {
        System.out.println(ExceptionHandler.handleNumberFormatException(e));
      } catch (IndexOutOfBoundsException e) {
        System.out.println(ExceptionHandler.handleIndexOutOfBoundsException(e));
      } catch (Exception e) {
        System.out.println(ExceptionHandler.handleException(e));
      }

    }
  }

}

interface IGestorEmpleado {

  void addEmpleado(Empleado empleado);

  void updateEmpleado(int index, Empleado empleado);

  void deleteEmpleado(int index);

  void showEmpleados();

  Empleado askUserForData(Scanner scanner);
}

class Persona {
  private String name;
  private String lastName;
  private int age;

  @Override
  public String toString() {
    return "Persona [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
  }

  public Persona(String name, String lastName, int age) {
    this.name = name;
    this.lastName = lastName;
    this.age = age;
  }

  public Persona() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

class Empleado extends Persona {

  private int salary;

  public Empleado(String name, String lastName, int age, int salary) {
    super(name, lastName, age);
    this.salary = salary;
  }

  public Empleado() {
  }

  @Override
  public String toString() {
    return "Empleado [name=" + getName() + ", lastName=" + getLastName() + ", age=" + getAge() + ", salary=" + salary
        + "]";
  }

  public int annualSalary() {
    return salary * 12;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}

class EmpleadoTiempoCompleto extends Empleado {
  private String schedule = "8 hour work day";

  public EmpleadoTiempoCompleto(String name, String lastName, int age, int salary, String schedule) {
    super(name, lastName, age, salary);
    this.schedule = schedule;
  }

  public EmpleadoTiempoCompleto() {
  }

  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }
}

class EmpleadoTiempoParcial extends Empleado {
  private String schedule = "part time day";

  public EmpleadoTiempoParcial(String name, String lastName, int age, int salary, String schedule) {
    super(name, lastName, age, salary);
    this.schedule = schedule;
  }

  public EmpleadoTiempoParcial() {
  }

  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }
}

class CRUD<T> {
  private List<T> objetos = new ArrayList<>();

  public void create(T objeto) {
    objetos.add(objeto);
    System.out.println("Object added successfully.");
  }

  public List<T> read() {
    return objetos;
  }

  public void update(int index, T objetoActualizado) {
    if (index >= 0 && index < objetos.size()) {
      objetos.set(index, objetoActualizado);
      System.out.println("Object updated successfully.");
    } else {
      System.out.println("Invalid index.");
    }
  }

  public void delete(int index) {
    if (index >= 0 && index < objetos.size()) {
      objetos.remove(index);
      System.out.println("Object deleted successfully.");
    } else {
      System.out.println("Invalid index.");
    }
  }
}

class GestorEmpleado extends CRUD<Empleado> implements IGestorEmpleado {

  public void addEmpleado(Empleado empleado) {
    create(empleado);
  }

  public void updateEmpleado(int index, Empleado empleadoActualizado) {
    update(index, empleadoActualizado);
  }

  public void deleteEmpleado(int index) {
    delete(index);
  }

  public void showEmpleados() {
    List<Empleado> empleados = read();
    for (Empleado empleado : empleados) {
      System.out.println(empleado.toString());
    }
  }

  public Empleado askUserForData(Scanner scanner) {

    System.out.println("Enter employee name:");
    String name = scanner.next();
    System.out.println("Enter employee last name:");
    String lastName = scanner.next();
    System.out.println("Enter employee age:");
    int age = scanner.nextInt();
    System.out.println("Enter employee salary:");
    int salary = scanner.nextInt();

    return new Empleado(name, lastName, age, salary);

  }
}

class Service extends GestorEmpleado {

  public void addEmpleado(Empleado empleado) {
    if (empleado.getAge() >= 18) {
      super.addEmpleado(empleado);
      System.out.println("Employee added successfully.");
    } else {
      System.out.println("Cannot add employee. The employee must be at least 18 years old.");
    }
  }
}

class ExceptionHandler {

  public static String handleInputException(Exception e) {
    return "Invalid input: " + e.getMessage();
  }

  public static String handleNumberFormatException(NumberFormatException e) {
    return "Number format error: " + e.getMessage();
  }

  public static String handleIndexOutOfBoundsException(IndexOutOfBoundsException e) {
    return "Index out of bounds: " + e.getMessage();
  }

  public static String handleException(Exception e) {
    return "An error occurred: " + e.getMessage();
  }
}
