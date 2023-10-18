package a1018.sec02.exam01;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        System.out.println(list);
    }
}
