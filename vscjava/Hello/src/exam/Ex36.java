package exam;

import java.util.Scanner;

public class Ex36 {

    public static void main(String[] args) {
        // 1부터 n까지, 1부터 m 까지 숫자가 적힌 색이 서로 다른 주사위 2개를 던졌을 때, 나올 수 있는 모든 경우를 출력해보자.
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요>");
        int n = scan.nextInt();
        System.out.print("두번째 숫자를 입력해주세요>");
        int m = scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(i+" "+j);
            }
        }
        
    }
}