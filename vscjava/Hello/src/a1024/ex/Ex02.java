package a1024.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//숫자 목록에서 중복값 제거하기
public class Ex02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }
}