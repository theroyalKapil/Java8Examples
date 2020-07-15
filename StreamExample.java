package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee("Peter", "Albert", 11),
                new Employee("Ram", "sharma", 22),
                new Employee("Praveen", "singh", 33));


        //sort the list
        Collections.sort(empList, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        //print the list
        empList.stream()
                .forEach((Employee e) -> System.out.println(e.getFirstName() + " " + e.getLastName()));

        //print last name start with s
        empList.stream()
                //.map((Employee e) -> {e.getAge() + 1})
                .filter((Employee e) -> e.getLastName().startsWith("s"))
                .forEach((Employee e) -> System.out.println(e.getFirstName() + " " + e.getLastName()));

        Stream.of(2, 3, 4).forEach((Integer i) -> System.out.println(i));
    }
}
