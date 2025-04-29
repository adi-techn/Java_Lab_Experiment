public class access_spec{
    public static void main(String[] args) {
        BankAcc p1=new BankAcc();
        p1.username="Aditya";
        // p1.password="adcbd";    gives error as password is private type
    }
}

class BankAcc{
    public String username;
    private String password;
    public void setPass(String password){
        this.password=password;
    }
}