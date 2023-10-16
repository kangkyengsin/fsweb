package a1010.animall;

public class Cat {
    //생성자 선언
    String company = "나비";
    String model;
    String color;
    int age;

    // 생성자
    Cat() {}
    Cat(String model){
        this.model = model;
    };
    Cat(String model, String color) {
        this.model = model;
        this.color = color;
    };
    Cat(String model, String color, int age){
        this.model = model;
        this.color = color;
        this.age = age;
    }
}
