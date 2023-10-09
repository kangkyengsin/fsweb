package a0926;

public class A0926_12 {
    public static void main(String[] args) {
        int apple = 1;
        int totaPieces = apple * 10;
        int numer = 7;

        double result = totaPieces - numer;
        System.out.println("10조각에서 남은 조각: " + result);
        System.out.println("사과 1개에서 남은 양: " + result/10.0);
    }
}
