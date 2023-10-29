package a1024.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// 사람 목록에서 나이가 가장 어린 사람 찾기
public class Ex03 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22));
        Optional<Person> youngestPerson = people.stream()
                .min(Comparator.comparing(Person::getAge));

        youngestPerson.ifPresent(person -> System.out.println("가장어린친구: " + person.getName()));
        // String youngestName = youngestPerson.map(Person::getName).orElse("No youngest
        // person found");
        // System.out.println("Youngest person: " + youngestName);

    }
}
/*
 * import java.util.*;
 * import java.util.stream.Collectors;
 * 
 * class Person {
 * private String name;
 * private int age;
 * 
 * public Person(String name, int age) {
 * this.name = name;
 * this.age = age;
 * }
 * 
 * public String getName() {
 * return name;
 * }
 * 
 * public int getAge() {
 * return age;
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * List<Person> people = Arrays.asList(
 * new Person("Alice", 25),
 * new Person("Bob", 30),
 * new Person("Charlie", 22)
 * );
 * 
 * Person youngestPerson = null;
 * for (Person person : people) {
 * if (youngestPerson == null || person.getAge() < youngestPerson.getAge()) {
 * youngestPerson = person;
 * }
 * }
 * 
 * if (youngestPerson != null) {
 * System.out.println("Youngest person: " + youngestPerson.getName());
 * } else {
 * System.out.println("No youngest person found");
 * }
 * }
 * }
 */