package ch4_Factory.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String onwer);

    protected abstract void registerProduct(Product product);
}
