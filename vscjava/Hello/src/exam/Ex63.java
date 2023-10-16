package exam;

import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("날짜을 입력하시오>");
        int day  = scan.nextInt();
        int hour  = day*24;

        System.out.println(hour + "시간");
    }
}
