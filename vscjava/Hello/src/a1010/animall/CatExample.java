package a1010.animall;

public class CatExample {
    public static void main(String[] args) {
        //Cat 객체 생성
        Cat myCat = new Cat("페르시안고양이", "흰색", 5);

        // 객체의 필드값 읽기
        System.out.println("이름 : " + myCat.company);
        System.out.println("종류 : " + myCat.model);
        System.out.println("색상 : " + myCat.color);
        System.out.println("나이 : " + myCat.age);
    }
}
