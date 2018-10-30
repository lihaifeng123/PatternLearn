package org.pattern.lhf.factory.idcard;

import org.pattern.lhf.factory.framework.Factory;
import org.pattern.lhf.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owners=new ArrayList();

    @Override
    protected Product createProduct(String owner) {
//        return null;
        return new IDCard(owner);
    }


    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
