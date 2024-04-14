import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Marcin Kasek", 85000, 0);
        employees[1] = new Worker("Kamil Vas", 67000, "Programista");
        employees[2] = new Employee("Aleksandra Kas", 60000);
        employees[3] = new Manager("Maciek Das", 55000, 5);
        employees[4] = new Worker("Lucek Mas", 110000, "Informatyk");
        employees[5] = new Worker("Marek Ras", 54000, "HR");
        employees[6] = new Manager("Franek Klark", 58000, 3);

        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + 500);
        }

        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                ((Manager) emp).setNumberOfSubordinates(7500);
                emp.setSalary(7500);
            }
        }

        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}