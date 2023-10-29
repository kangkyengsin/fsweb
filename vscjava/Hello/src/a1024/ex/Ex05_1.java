package a1024.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 사람 목록에서 특정 조건을 만족하는 값 출력
// 나이가 25살 이상인 사람 이름과 성별을 출력하시오.

public class Ex05_1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "여성"),
                new Person("Bob", 30, "남성"),
                new Person("Charlie", 22, "여성"));
        long femlaeCount = people.stream()
                .filter(person -> "여성".equals(person.getGender()))
                .count();
        System.out.println(femlaeCount);

        List<Person> filteredPeople = people.stream()
        .filter(person -> person.getAge() >=25)
        .collect(Collectors.toList());

        for(Person person : filteredPeople){
            System.out.println("name: " + person.getName() + ", age: " + person.getAge());
        }
        filteredPeople.forEach(person ->{
            System.out.println("name: " + person.getName() + ", age: " + person.getAge());
        });
    }
}
