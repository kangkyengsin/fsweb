package a0925;

public class A0925_8 {
    public static void main(String[] args) {
        // 정밀도 확인
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("ver1:" + var1);
        System.out.println("ver2:" + var2);

        // 10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6f;
        double var5 = 2e-3;
        System.out.println("ver3:" + var3);
        System.out.println("ver4:" + var4);
        System.out.println("ver5:" + var5);
    }
}
