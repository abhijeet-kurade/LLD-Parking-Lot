package Account;

public class GetGuestNumber {
    private int number=0;
    private static GetGuestNumber obj;
    private GetGuestNumber() {

    }
    public static GetGuestNumber getInstance(){
        if(GetGuestNumber.obj == null) GetGuestNumber.obj = new GetGuestNumber();
        return GetGuestNumber.obj;
    }

    public int getNextGuestId(){
        this.number += 1;
        return this.number;
    }
}
