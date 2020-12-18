/**
 *
 * @author Smit Bhavsar
 */
package coe318.lab4;

public class Bank {

    private String name;
    /**
     * An array of Accounts managed by this bank.
     */
    private Account[] accounts;
    private int numAccounts;//number of active accounts

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name; //Fix this
    }

    /**
     * @return the numAccounts
     */
    public int getNumAccounts() {
        return numAccounts; //Fix this
    }

    public Account[] getAccounts() {
        return accounts; //Fix this
    }

    /**
     * Return true if the Bank already has an account with this number;
     * otherwise false.
     *
     * @param accountNumber
     * @return
     */
    public boolean hasAccountNumber(int accountNumber) {
        for (int i = 0; i < numAccounts; i++){
            if (accounts[i] != null){
                if (accounts[i].getNumber() == accountNumber){
                    return true;
                } 
          } 
        }
        return false;
    }

    /**
     * Adds the specified account to the Bank. If the account number already
     * exists or the Bank has reached its maximum number of accounts, return
     * false; otherwise, true.
     *
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {  
        if (hasAccountNumber(account.getNumber())){
            return false;
        }
        
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == null){
                accounts[i] = account;
                numAccounts++;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
    //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts()
                + " of " + getAccounts().length
                + " accounts open";
        for (Account account : getAccounts()) {
            if (account == null) {
                break;
            }
            s += "\n " + account;
        }
        return s;
    }
}
