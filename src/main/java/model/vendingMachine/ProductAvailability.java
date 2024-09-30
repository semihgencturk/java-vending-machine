package model.vendingMachine;

import model.Product;

public class ProductAvailability {
    private Product product;
    private int productCountOnStock;

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductCountOnStock() {
        return productCountOnStock;
    }
    public void setProductCountOnStock(int productCountOnStock) {
        this.productCountOnStock = productCountOnStock;
    }
}
