package exam;

public class ShopService {
    public static ShopService singleton = new ShopService();
    
    private ShopService(){}

    static ShopService getInstance(){
        return singleton;
    }

}
