package a0926;

public class A0926_10 {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            var1++; // ++연산은 var1의 값을 1 증가 시킨다.
            System.out.println("var1: " + var1);
        }//오버플로우
        System.out.println("-------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            var2--; // --연산은 var2의 값을 1 감소 시킨다.
            System.out.println("var2: " + var2);
        }//언더플로우
    }
}
