package a1005;

public class A1005_14 {
    public static void main(String[] args) {
        int[] arraySum = { 1, 2, 3, 4, 5 };
        
        int sum1 = 0;
        for (int i = 0; i < arraySum.length; i++) {
            sum1 += arraySum[i];
        }
        System.out.println("총합 : " + sum1);
        
        int[] arrayMax = { 10, 5, 8, 21, 3 };
        
        int max = arrayMax[0];
        for (int j = 1; j < arrayMax.length; j++) {
            if (arrayMax[j] > max) {
                max = arrayMax[j];
            }
        }
        int min = arrayMax[0];
        for (int j = 1; j < arrayMax.length; j++) {
            if (arrayMax[j] < min) {
                min = arrayMax[j];
            }
        }
        
        System.out.println("최대값 : " + max); // 최대값
        System.out.println("최소값 : " + min); // 최소값

        double[] arrayAvg = { 2.5, 3.0, 1.5, 4.0, 2.0 };
        
        int sum2 = 0;
        for (int k = 0; k < arraySum.length; k++) {
            sum2 += arrayAvg[k];
        }
        System.out.println("총합 : " + sum2);
        double avg = (double) sum2 / 5;
        System.out.println("평균 : " + avg);
        
        String[] array = { "apple", "banana", "cherry", "date" };

        for (int n = 0; n < array.length / 2; n++) {
            String temp = array[n];
            array[n] = array[array.length - 1 - n];
            array[array.length - 1 - n] = temp;
        }
        
        System.out.println("배열 요소 뒤집기:");
        for (String str : array) {
            System.out.println(str);
        }
    }
    
}
