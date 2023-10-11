package a1011.aven;

public class MymathTest {
    public static void main(String[] args) {
        System.out.println(Mymath.max(1.23, 3.45));
        System.out.println(Mymath.min(5.43, 3.21));
    }
}

class Mymath{
    static double max (double a, double b) {
        return (a > b) ? a : b; //삼안연산자
    }
    static double min (double a, double b) {
        return (a < b) ? a : b;
    }
}
