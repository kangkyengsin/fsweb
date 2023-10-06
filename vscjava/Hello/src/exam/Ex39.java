package exam;

import java.util.Scanner;

public class Ex39 {

    public static void main(String[] args) {
        // 세 정수가 주어지면 그 중 가장 작은 수를 출력한다
        Scanner scan = new Scanner(System.in);
        int[] num = new int [3];
        for (int i=0; i<3; i++) {
            System.out.println("숫자를 입력해주세요>");
            num[i] = scan.nextInt();
        }// 8 4 3
        int min = num[0];
        for(int i=0; i < num.length; i++) {
            if(min>num[i]) {
                min = num[i];
            }
        }
        System.out.println("최소값은?"+min);
    }
}