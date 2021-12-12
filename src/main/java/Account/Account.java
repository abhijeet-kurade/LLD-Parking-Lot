package Account;

public abstract class Account {
    AccountType accountType;

    public Account(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}
