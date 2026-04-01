package Day8;
import java.util.*;

public class bank{
    public static void main(String[] args){
        Info info=new Info();
        Scanner sc=new Scanner(System.in);
        int depositamt=sc.nextInt();
        int withdrawamt=sc.nextInt();
        info.deposit(depositamt);
        info.withdraw(withdrawamt);
        info.checkBalance();
    }
}
 class Info{
    int amt;
    int balance;
    void deposit(int amt){
        balance+=amt;
        System.out.println(amt+" Amount deposited succesfully");
    }void withdraw(int amt){
        if(balance>amt){
            System.out.println(amt+" Amount withdrawal successful");
            balance-=amt;
        }else{
            System.out.println("No enough Balance. check your account balance");
        }
    }
    void checkBalance(){
        System.out.println("Available balance:"+balance);

    }
 }