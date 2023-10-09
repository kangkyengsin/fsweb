package a1006;

public class A1006_3 {
    public static void main(String[] args) {
        String[] oldIntArray = { "java", "arry", "copy" };
        String[] newIntArray = new String[5];
        System.arraycopy( oldIntArray, 0, newIntArray, 0, oldIntArray.length);
        for(int i=0; i<newIntArray.length;i++) {
            System.out.print(newIntArray[i] + ",");
        }
    }
}
