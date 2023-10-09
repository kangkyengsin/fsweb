package exam;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // 두 개의 문자를 입력 받은 후 순서를 바꿔 출력해보자.

        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 문자를 입력 >");
        String a = scan.next();
        System.out.print("두번째 문자를 입력 >");
        String b = scan.next();
        
        System.out.print(b+" "+a);
    }
}
