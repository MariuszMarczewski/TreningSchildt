package inheritance.newVersionWithComparable;

import java.util.*;

public class  Main {

    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Employee staff1 = new Employee("dwururka", 6000);
        Employee staff2 = new Employee("sztucer", 7000);
        Employee boss = new Employee("pompka", 10000);

        List<Employee> employees = new ArrayList<>();
        employees.add(staff1);
        employees.add(staff2);
        employees.add(boss);

        Student s1 = new Student("Patryk", 2000);
        Student s2 = new Student("Damian", 2600);
        Student s3 = new Student("filip", 2200);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Pair<Student> studentPair = new Pair<>(students.get(0), students.get(1));

        System.out.println(studentPair);


//        for(Employee e : employees){
//            System.out.println(e.getId() + " : " + e.getName() + " : " + e.getSalary());
//        }
//
//        System.out.println("=======================================================");
//
//        Collections.sort(employees, Employee::compareTo);
//
//        for(Employee e : employees){
//            System.out.println(e.getId() + " : " + e.getName() + " : " + e.getSalary());
//        }
//
//        System.out.println("=======================================================");
//
//        Employee[] employees1 = employees.stream().toArray(Employee[]::new);
//
//        System.out.println("=======================================================");
//
//        Collections.sort(employees, Comparator.comparing(Employee::getName,
//                Comparator.nullsFirst(Comparator.naturalOrder())));
//
//        System.out.println("=======================================================");
//
//        Set<Employee> set = new TreeSet<>(Comparator.comparing(Employee::getSalary));
//        set.add(staff1);
//        set.add(staff2);
//        set.add(boss);
//
//        for(Employee tree : set){
//            System.out.println(tree);
//        }
//
//        System.out.println("=======================================================");
//
//        NavigableSet<Employee> navigableSet = new TreeSet<>(Comparator.comparing(Employee::getSalary));
//        navigableSet.addAll(set);
//        Employee first = navigableSet.first();
//        System.out.println(first);
//
//        System.out.println("=======================================================");
//
//        Employee last = navigableSet.last();
//        System.out.println(last);
//
//        System.out.println("=======================================================");

    }
}
