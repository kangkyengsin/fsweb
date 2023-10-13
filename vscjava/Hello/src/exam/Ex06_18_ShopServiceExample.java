package exam;

public class Ex06_18_ShopServiceExample {
    public static void main(String[] arges){
        Ex06_18_ShopService obj1 = Ex06_18_ShopService.getInstance();
        Ex06_18_ShopService obj2 = Ex06_18_ShopService.getInstance();
        
        
        if(obj1==obj2){
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}


