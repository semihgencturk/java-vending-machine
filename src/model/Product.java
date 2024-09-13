/*
    Define the product's attributes and behaviours
    A product has a name and price.
    Code, Id ?
    How many exist in the machine?
    */

package model;

public class Product {
    private static Product self = new Product();
    public static Product getInstance() { return self; }

    private int productId;
    private String productName;
    private Double productPrice;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        if (productPrice >= 0) {
            this.productPrice = productPrice;
        } else {
            throw new IllegalArgumentException("model.Product Price cannot be smaller than 0");
        }
    }
}
