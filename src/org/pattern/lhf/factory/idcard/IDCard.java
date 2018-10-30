package org.pattern.lhf.factory.idcard;

import org.pattern.lhf.factory.framework.Product;

public class IDCard extends Product {
    private String owner;
    public IDCard(String owner){
        System.out.println("create "+owner+" ID Card");;
        this.owner=owner;
    }
    @Override
    public void use() {
        System.out.println("use "+owner+" id card");
    }

    public String getOwner() {
        return owner;
    }
}
