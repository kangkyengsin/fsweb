package a1018.sec02.exam01;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        System.out.println(sum);
    }
}
