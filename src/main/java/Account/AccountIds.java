package Account;

public class AccountIds {
    private int number=0;
    private static AccountIds obj;
    private AccountIds() {

    }
    public static AccountIds getInstance(){
        if(AccountIds.obj == null) AccountIds.obj = new AccountIds();
        return AccountIds.obj;
    }

    public int getNextUserId(){
        this.number += 1;
        return this.number;
    }
}
