package a1013.sec08.exan02;

public class RemoteConrolExample {
    public static void main(String[] args) {
        RemoteControl rc;

        // rc 변수에 Television 객체를 대입
        rc = new Television();
        rc.turnOn();

        // re 변수에 Audio 객체를 대입 (교체시킴)
        rc = new Audio();
        rc.turnOn();
    }
}
