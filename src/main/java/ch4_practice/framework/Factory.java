package ch4_practice.framework;

import ch4_practice.idcard.IDCard;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract IDCard createProduct(String onwer);

    protected abstract void registerProduct(Product product);
}
