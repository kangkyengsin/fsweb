package exam;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        //시간이 특정 형식에 맞추어 입력될 때 그대로 출력하는 프로그램을 작성 해보자.

        Scanner scan = new Scanner(System.in);
        System.out.print("시간를 입력 >");
        String a = scan.next();
        System.out.print("분를 입력 >");
        String b = scan.next();
        
        System.out.print(a+" : "+b);
    }
}
