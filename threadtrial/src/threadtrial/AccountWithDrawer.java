
package threadtrial;


public class AccountWithDrawer implements Runnable {
    private Account account;
    private double amount;
    public AccountWithDrawer(Account account,double amount){
        this.account=account;
        this.amount=amount;
    }
    
    public void run(){
        account.withdraw(amount);
        
    }
    
    
}
