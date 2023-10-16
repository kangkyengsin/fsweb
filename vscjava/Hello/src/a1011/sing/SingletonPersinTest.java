package a1011.sing;

public class SingletonPersinTest {
    public static void main(String[] args) {
        // 싱글톤 객체 얻기
        Person person = Person.getInstance();

        // 정보 설정
        person.setPriceInfo("john Doe", 30);

        // 정보 표시
        person.displayPersonInfo();
    }
}
