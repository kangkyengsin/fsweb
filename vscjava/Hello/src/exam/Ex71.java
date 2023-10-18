package exam;

import java.util.Scanner;

public class Ex71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수의 갯수를 입력하시오.>");
		int n = sc.nextInt();
		int[] a = new int[n];
        System.out.println("정수를 입력하시오.>");
		
		int c = 0;
		for (int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
			c = c + a[i];
		}
		System.out.println("합계>" + c);
    }
}
