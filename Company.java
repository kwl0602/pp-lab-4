import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Marcin Kasek", 85000, 0);
        employees[1] = new Worker("Kamil Vas", 67000, "Programista");
        employees[2] = new Employee("Aleksandra Kas", 60000);
        employees[3] = new Manager("Maciek Das", 55000, 5);
        employees[4] = new Worker("Lucek Mas", 110000, "Informatyk");

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
