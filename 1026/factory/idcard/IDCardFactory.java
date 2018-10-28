package idcard;
import framework.Factory;
import framework.Product;
//import java.util.List;
//import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class IDCardFactory extends Factory{
    //private List<String> owners = new ArrayList<String>();
    Map<String, String> owners = new HashMap<String, String>();
    @Override
    protected Product createProduct(String no, String owner) {
        return new IDCard(no, owner);
    }
    @Override
    protected void registerProduct(Product product) {
        //owners.add(((IDCard)product).getOwner());
        owners.put(((IDCard)product).getNo(), ((IDCard)product).getOwner());
    }
    public Map<String, String> getOwners() {
        return owners;
    }
}
