package Day3;

import java.util.Objects;

public class Employee {

    public static void main(String[] args) {

        Employee e1 = new Employee("Jan Kowalski", 32, 2345);
        Employee e2 = new Employee("Ewa Adamska", 17, 1850);
        Employee e3 = new Employee("Jan Kowalski", 32, 2345);
        Employee e4 = new Employee("Jan Kowalski", 32, 5000);

        if (e1.equals(e3)){
            System.out.println("Ta sama osoba");
        } else {
            System.out.println("Różne osoby");
        }

        if (e1.equals(e4)){
            System.out.println("Ta sama osoba");
        } else {
            System.out.println("Różne osoby");
        }

        Manager m1 = new Manager(e1.name, e1.age, e1.salary, 3000);
        Manager m2 = new Manager("Arek Sordyl", 41, 4500, 4000);
        Manager m3 = new Manager("Arek Sordyl", 41, 4500, 4000);
        Manager m4 = new Manager(e4.name, e4.age, e4.salary, 3000);
        if (m1.equals(m2)){
            System.out.println("Ten sam Manager");
        } else {
            System.out.println("Różni Managerowie");
        }
        if (m1.equals(m3)){
            System.out.println("Ten sam Manager");
        } else {
            System.out.println("Różni Managerowie");
        }
        if (m1.equals(m4)){
            System.out.println("Ten sam Manager");
        } else {
            System.out.println("Różni Managerowie");
        }
        if (m2.equals(m3)){
            System.out.println("Ten sam Manager");
        } else {
            System.out.println("Różni Managerowie");
        }
    }

    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                salary == employee.salary &&
                Objects.equals(name, employee.name); //name.equals(employee.name);
    }

}

class Manager extends Employee {
    int salaryBonus;

    public Manager(String name, int age, int salary, int salaryBonus) {
        super(name, age, salary);
        this.salaryBonus = salaryBonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", salaryBonus=" + salaryBonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return salaryBonus == manager.salaryBonus;
    }

}
