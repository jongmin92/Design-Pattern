package ch4_factory.idcard;

import java.util.ArrayList;
import java.util.List;

import ch4_factory.framework.Factory;
import ch4_factory.framework.Product;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String onwer) {
        return new IDCard(onwer);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
