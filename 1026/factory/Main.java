import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;
import idcard.IDCard;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("山内");
        Product card2 = factory.create("山田");
        Product card3 = factory.create("山本");
        card1.use();
        card2.use();
        card3.use();
        System.out.println(((IDCardFactory)factory).getOwners());
        System.out.println(((IDCardFactory)factory).getCards());
    }
}
