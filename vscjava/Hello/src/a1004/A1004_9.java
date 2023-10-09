package a1004;

import java.util.Scanner;

public class A1004_9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean run = true;
            int speed = 0;

            while(run) {
                System.out.println("_______________");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("_______________");
                System.out.println("선택: ");

                String strNum = scanner.nextLine();

                if (strNum.equals("1")) {
                    speed++;
                    System.out.println("현재 속도 = " + speed);
                }else if (strNum.equals("2")) {
                    speed--;
                    System.out.println("현재 속도 = " + speed);
                } else if (strNum.equals("3")){
                    run = false;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}
