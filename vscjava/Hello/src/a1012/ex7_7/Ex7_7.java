package a1012.ex7_7;

public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; //car =(Car)fe;에서 형변환이 생략됨
        // car.water(); //컴파일에러 Car타입의 참조변수로는 water()를 호출할 수 없다.
        fe2 = (FireEngine)car; //자손타입<-조상타입. 형변환 생략 불가
        fe2.water();
    }
}
class Car{
    String color;
    int door;

    void drive(){       //운전하는 기능
        System.out.println("drive, Brrrr~");
    }
    
    void stop(){
        System.out.println("stop!!!");
    }
}
class FireEngine extends Car {  //소방차
    void water(){               //물을 뿌리는기능
        System.out.println("water!!!");
    }
}
