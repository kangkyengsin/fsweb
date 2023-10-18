package a1018.generic.exem01_1;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        Integer firstInt = Urility.getFirstElement(intArray);
        System.out.println("첫 번째 정수: " + firstInt);

        String[] strArray = {"apple", "banana", "cherry"};
        String firstStr = Urility.getFirstElement(strArray);
        System.out.println("첫 번째 문자열: " + firstStr);
        
    }
}
class Urility {
    public static <T> T getFirstElement(T[] array) {
        if(array != null && array.length > 0) {
            return array[0];
        }
        return null;
    }
}