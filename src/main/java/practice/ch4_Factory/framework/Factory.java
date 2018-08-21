package practice.ch4_Factory.framework;

import practice.ch4_Factory.idcard.IDCard;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract IDCard createProduct(String onwer);

    protected abstract void registerProduct(Product product);
}
