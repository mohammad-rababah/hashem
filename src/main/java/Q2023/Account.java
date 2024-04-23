package Q2023;

public class Account implements Comparable<Account> {
    private String name = null;
    private int accountNumber = 0;

    Account(String nameIn, int accNum) {
        name = nameIn;
        accountNumber = accNum;
    }

    public String getName() {
        return name;
    }

    public int getAccountNum() {
        return accountNumber;

    }


    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Account)) {
            return false;
        }

        return ((Account) o).accountNumber == accountNumber;
    }

    public String toString() {
        return name + " " + accountNumber;
    }


    @Override
    public int compareTo(Account o) {
        if (accountNumber > o.accountNumber) {
            return 1;
        } else if (accountNumber < o.accountNumber) {
            return -1;
        }
        return 0;
    }
}