package exam;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.printf("%o",num);
        // %o 는 8진수
        // %x 는 16진수
        System.out.printf("%x",num);
    }
}
