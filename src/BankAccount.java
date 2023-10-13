
public class BankAccount {
    private String Name;
    private int Age;
    private int Account_number;
    private double Balance;
    private double Deposit;

    
    public void BankAccount(String Name, int Age, int Account_number, double Balance, double Deposit){
        this.Name= Name;
        this.Age= Age;
        this.Account_number= Account_number;
        this.Balance= Balance;
        this.Deposit= Deposit;
    
    }
    
    String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name= Name;
    }
    
    int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age= Age;
    }
    
    int getAccount_number(){
        return Account_number;
    }
    public void setAccount_number(int Account_number){
        this.Account_number= Account_number;
    }
    
    double getBalance(){
        return Balance + Deposit;
    }
    public void setBalance(double Balance){
        this.Balance= Balance;
    }
    
    double getDeposit(){
        return Deposit;
    }
    public void setDeposit(double Deposit1, double Deposit2){
        this.Deposit= Deposit1 + Deposit2;
    }
    
    
}

class Main{
    public static void main (String [] args){
        BankAccount n= new BankAccount();
        n.setName("Janine Suello");
        n.setAge(21);
        n.setAccount_number(1050);
        n.setDeposit(2500.10 , 5000.50);
        n.setBalance(5000.2);
        
        System.out.println("Name: " + n.getName());
        System.out.println("Age: " + n.getAge());
        System.out.println("Account_number: " + n.getAccount_number());
        System.out.println("Deposit: " + n.getDeposit());
        System.out.println("Balance: " + n.getBalance());
    }
}