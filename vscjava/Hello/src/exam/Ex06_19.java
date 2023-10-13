package exam;

public class Ex06_19 {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 0;
    private int balance;

    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        if(balance<Ex06_19.MIN_BALANCE | balance>Ex06_19.MAX_BALANCE) {
            return;
        }
        this.balance = balance;
    }
}
