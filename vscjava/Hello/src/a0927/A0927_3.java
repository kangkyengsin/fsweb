package a0927;

public class A0927_3 {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int) Math.pow(2, 3);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        
        int num2 = -8; //1000
        int result3 = num2 >> 3; //0001
        int result4 = num2 / (int) Math.pow(2, 3);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
}
