package Account;

public abstract class Account {
    AccountType accountType;
    int accountId;
    String name;
    String phoneNumber;

    public Account(AccountType accountType, String name, String phoneNumber) {
        this.accountType = accountType;
        this.accountId = accountId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
