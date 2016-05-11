
package threadtrial;
import java.util.concurrent.*;

public class BankSimulation {

   
    public static void main(String[] args) {
        Account a0=new Account(10.3);
        System.out.println("before:"+a0.getBalance());
        ExecutorService executor=Executors.newCachedThreadPool();
        for (int i=0;i<100;i++){
            AccountDepositer task=new AccountDepositer(a0,1);
            executor.execute(task);
        }
        for (int i=0;i<50;i++){
            AccountWithDrawer task=new AccountWithDrawer(a0,1);
            executor.execute(task);
        }
        executor.shutdown();
        while(!executor.isTerminated()){
            System.out.println("after:"+a0.getBalance());
        }
        
    }
    
}
