package a1004;

public class A1004_13 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            if(i%2 != 0) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
