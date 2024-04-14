public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Marcin Kasek", 85000);
        employees[1] = new Employee("Kamil Vas", 67000);
        employees[2] = new Employee("Aleksandra Kas", 60000);
        employees[3] = new Employee("Maciek Das", 55000);
        employees[4] = new Employee("Lucek Mas", 110000);

        System.out.println("Pracownik indeks 3: " + employees[3]);

        employees[3].setSalary(60000);

        System.out.println("Zaktualizowane dane pracownika z indeksu 3: " + employees[3]);

        System.out.println("Dane wszystkich pracowników:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

}
