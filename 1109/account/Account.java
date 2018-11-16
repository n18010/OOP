package account;
import framework.Product;

public class Account extends Product {
    private String id;
    private String password;
    Account(String id) {
        System.out.println(id + "のアカウントを作ります。");
        this.id = id;
        this.password = "1234";
    }
    @Override
    public void use() {
        System.out.println(id + "のアカウントを使いました。");
    }
    public String getAccount() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
