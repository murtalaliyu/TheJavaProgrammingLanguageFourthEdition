package examples.methodExecutionAndReturn;

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

    public boolean canDeposit(Person who) { return true; }
    public boolean canWithdraw(Person who) { return true; }
    public boolean canClose(Person who) { return true; }

}

class Person {}
