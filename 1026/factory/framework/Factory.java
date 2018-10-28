package framework;

public abstract class Factory {
    public final Product create(String no, String owner) {
        Product p = createProduct(no, owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String no, String owner);
    protected abstract void registerProduct(Product product);
}
