package exam;

public class Ex06_18_ShopService {
    // 정적 변수를 사용하여 유일한 싱글톤(인스턴스)를 저장
    public static Ex06_18_ShopService singleton = new Ex06_18_ShopService();
    
    // 생성자를 private  선언하여 외부에서 객체 생성을 막음
    private Ex06_18_ShopService(){}

    // 정적 메서드를 사용하여 유일한 싱글톤(인스턴스)를 반환
    static Ex06_18_ShopService getInstance(){
        return singleton;
    }

}
