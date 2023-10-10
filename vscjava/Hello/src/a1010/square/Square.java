package a1010.square;

public class Square {
    // 필드를 추가하시오.
    int length;

    int area() {
        return length * length;
    }
    public static void main(String[] args) {
        // 객체 생성
        Square s = new Square();
        // 필드 초기화
        s.length = 4;        
        // 결과 출력
        System.out.printf("한 변의 길이가 %d인 정사격형의 넓이: %d", s.length, s.area());
    }
}
