package a1004;

import java.util.Scanner;

public class A1004_10 {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inpString;

        do {
            System.out.print(">");
            inpString = scanner.nextLine();
            System.out.println(inpString);
        } while( ! inpString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
