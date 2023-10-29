package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex72_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int max = 0;

        while(true) {
            System.out.println();
            System.out.println("숫자를 입력하세요>");
            int num = scan.nextInt();
            System.out.println();
            if (num == 0) {
                break; // 0을 입력하면 반복문을 종료합니다.
            }
            arr.add(num);
            for(int i=0; i<arr.size();i++){
                if(max<arr.get(i)){
                    max = arr.get(i);
                }
                System.out.print("," + arr.get(i));
            }
            System.out.println();
            System.out.println("입력받은 숫자의 최대값은?" + max);
        }
    }
}
