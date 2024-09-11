package controller.product;

import model.Product;

public class ProductUpdater {
    public void updatingExistingProduct(Product myProduct, String myProductName, Double myProductPrice) {
        myProduct.setProductName(myProductName);
        myProduct.setProductPrice(myProductPrice);
    }
}
