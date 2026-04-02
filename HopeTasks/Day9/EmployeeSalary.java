package Day9;
public class EmployeeSalary{
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("John", 1, 50000);
        Employee e2 = new PartTimeEmployee("Sam", 2, 5, 200);

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
    }
}
abstract class Employee {
    String name;
    int id;

    abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double salary) {
        this.name = name;  
        this.id = id;
        this.monthlySalary = salary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    int hours;
    double rate;

    PartTimeEmployee(String name, int id, int hours, double rate) {
        this.name = name;
        this.id = id;
        this.hours = hours;
        this.rate = rate;
    }

    double calculateSalary() {
        return hours * rate;
    }
}

