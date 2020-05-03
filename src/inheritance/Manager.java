package inheritance;

import java.time.LocalDate;

public class Manager extends Employee {

    private int bonus;

    public Manager(String name, int salary, LocalDate date) {
        super(name, salary, date);
        this.bonus = 2000;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getSalary() {
        int salary = super.getSalary();
        return salary + bonus;
    }
}
