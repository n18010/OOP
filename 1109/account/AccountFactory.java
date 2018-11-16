package account;
import framework.Factory;
import framework.Product;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class AccountFactory extends Factory{
    private Map<String, String> accounts = new HashMap<String, String>();
    @Override
    protected Product createProduct(String id) {
        return new Account(id);
    }
    @Override
    protected void registerProduct(Product product) {
        String id = ((Account)product).getAccount();
        String password = ((Account)product).getPassword();
        accounts.put(id, password);
    }
    public Map<String, String> getAccounts() {
        return accounts;
    }
}
