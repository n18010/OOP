import framework.Factory;
import framework.Product;
import account.AccountFactory;
import account.Account;

public class Main {

    public static void main(String[] args) {
        Factory factory = new AccountFactory();
        Product account1 = factory.create("山内");
        Product account2 = factory.create("山田");
        Product account3 = factory.create("山本");
        account1.use();
        account2.use();
        account3.use();

        ((Account)account1).setPassword("2345");
        ((Account)account2).setPassword("3456");
        ((Account)account3).setPassword("4567");
        System.out.println(((AccountFactory)factory).getAccounts());
    }
}
