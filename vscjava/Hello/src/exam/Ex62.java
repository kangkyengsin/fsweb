package exam;

import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int grade = sc.nextInt();
        int group = sc.nextInt();
        int number = sc.nextInt();
        
        if(grade > 3 || group > 20 || number > 999 ) {
            System.out.println("입력범위를 초과하였습니다.");
        } else {
            System.out.printf("%d%02d%03d",grade,group,number);
        }
    }
}
