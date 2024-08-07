


public class Customer {

    private String name;
    private double balance;
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void addToBalance(double amount) {
        this.setBalance(this.balance+amount);
    }
    public void setBalance(double amount){
        this.balance = amount;
    }


    public String toString(){
        return this.name + ", "+ this.balance;
    }

}
