package a1024.ex;

import java.util.Arrays;
import java.util.List;

// 사람 목록에서 특정 조건을 만족하는 사람 수 구하기
// 성별이 여성인 사람수 구하기

public class Ex05 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25, "여성"),
                new Person("Bob", 30, "남성"),
                new Person("Charlie", 22, "여성"));
        long femlaeCount = people.stream()
                .filter(person -> "여성".equals(person.getGender()))
                .count();
        System.out.println(femlaeCount);
    }
}
