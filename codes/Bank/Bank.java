package Bank;

public class Bank {
    public static void main(String[] args){
        BankAccount bg = new BankAccount("36240","bg",999999,"1234567");
        BankAccount b2g = new BankAccount("37","b2g",0,"123456");

        System.out.println(bg.getAccountInfo());
        bg.deposit(1);
        System.out.println(bg.getAccountInfo());
        System.out.println();
        bg.withdraw(300,"123456");
        System.out.println();
        bg.withdraw(3000000,"1234567");
        System.out.println();
        System.out.println(b2g.getAccountInfo());
        bg.transfer(b2g,100,"1234567");
        System.out.println(b2g.getAccountInfo());

    }
}

