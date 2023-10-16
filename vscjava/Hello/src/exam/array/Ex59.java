package exam.array;

public class Ex59 {
    public static void main(String[] args) {
        int[] lotto = {13,23,8,35,40,45};
        int bonus = 7;
        int[] myNumber = {2,6,7,23,40,44};
        int conunt = 0;
        int bonusCount = 0;

        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(myNumber[i]==lotto[j]){
                    conunt++;
                }
            }
        }
        if(conunt==6){
            System.out.println("1등당첨");
        } else if (conunt==5){
            for(int i=0; i<6; i++){
                if(myNumber[i]==bonus){
                    bonusCount++;
                }
            }
            if(bonusCount>0){
                System.out.println("2등당첨");
            }else{
                System.out.println("3등당첨");
            }
        }else if (conunt==4){
            System.out.println("4등당첨!");
        }else if (conunt==5){
            System.out.println("5등당첨!");
        }else{
            System.out.println("꽝! 다음기회에~");
        }
    }
}
