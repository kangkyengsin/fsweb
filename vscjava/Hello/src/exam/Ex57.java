package exam;

import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("선택 하시오");
        int a = 400;
        int b = 340;
        int c = 170;
        int d = 100;
        int e = 70;
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        switch (number1) {
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(b);
                break;
            case 3:
                System.out.println(c);
                break;
            case 4:
                System.out.println(d);
                break;
            case 5:
                System.out.println(e);
                break;
        }
        switch (number2) {
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(b);
                break;
            case 3:
                System.out.println(c);
                break;
            case 4:
                System.out.println(d);
                break;
            case 5:
                System.out.println(e);
                break;
        }
        int sum = number1 + number2;

        if (sum < 500) {
            System.out.println("no angry");
        } else {
            System.out.println("angry");
        }
        System.out.println(sum);
    }
}
