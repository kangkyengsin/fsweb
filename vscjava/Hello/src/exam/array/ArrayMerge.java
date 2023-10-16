package exam.array;

public class ArrayMerge {
    public static void main(String[] args) {
        int[][] array1 = { { 1, 2 }, { 3, 4 } };
        int[][] array2 = { { 5, 6 }, { 7, 8 } };
        int[][] mergedArray = mergeArrays(array1, array2);
        // 결과를 출력
        for (int[] row : mergedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] mergeArrays(int[][] array1, int[][] array2) {
        int numRows = array1.length + array2.length;
        int numCols = array1[0].length; // 두배열은 동일한 열 수여야 한다.
        int[][] mergedArray = new int[numRows][numCols];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < numCols; j++) {
                mergedArray[i][j] = array1[i][j];
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < numCols; j++) {
                mergedArray[i + array1.length][j] = array2[i][j];
            }
        }

        return mergedArray;
    }
}