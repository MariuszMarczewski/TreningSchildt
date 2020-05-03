package inheritance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Karol Dvorak",
                5000, LocalDate.of(2010, 12, 13));
        Employee e2 = new Employee("Milos Kunes",
                6000, LocalDate.of(2018, 7, 11));
        Employee boss = new Manager("Ivanka Trump", 10000,
                LocalDate.of(2017, 05, 01));

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(boss);

        for(Employee e : employees){
            System.out.println(e.getName() + " : " + e.getSalary());
        }
    }
}
