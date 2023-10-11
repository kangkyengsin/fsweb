package exam;

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("윷놀이 앞은1 뒤는0");
        System.out.println("숫자를 입력하세요>");
        int a = scan.nextInt();
        System.out.println("a :" + a);
        int b = scan.nextInt();
        System.out.println("b :" + b);
        int c = scan.nextInt();
        System.out.println("c :" + c);
        int d = scan.nextInt();
        System.out.println("d :" + d);
        
        int sum = (a+b+c+d);

        if(sum == 1) {
            System.out.println("도");
        }
        else if (sum ==2){
            System.out.println("개");
        }
        else if (sum ==3){
            System.out.println("걸");
        }
        else if (sum ==4){
            System.out.println("윳");
        }
        else{
            System.out.println("모");
        }

        System.out.println();
    }
}