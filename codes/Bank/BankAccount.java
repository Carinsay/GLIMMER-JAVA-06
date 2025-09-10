package Bank;
public class BankAccount {
    // TODO 修改属性的可见性
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String password; // 敏感信息，需要严格保护
//下面这块是要进行初始化
    BankAccount(String accountNumber, String accountHolder, double initialBalance, String password) {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance = initialBalance;
        this.password = password;
        System.out.println("你好"+accountHolder+"欢迎来到微光银行");
        System.out.println("想干点什么呢？");
        System.out.println();
    }

    void deposit(double amount) {
        this.balance +=amount;
        System.out.println("存款"+amount+"元！");
    }

    boolean withdraw(double amount, String inputPassword) {
        System.out.println(accountHolder+"正想取钱");
        if(inputPassword.equals(password))
        {
            System.out.println(accountHolder+"想取"+amount+"元");
            if(validateAmount(amount))
            {
                balance-=amount;
                System.out.println("取款"+amount+"元！");
                return true;
            }
            else
            {
                System.out.println("失败!\n有那么多钱吗？");
                return false;
            }
        }

        System.out.println("密码错了，别想着偷别人的卡就能拿到钱？不可能！");

        return false;
    }

    boolean transfer(BankAccount recipient, double amount, String inputPassword) {
        if(validatePassword(inputPassword))
        {
            recipient.balance+=amount;
            System.out.println(accountHolder+"向卡号"+recipient.accountNumber+"转账"+amount+"元");
            return true;
        }
        System.out.println("密码错了，别想着偷别人的卡就能拿到钱的不可能！");
        return false;
    }

    double getBalance() {
        return balance;
    }

    String getAccountInfo() {
        String info;
        System.out.println("查询"+accountHolder+"的信息中......");
        info= ("人类"+accountHolder+"持有的卡号"+accountNumber+"的银行卡余额还有"+balance+"元");
        return info;
    }
    // 只需修改可见性
    public boolean validatePassword(String inputPassword) {
        if(inputPassword.equals(password))
        {
            return true;
        }
        return false;
    }
    // 只需修改可见性
    public boolean validateAmount(double amount) {
        if(amount>this.balance||amount<0)
        {
            return false;
        }
        return true;
    }
}