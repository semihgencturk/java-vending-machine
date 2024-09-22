package controller;

import model.Denomination;
import model.Product;
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

    // Create A Table

    public void createDenominationTable() throws SQLException {
        statement = connection.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS DENOMINATION("
                + "denominationId INT NOT NULL,"
                + "denominationCurrency VARCHAR(255) NOT NULL,"
                + "denominationAmount DOUBLE NOT NULL,"
                + "PRIMARY KEY(denominationId))");
    }

    public void createProductTable() throws SQLException {
        statement = connection.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS PRODUCT("
                + "productId INT NOT NULL,"
                + "productName VARCHAR(255) NOT NULL,"
                + "productPrice DOUBLE NOT NULL"
                + "PRIMARY KEY(productId))");
    }

    public void createVendingMachineTable() throws SQLException {
        statement = connection.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS VENDING_MACHINE("
                + "vendingMachineId INT NOT NULL,"
                + "vendingMachineName VARCHAR(255) NOT NULL,"
                + "totalDenominationStorageUnitNumber INT NOT NULL,"
                + "denominationStorageUnitCapacity INT NOT NULL"
                + "totalProductStorageUnitNumber INT NOT NULL,"
                + "productStorageUnitCapacity INT NOT NULL,"
                + "PRIMARY KEY(vendingMachineId))");
    }

    public void createDenominationOfVendingMachineTable() throws SQLException {
        statement = connection.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS DENOMINATION_OF_VENDING_MACHINE("
                + "vendingMachineId INT NOT NULL,"
                + "denominationId INT NOT NULL,"
                + "denominationStorageUnit INT NOT NULL,"
                + "denominationPiece INT NOT NULL,"
                + "FOREIGN KEY (vendingMachineId) REFERENCES VENDING_MACHINE(vendingMachineId)"
                + "FOREIGN KEY (denominationId) REFERENCES DENOMINATION(denominationId)"
                + "PRIMARY KEY(vendingMachineId, denominationId))");
    }

    public void createProductOfVendingMachineTable() throws SQLException {
        statement = connection.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS PRODUCT_OF_VENDING_MACHINE("
                + "vendingMachineId INT NOT NULL,"
                + "productId INT NOT NULL,"
                + "productStorageUnit INT NOT NULL,"
                + "productPiece INT NOT NULL,"
                + "FOREIGN KEY (vendingMachineId) REFERENCES VENDING_MACHINE(vendingMachineId)"
                + "FOREIGN KEY (productId) REFERENCES PRODUCT(productId)"
                + "PRIMARY KEY(vendingMachineId, productId))");
    }

    // Insert A Record To The Table

    public void insertDenominationToTable(int denominationId, String denominationCurrency, double denominationAmount) {
        try {
            statement = connection.createStatement();
            statement.execute("insert into DENOMINATION values (" + denominationId + ",'" + denominationCurrency + "','" + denominationAmount +"')");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void insertProductToTable(int productId, String productName, double productPrice){
        try {
            statement = connection.createStatement();
            statement.execute("insert into DENOMINATION values (" + productId + ",'" + productName + "','" + productPrice +"')");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void insertVendingMachineToTable(int vendingMachineId, String vendingMachineName, int totalProductStorageUnitNumber, int productStorageUnitCapacity, int totalDenominationStorageUnitNumber, int denominationStorageUnitCapacity) {
        try {
            statement = connection.createStatement();
            statement.execute("insert into VENDING_MACHINE values (" +
                    vendingMachineId + ",'" + vendingMachineName + "','" + totalProductStorageUnitNumber + ",'" + productStorageUnitCapacity + "','" + totalDenominationStorageUnitNumber + ",'" + denominationStorageUnitCapacity +"')");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void insertDenominationOfVendingMachineTable(int vendingMachineId, int denominationId, int denominationStorageUnit, int denominationPiece) {
        try {
            statement = connection.createStatement();
            statement.execute("insert into DENOMINATION_OF_VENDING_MACHINE values (" +
                    vendingMachineId + ",'" + denominationId + "','" + denominationStorageUnit + "','" + denominationPiece +"')");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void insertProductOfVendingMachineTable(int vendingMachineId, int productId, int productStorageUnit, int productPiece) {
        try {
            statement = connection.createStatement();
            statement.execute("insert into PRODUCT_OF_VENDING_MACHINE values (" +
                    vendingMachineId + ",'" + productId + "','" + productStorageUnit + "','" + productPiece +"')");
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Read The Records From The Table

    public ArrayList<Denomination> getDenominations() {
        try {
            Denomination denomination = new Denomination();
            ArrayList<Denomination> denominations= new ArrayList<>();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from DENOMINATION");

            while(resultSet.next()) {
                denomination.setDenominationId(resultSet.getInt(1));
                denomination.setDenominationCurrency(resultSet.getString(2));
                denomination.setDenominationAmount(resultSet.getDouble(3));

                denominations.add(denomination);
            }
            statement.close();

            return denominations;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Product> getProducts() {
        try {
            Product product = new Product();
            ArrayList<Product> products = new ArrayList<>();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from PRODUCT");

            while(resultSet.next()) {
                product.setProductId(resultSet.getInt(1));
                product.setProductName(resultSet.getString(2));
                product.setProductPrice(resultSet.getDouble(3));

                products.add(product);
            }
            statement.close();

            return products;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public ArrayList<VendingMachine> getVendingMachines() {
//        try {
//            VendingMachine vendingMachine = new VendingMachine();
//            ArrayList<VendingMachine> vendingMachines = new ArrayList<>();
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from VENDING_MACHINE");
//            ResultSet resultSet1 = statement.executeQuery("select ")
//
//            while(resultSet.next()) {
//                vendingMachine.setVendingMachineCode(resultSet.getInt(1));
//                vendingMachine.setVendingMachineName(resultSet.getString(2));
//                vendingMachine.setTotalDenominationStorageUnitNumber(resultSet.getInt(3));
//                vendingMachine.setDenominationStorageUnitCapacity(resultSet.getInt(4));
//                vendingMachine.setTotalProductStorageUnitNumber(resultSet.getInt(5));
//                vendingMachine.setProductStorageUnitCapacity(resultSet.getInt(6));
//
//            vendingMachines.add(vendingMachine);
//            }
//            statement.close();
//
//            return vendingMachines;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    // Read A Record From The Table

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

//    public VendingMachine getVendingMachineById(int vendingMachineId) {
//        try {
//            VendingMachine vendingMachine = new VendingMachine();
//            preparedStatement = connection.prepareStatement("select * FROM VENDING_MACHINE.vendingMachineCode FROM VENDING_MACHINE vm JOIN DENOMINATION_OF_VENDING_MACHINE dvm ON vm.vendingMachineId = dvm.vendingMachineId JOIN PRODUCT_OF_VENDING_MACHINE pvm vm.vendingMachineId = pvm.vendingMachineId");
//            preparedStatement.setInt(1, vendingMachineId);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while(resultSet.next()) {
//                vendingMachine.setVendingMachineCode(resultSet.getInt(1));
//                vendingMachine.setVendingMachineName(resultSet.getString(2));
//                vendingMachine.setTotalDenominationStorageUnitNumber(resultSet.getInt(3));
//                vendingMachine.setDenominationStorageUnitCapacity(resultSet.getInt(4));
//                vendingMachine.setTotalProductStorageUnitNumber(resultSet.getInt(5));
//                vendingMachine.setProductStorageUnitCapacity(resultSet.getInt(6));
//            }
//            preparedStatement.close();
//
//            return vendingMachine;
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

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

    // Delete A Record From The Table

    public void deleteDenomination(int denominationId) {
        try {
            preparedStatement = connection.prepareStatement("delete * from DENOMINATION WHERE denominationId = ?");
            preparedStatement.setInt(1, denominationId);
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

    // Update A Record In The Table

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

    public void updateProduct(int productId, int productCode, String productName, Double productPrice) {
        try {
            preparedStatement = connection.prepareStatement("update PRODUCT set productCode = ?, productName = ?, productPrice = ? where productId = ?");
            preparedStatement.setInt(1, productCode);
            preparedStatement.setString(2, productName);
            preparedStatement.setDouble(3, productPrice);
            preparedStatement.setInt(4, productId);
            preparedStatement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
