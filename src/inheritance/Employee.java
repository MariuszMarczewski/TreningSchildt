package inheritance;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String name;
    private int salary;
    private LocalDate date;

    public Employee(String name, int salary, LocalDate date) {
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(name, employee.name) &&
                Objects.equals(date, employee.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, date);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }

}
