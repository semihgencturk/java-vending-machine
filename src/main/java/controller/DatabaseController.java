package controller;

import model.Denomination;
import model.Product;
import model.VendingMachine;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseController {
    private static Connection connection = null;
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;

    public void createConnection(){
        try  {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            connection = DriverManager.getConnection("jdbc:derby:myDB;create=true;user=me;password=mine");
            System.out.println("connection.isValid(0)" + connection.isValid(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DENOMINATION

    public void createDenominationTable() {
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE DENOMINATION("
                    + "denominationId INT NOT NULL,"
                    + "denominationCurrency VARCHAR(255) NOT NULL,"
                    + "denominationAmount DOUBLE NOT NULL,"
                    + "PRIMARY KEY (denominationId))");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void insertDenomination(int denominationId, String denominationCurrency, double denominationAmount) {
        try {
            statement = connection.createStatement();
            statement.execute("insert into DENOMINATION values (" + denominationId + ",'" + denominationCurrency + "'," + denominationAmount + ")");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Denomination getDenominationById(int denominationId) {
        try {
            Denomination denomination = new Denomination();
            preparedStatement = connection.prepareStatement("select * from DENOMINATION WHERE denominationId = ?");
            preparedStatement.setInt(1, denominationId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                denomination.setDenominationId(resultSet.getInt(1));
                denomination.setDenominationCurrency(resultSet.getString(2));
                denomination.setDenominationAmount(resultSet.getDouble(3));
            }
            preparedStatement.close();

            return denomination;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Denomination> getDenominations() {
        try {
            ArrayList<Denomination> denominations= new ArrayList<>();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select denominationId from DENOMINATION");

            while(resultSet.next()) {
                denominations.add(getDenominationById(resultSet.getInt("denominationId")));
            }
            statement.close();

            return denominations;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateDenomination(int denominationId, String denominationCurrency, Double denominationAmount) {
        try {
            preparedStatement = connection.prepareStatement("update DENOMINATION set denominationCurrency = ?, denominationAmount = ? where denominationId = ?");
            preparedStatement.setString(1, denominationCurrency);
            preparedStatement.setDouble(2, denominationAmount);
            preparedStatement.setInt(3, denominationId);
            preparedStatement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteDenomination(int denominationId) {
        try {
            preparedStatement = connection.prepareStatement("delete * from DENOMINATION WHERE denominationId = ?");
            preparedStatement.setInt(1, denominationId);
            preparedStatement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // PRODUCT

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
            statement.execute("insert into DENOMINATION values (" + productId + ",'" + productName + "'," + productPrice + ")");
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

    // VENDING_MACHINE

    public void createVendingMachineTable() {
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE VENDING_MACHINE("
                    + "vendingMachineId INT NOT NULL,"
                    + "vendingMachineName VARCHAR(255) NOT NULL,"
                    + "totalDenominationStorageUnitNumber INT NOT NULL,"
                    + "denominationStorageUnitCapacity INT NOT NULL,"
                    + "totalProductStorageUnitNumber INT NOT NULL,"
                    + "productStorageUnitCapacity INT NOT NULL,"
                    + "PRIMARY KEY (vendingMachineId))");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void insertVendingMachine(int vendingMachineId, String vendingMachineName, int totalDenominationStorageUnitNumber, int denominationStorageUnitCapacity, int totalProductStorageUnitNumber, int productStorageUnitCapacity) {
        try {
            statement = connection.createStatement();
            statement.execute("insert into VENDING_MACHINE values (" +
                    vendingMachineId + ",'" + vendingMachineName + "'," + totalDenominationStorageUnitNumber + "," + denominationStorageUnitCapacity + "," + totalProductStorageUnitNumber + "," + productStorageUnitCapacity + ")");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public VendingMachine getVendingMachineById(int vendingMachineId) {
        try {
            VendingMachine vendingMachine = new VendingMachine();
            preparedStatement = connection.prepareStatement("select * FROM VENDING_MACHINE where vendingMachineId = ?");
            preparedStatement.setInt(1, vendingMachineId);
            ResultSet resultSet = preparedStatement.executeQuery();

            preparedStatement = connection.prepareStatement("select denominationStorageUnit, denominationId, denominationPiece FROM DENOMINATION_OF_VENDING_MACHINE where vendingMachineId = ?");
            preparedStatement.setInt(1, vendingMachineId);
            ResultSet resultSet2 = preparedStatement.executeQuery();

            preparedStatement = connection.prepareStatement("select productStorageUnit, productId, productPiece FROM PRODUCT_OF_VENDING_MACHINE where vendingMachineId = ?");
            preparedStatement.setInt(1, vendingMachineId);
            ResultSet resultSet3 = preparedStatement.executeQuery();

            while(resultSet.next()) {
                vendingMachine.setVendingMachineId(resultSet.getInt(1));
                vendingMachine.setVendingMachineName(resultSet.getString(2));
                vendingMachine.setTotalDenominationStorageUnitNumber(resultSet.getInt(3));
                vendingMachine.setDenominationStorageUnitCapacity(resultSet.getInt(4));
                vendingMachine.setTotalProductStorageUnitNumber(resultSet.getInt(5));
                vendingMachine.setProductStorageUnitCapacity(resultSet.getInt(6));
                while(resultSet2.next()) {
                    vendingMachine.setDenominationsOnUsage(resultSet2.getInt("denominationStorageUnit"), resultSet2.getInt("denominationId"));
                    vendingMachine.setDenominationsOnUsageAvailability(resultSet2.getInt("denominationStorageUnit"), resultSet2.getInt("denominationPiece"));
                }
                while(resultSet3.next()) {
                    vendingMachine.setProductsOnSale(resultSet2.getInt("productStorageUnit"), resultSet2.getInt("productId"));
                    vendingMachine.setProductsOnSale(resultSet2.getInt("productStorageUnit"), resultSet2.getInt("productPiece"));
                }
            }
            preparedStatement.close();

            return vendingMachine;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<VendingMachine> getVendingMachines() {
        try {
            ArrayList<VendingMachine> vendingMachines = new ArrayList<>();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select vendingMachineId from VENDING_MACHINE");

            while(resultSet.next()) {
                vendingMachines.add(getVendingMachineById(resultSet.getInt("vendingMachineId")));
            }
            statement.close();

            return vendingMachines;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateVendingMachine(int vendingMachineId, String vendingMachineName, int totalDenominationStorageUnitNumber, int denominationStorageUnitCapacity, int totalProductStorageUnitNumber, int productStorageUnitCapacity) {
        try {
            preparedStatement = connection.prepareStatement("update PRODUCT set vendingMachineName = ?, totalDenominationStorageUnitNumber = ?, denominationStorageUnitCapacity = ?, totalProductStorageUnitNumber = ?, productStorageUnitCapacity = ? where productId = ?");
            preparedStatement.setString(1, vendingMachineName);
            preparedStatement.setInt(2, totalDenominationStorageUnitNumber);
            preparedStatement.setInt(3, denominationStorageUnitCapacity);
            preparedStatement.setInt(4, totalProductStorageUnitNumber);
            preparedStatement.setInt(5, productStorageUnitCapacity);
            preparedStatement.setInt(6, vendingMachineId);

            preparedStatement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteVendingMachine(int vendingMachineId) {
        try {
            preparedStatement = connection.prepareStatement("delete * from DENOMINATION_OF_VENDING_MACHINE WHERE vendingMachineId = ?");
            preparedStatement.setInt(1, vendingMachineId);
            preparedStatement = connection.prepareStatement("delete * from PRODUCT_OF_VENDING_MACHINE WHERE vendingMachineId = ?");
            preparedStatement.setInt(1, vendingMachineId);
            preparedStatement = connection.prepareStatement("delete * from VENDING_MACHINE WHERE vendingMachineId = ?");
            preparedStatement.setInt(1, vendingMachineId);
            preparedStatement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // DENOMINATION_OF_VENDING_MACHINE

    public void createDenominationOfVendingMachineTable() {
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE DENOMINATION_OF_VENDING_MACHINE("
                    + "vendingMachineId INT NOT NULL,"
                    + "denominationStorageUnit INT NOT NULL,"
                    + "denominationId INT NOT NULL,"
                    + "denominationPiece INT NOT NULL,"
                    + "FOREIGN KEY (vendingMachineId) REFERENCES VENDING_MACHINE(vendingMachineId),"
                    + "FOREIGN KEY (denominationId) REFERENCES DENOMINATION(denominationId),"
                    + "PRIMARY KEY (vendingMachineId, denominationStorageUnit))");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void insertDenominationToVendingMachine(int vendingMachineId,  int denominationStorageUnit, int denominationId, int denominationPiece) {
        try {
            statement = connection.createStatement();
            statement.execute("insert into DENOMINATION_OF_VENDING_MACHINE values (" +
                    vendingMachineId + "," + denominationStorageUnit + "," + denominationId + "," + denominationPiece +")");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateDenominationOfVendingMachine(int vendingMachineId, int denominationStorageUnit, int denominationId, int denominationPiece) {
        try {
            preparedStatement = connection.prepareStatement("update DENOMINATION_OF_VENDING_MACHINE set denominationId = ?, denominationPiece = ? where vendingMachineId = ? and denominationStorageUnit = ?");
            preparedStatement.setInt(1, denominationId);
            preparedStatement.setInt(2, denominationPiece);
            preparedStatement.setInt(3, vendingMachineId);
            preparedStatement.setInt(4, denominationStorageUnit);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // PRODUCT_OF_VENDING_MACHINE

    public void createProductOfVendingMachineTable() {
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE PRODUCT_OF_VENDING_MACHINE("
                    + "vendingMachineId INT NOT NULL,"
                    + "productStorageUnit INT NOT NULL,"
                    + "productId INT NOT NULL,"
                    + "productPiece INT NOT NULL,"
                    + "FOREIGN KEY (vendingMachineId) REFERENCES VENDING_MACHINE(vendingMachineId),"
                    + "FOREIGN KEY (productId) REFERENCES PRODUCT(productId),"
                    + "PRIMARY KEY (vendingMachineId, productStorageUnit))");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void insertProductToVendingMachine(int vendingMachineId, int productStorageUnit, int productId, int productPiece) {
        try {
            statement = connection.createStatement();
            statement.execute("insert into PRODUCT_OF_VENDING_MACHINE values (" +
                    vendingMachineId + "," + productStorageUnit + "," + productId + "," + productPiece + ")");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProductOfVendingMachine(int vendingMachineId, int productStorageUnit , int productId, int productPiece) {
        try {
            preparedStatement = connection.prepareStatement("update PRODUCT_OF_VENDING_MACHINE set productId = ?, productPiece = ? where vendingMachineId = ? AND productStorageUnit = ?");
            preparedStatement.setInt(1, productId);
            preparedStatement.setInt(2, productPiece);
            preparedStatement.setInt(3, vendingMachineId);
            preparedStatement.setInt(4, productStorageUnit);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//
//    public void dropDenominationTable() {
//        try {
//            statement = connection.createStatement();
//            statement.execute("DROP TABLE DENOMINATION");
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void dropProductTable() {
//        try {
//            statement = connection.createStatement();
//            statement.execute("DROP TABLE PRODUCT");
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void dropVendingMachineTable() {
//        try {
//            statement = connection.createStatement();
//            statement.execute("DROP TABLE VENDING_MACHINE");
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void dropDenominationOfVendingMachineTable() {
//        try {
//            statement = connection.createStatement();
//            statement.execute("DROP TABLE DENOMINATION_OF_VENDING_MACHINE");
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void dropProductOfVendingMachineTable() {
//        try {
//            statement = connection.createStatement();
//            statement.execute("DROP TABLE PRODUCT_OF_VENDING_MACHINE");
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}
