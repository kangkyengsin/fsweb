package exam;

import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("a값은: " + a);
        int b = scan.nextInt();
        System.out.println("b값은: " + b);

        int num = 0;
        switch(num){
            case 1:
            System.out.println("합계: " + (a + b));
            return;
            case 2:
            System.out.println("합계: " + (a - b));
            return;
            case 3:
            System.out.println("합계: " + (a * b));
            return;
            case 4:
            System.out.println("합계: " + (a / b));
            return;
        }
        System.out.println(num);

    }
}
