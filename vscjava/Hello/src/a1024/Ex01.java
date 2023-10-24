package a1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> enenNumbers = numbers.stream()
        .filter(n -> n%2 == 0)
        .collect(Collectors.toList());

        System.out.println(enenNumbers);
    }
}
