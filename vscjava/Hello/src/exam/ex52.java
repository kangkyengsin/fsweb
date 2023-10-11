package exam;

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        //영어에서 서수를 나타낼 때 다음과 같이 나타낸다.
        // 1st  2nd  3rd  4th  5th  6th  ... 
        // 11th 12th 13th 14th 15th...
        // 21st 22nd 23rd 24th 25th ...
        // 31st 32nd 33rd 34th 35th...
        // 41st 42nd 43rd 44th 45th...
        // ...
        // 91st 92nd 93rd 94th 95th ... 99th

        // 1부터 99까지의 숫자가 입력되면 영어 서수 표현으로 출력하시오.

        Scanner in = new Scanner(System.in);
        Ex52 i = new Ex52();
        int input;
        do {
            System.out.print("Input a number. (Quit: input 0):");
            input = in.nextInt();
            if(input!=0)
                System.out.println("Ordinal:"+i.ordinal(input));
        }while(input!=0);
    }

    String ordinal(int n) {
        String ord;
        if(n%10==1 && n%100!=11)
            ord="st";
        else if(n%10==2 && n%100!=12)
            ord="nd";
        else if(n%10==3 && n%100!=13)
            ord="rd";
        else ord="th";
        return (n+ord);
    }
}
