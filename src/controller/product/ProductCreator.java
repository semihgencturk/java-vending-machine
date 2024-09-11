package controller.product;

import model.Product;

public class ProductCreator {
    public Product definingNewProduct(String myProductName, Double myProductPrice){
        Product myProduct = new Product();
        myProduct.setProductName(myProductName);
        myProduct.setProductPrice(myProductPrice);

        return myProduct;
    }
}
