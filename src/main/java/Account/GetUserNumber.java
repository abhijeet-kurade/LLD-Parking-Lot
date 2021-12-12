package Account;

public class GetUserNumber{
    private int number=0;
    private static GetUserNumber obj;
    private GetUserNumber() {

    }
    public static GetUserNumber getInstance(){
        if(GetUserNumber.obj == null) GetUserNumber.obj = new GetUserNumber();
        return GetUserNumber.obj;
    }

    public int getNextUserId(){
        this.number += 1;
        return this.number;
    }
}
