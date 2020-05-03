package inheritance.Functions;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        Employee staff1 = new Employee("dwururka", 6000);
        Employee staff2 = new Employee("sztucer", 7000);
        Employee boss = new Employee("pompka", 10000);

        employees.add(staff1);
        employees.add(staff2);
        employees.add(boss);

        for (Employee e : employees) {
            System.out.println(e.getId() + " : " + e.getName() + " : " + e.getSalary());
        }

        System.out.println("=======================================================");

        Predicate<Employee> p = employee -> employee.getSalary() > 7000;
        Predicate<Employee> p1 = employee -> employee.getName().length() < 12;

        checkEmployee(p, p1, new Employee("Don Kichot", 11000));

        System.out.println("=======================================================");

        Consumer<Employee> consumer = (employee) -> System.out.println(employee.getName()
                + " " + employee.getId());
        Consumer<Employee> consumer1 = (employee) -> System.out.println(employee.getSalary());

        printEmployee(consumer, consumer1, new Employee("Don Kichot", 11000));

        System.out.println("=======================================================");

        checkSupplier();

        System.out.println("=======================================================");

        Function<String, Integer> function = (s) -> s.length();

        checkStringLength(function, "warka");
    }

    private static void checkStringLength(Function<String, Integer> function, String s) {
        System.out.println(function.apply(s));
    }

    private static void checkSupplier() {
        Random r = new Random(10);
        Supplier<Integer> supplier = r::nextInt;
        System.out.println(supplier.get());
    }

    private static void printEmployee(Consumer<Employee> consumer, Consumer<Employee> consumer1, Employee don_kichot) {
        consumer.andThen(consumer1).accept(don_kichot);
    }

    private static void checkEmployee(Predicate<Employee> p, Predicate<Employee> p1, Employee e) {
        System.out.println(p.and(p1).test(e));
    }

}
