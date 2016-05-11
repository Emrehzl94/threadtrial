
package threadtrial;




public class Account {
    private double balance;
    public Account(double balance){
        this.balance=balance;
    }
    public synchronized void withdraw(double amount){
       double curBal=getBalance();
       possibleDelay();
       balance=curBal-amount;
    }
    public synchronized void deposit(double amount){
        double curBal=getBalance();
        possibleDelay();
        balance=curBal+amount;
    }
    public double getBalance(){
        return balance;
    }
    private void possibleDelay(){
        try{
            Thread.sleep(5);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
  
    
}
