package a0926;

public class A0926_11 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int numer = 7;

        double result = apple - numer*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);
    } // 부동소수점연산으로 정확한 값이 나오지 않는다.
}
