package controller;

import model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import static database.DatabaseConnector.connection;

public class ProductController {
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;

    public void createProductTable() {
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE PRODUCT("
                    + "productId INT NOT NULL,"
                    + "productName VARCHAR(255) NOT NULL,"
                    + "productPrice DOUBLE NOT NULL,"
                    + "PRIMARY KEY (productId))");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void insertProduct(int productId, String productName, double productPrice){
        try {
            statement = connection.createStatement();
            statement.execute("insert into PRODUCT values (" + productId + ",'" + productName + "'," + productPrice + ")");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Product getProductById(int productId) {
        try {
            Product product = new Product();
            preparedStatement = connection.prepareStatement("select * from PRODUCT WHERE productId = ?");
            preparedStatement.setInt(1, productId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                product.setProductId(resultSet.getInt(1));
                product.setProductName(resultSet.getString(2));
                product.setProductPrice(resultSet.getDouble(3));
            }
            preparedStatement.close();

            return product;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Product> getProducts() {
        try {
            ArrayList<Product> products = new ArrayList<>();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select productId from PRODUCT");

            while(resultSet.next()) {
                products.add(getProductById(resultSet.getInt("productId")));
            }
            statement.close();

            return products;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProduct(int productId, String productName, Double productPrice) {
        try {
            preparedStatement = connection.prepareStatement("update PRODUCT set productName = ?, productPrice = ? where productId = ?");
            preparedStatement.setString(1, productName);
            preparedStatement.setDouble(2, productPrice);
            preparedStatement.setInt(3, productId);
            preparedStatement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteProduct(int productId) {
        try {
            preparedStatement = connection.prepareStatement("delete * from PRODUCT WHERE productId = ?");
            preparedStatement.setInt(1, productId);
            preparedStatement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void dropProductTable() {
        try {
            statement = connection.createStatement();
            statement.execute("DROP TABLE PRODUCT");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
