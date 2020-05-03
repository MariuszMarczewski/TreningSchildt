package inheritance.Functions;

public class Manager extends Employee {
    int bonus;
    public Manager(String name, int salary) {
        super(name, salary);
        int bonus = 2000;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + bonus;

    }
}
