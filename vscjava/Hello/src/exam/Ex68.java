package exam;

import java.util.Scanner;

public class Ex68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요>");
        int n = scan.nextInt();

        while(0!=n){
            System.out.printf("%d", n);
            n=n-1;
        }
    }
}
