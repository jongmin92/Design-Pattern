package practice.ch4_Factory.idcard;

import java.util.HashMap;
import java.util.Map;

import practice.ch4_Factory.framework.Factory;
import practice.ch4_Factory.framework.Product;

public class IDCardFactory extends Factory {
    private Map<Integer, String> database = new HashMap<>();
    private int serial = 100;

    @Override
    protected synchronized IDCard createProduct(String onwer) {
        return new IDCard(onwer, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(new Integer(card.getSerial()), card.getOwner());
    }

    public Map<Integer, String> getDatabase() {
        return database;
    }
}
