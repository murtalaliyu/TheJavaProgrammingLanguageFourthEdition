package chp5;

public class BankAccount extends old.examples.methodExecutionAndReturn.BankAccount {
    private Action lastAction;  // last action performed

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
        lastAction = new Action("deposit", amount);
    }

    public void withdraw(long amount) {
        setBalance(getBalance()-amount);
        lastAction = new Action("withdraw", amount);
    }

    // ...

}
