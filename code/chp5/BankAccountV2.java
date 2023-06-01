package chp5;

import old.examples.methodExecutionAndReturn.BankAccount;

public class BankAccountV2 extends BankAccount {
    private Action lastAct;  // last action performed

    public class Action {
        private String act;
        private long amount;
        Action(String act, long amount) {
            this.act = act;
            this.amount = amount;
        }
        public String toString() {
            // identify our enclosing account
            return getNumber() + ": " + act + " " + amount;
        }
    }

    public void deposit(long amount) {
        setBalance(getBalance()+amount);
        lastAct = new Action("deposit", amount);
    }

    public void withdraw(long amount) {
        setBalance(getBalance()-amount);
        lastAct = new Action("withdraw", amount);
    }

    // ...

    public void transfer(BankAccountV2 other, long amount) {
        other.withdraw(amount);
        deposit(amount);
        lastAct = this.new Action("transfer", amount);
        other.lastAct = other.new Action("transfer", amount);
    }

}
