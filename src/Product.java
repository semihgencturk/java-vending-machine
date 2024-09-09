public class Product {
    /*
    Define the product's attributes and behaviours
    A product has a name and price.
    Code, Id ?
    How many exist in the machine?
    */

    private String productName;
    private Float productPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        if (productPrice >= 0) {
            this.productPrice = productPrice;
        } else {
            throw new IllegalArgumentException("Product Price cannot be smaller than 0");
        }

    }

}
