package old.examples.methodExecutionAndReturn;

public class BankAccount {

    private long number;    // account number
    private long balance;   // current balance (in cents)

    public Permissions permissionsFor(Person who) {
        Permissions perm = new Permissions();
        perm.canDeposit = canDeposit(who);
        perm.canWithdraw = canWithdraw(who);
        perm.canClose = canClose(who);
        return perm;
    }

    /**
     * Static Nested Class:
     * We declare Permissions to be public because
     * programmers using BankAccountV2 need to use the class
     */
    public static class Permissions {
        public boolean canDeposit,
                        canWithdraw,
                        canClose;
    }

    public boolean canDeposit(Person who) { return true; }
    public boolean canWithdraw(Person who) { return true; }
    public boolean canClose(Person who) { return true; }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}

class Person {}
