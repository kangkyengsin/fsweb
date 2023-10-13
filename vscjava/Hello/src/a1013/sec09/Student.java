package a1013.sec09;

public class Student extends Person {
    // 필드 선언
    public int studentNo;

    // 생성자 선언
    public Student(String name, int studentNO){
        super(name);
        this.studentNo = studentNO;
    }

    // 메소드선언
    public void study(){
        System.out.println("공부를 합니다.");
    }
}
