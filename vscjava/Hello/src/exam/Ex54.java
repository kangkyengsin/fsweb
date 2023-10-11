package exam;

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a값의 값을 입력하세요");
        int a = scan.nextInt();
        System.out.print("b값의 값을 입력하세요");
        int b = scan.nextInt();
        
        int x = 0;
        if(b%a==0){
            x = b/a;
            System.out.println(a+"*"+x+"="+b);
        }else if (a%b==0){
            x = a/b;
            System.out.println(a+"*"+x+"="+b);
        }else{
            System.out.println("none");
        }
    }
    
}
