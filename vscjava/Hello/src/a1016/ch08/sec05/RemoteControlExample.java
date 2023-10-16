package a1016.ch08.sec05;

import a1013.sec08.exan02.Audio;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;

        // Television 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
        
        // Audio 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio1();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
        // 디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);
        
    }
}
