package inheritance.Functions;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private static int nextId;
    private String name;
    private int salary;
    private int id;

    {
        id = nextId;
        nextId++;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.id = nextId;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                id == employee.id &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, id);
    }

    @Override
    public int compareTo(Employee employee) {
        if(this.getSalary() < employee.getSalary()){
            return 1;
        } else if (this.getSalary() == employee.getSalary()){
            return 0;
        } else {
            return -1;
        }
    }
}
