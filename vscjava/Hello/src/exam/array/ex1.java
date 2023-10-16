package exam.array;

public class ex1 {
    public static void main(String[] args) {
        // 배열에서 최대값 찾기주어진 정수 배열에서 최대값을 찾는 프로그램을 작성하세요.
        int[] numbers = {5, 10, 3, 7, 2, 8};

        int max = numbers[0]; // 배열의 첫 번째 요소를 최대값으로 초기화

        // 배열을 순회하면서 최대값을 찾음
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("최대값: " + max);
    }
}
