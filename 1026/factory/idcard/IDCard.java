package idcard;
import framework.Product;

public class IDCard extends Product {
    private String owner;
    private String no;
    IDCard(String no, String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
        this.no = no;
    }
    @Override
    public void use() {
        System.out.println(owner + "のカードを使いました。");
    }
    public String getOwner() {
        return owner;
    }
    public String getNo() {
        return no;
    }
}
