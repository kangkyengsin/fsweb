package exam;

import java.util.Scanner;

public class Ex37 {

    public static void main(String[] args) {
        // 길이 n이 입력되면 길이가 n인 사각형을 출력하시오.
        Scanner scan = new Scanner(System.in);
        System.out.print("한변의 갯수를 입력해주세요>");
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}