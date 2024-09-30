package controller;

import model.Denomination;
import model.Product;
import model.vendingMachine.DenominationAvailability;
import model.vendingMachine.ProductAvailability;
import model.vendingMachine.VendingMachine;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static database.DatabaseConnector.connection;

public class VendingMachineDatabaseController {
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;

    public void createVendingMachineTable() throws SQLException {
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE VENDING_MACHINE("
                    + "vendingMachineId INT NOT NULL,"
                    + "vendingMachineName VARCHAR(255) NOT NULL,"
                    + "totalDenominationStorageUnitCount INT NOT NULL,"
                    + "denominationStorageUnitCapacity INT NOT NULL,"
                    + "totalProductStorageUnitCount INT NOT NULL,"
                    + "productStorageUnitCapacity INT NOT NULL,"
                    + "PRIMARY KEY (vendingMachineId))");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void insertVendingMachine(int vendingMachineId, String vendingMachineName, int totalDenominationStorageUnitCount, int denominationStorageUnitCapacity, int totalProductStorageUnitCount, int productStorageUnitCapacity) throws SQLException {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("insert into VENDING_MACHINE values (" +
                    vendingMachineId + ",'" + vendingMachineName + "'," + totalDenominationStorageUnitCount + "," + denominationStorageUnitCapacity + "," + totalProductStorageUnitCount + "," + productStorageUnitCapacity + ")");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public VendingMachine getVendingMachineById(int vendingMachineId) throws SQLException {
        try {
            VendingMachine vendingMachine = new VendingMachine();

            preparedStatement = connection.prepareStatement("select * FROM VENDING_MACHINE where vendingMachineId = ?");
            preparedStatement.setInt(1, vendingMachineId);
            ResultSet resultSet = preparedStatement.executeQuery();

            preparedStatement = connection.prepareStatement("select dovm.denominationStorageUnit, dovm.denominationId, dovm.denominationCountOnStorage, d.denominationCurrency, d.denominationAmount FROM DENOMINATION_OF_VENDING_MACHINE dovm INNER JOIN DENOMINATION d ON dovm.denominationId = d.denominationId where dovm.vendingMachineId = ?");
            preparedStatement.setInt(1, vendingMachineId);
            ResultSet resultSet2 = preparedStatement.executeQuery();

            preparedStatement = connection.prepareStatement("select povm.productStorageUnit, povm.productId, povm.productCountOnStorage, p.productName, p.productPrice FROM PRODUCT_OF_VENDING_MACHINE povm INNER JOIN PRODUCT p ON povm.productId = p.productId where povm.vendingMachineId = ?");
            preparedStatement.setInt(1, vendingMachineId);
            ResultSet resultSet3 = preparedStatement.executeQuery();

            while(resultSet.next()) {
                vendingMachine.setVendingMachineId(resultSet.getInt(1));
                vendingMachine.setVendingMachineName(resultSet.getString(2));
                vendingMachine.setTotalDenominationStorageUnitCount(resultSet.getInt(3));
                vendingMachine.setDenominationStorageUnitCapacity(resultSet.getInt(4));
                vendingMachine.setTotalProductStorageUnitCount(resultSet.getInt(5));
                vendingMachine.setProductStorageUnitCapacity(resultSet.getInt(6));

                System.out.println("3.result set created. VendingMachineId'si == " + vendingMachine.getVendingMachineId() + "Olmasi gereken 1 ve 2");

                while(resultSet2.next()) {
                    Denomination denomination = new Denomination();
                    denomination.setDenominationId(resultSet2.getInt("denominationId"));
                    denomination.setDenominationCurrency(resultSet2.getString("denominationCurrency"));
                    denomination.setDenominationAmount(resultSet2.getDouble("denominationAmount"));

                    DenominationAvailability denominationAvailability = new DenominationAvailability();
                    denominationAvailability.setDenomination(denomination);
                    denominationAvailability.setDenominationCountOnUsage(resultSet2.getInt("denominationCountOnStorage"));

                    vendingMachine.setDenominationOnUsage(resultSet2.getInt("denominationStorageUnit"), denominationAvailability);
                }
                while (resultSet3.next()) {
                    Product product = new Product();
                    product.setProductId(resultSet3.getInt("productId"));
                    product.setProductName(resultSet3.getString("productName"));
                    product.setProductPrice(resultSet3.getDouble("productPrice"));

                    ProductAvailability productAvailability = new ProductAvailability();
                    productAvailability.setProduct(product);
                    productAvailability.setProductCountOnStock(resultSet3.getInt("productCountOnStorage"));

                    vendingMachine.setProductOnSale(resultSet3.getInt("productStorageUnit"), productAvailability);
                }
            }
            preparedStatement.close();

            return vendingMachine;

        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public ArrayList<VendingMachine> getVendingMachines() throws SQLException {
        try {
            ArrayList<VendingMachine> vendingMachines = new ArrayList<>();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select vendingMachineId from VENDING_MACHINE");

            while(resultSet.next()) {
                vendingMachines.add(getVendingMachineById(resultSet.getInt("vendingMachineId")));
            }

            statement.close();
            return vendingMachines;
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void updateVendingMachine(int vendingMachineId, String vendingMachineName, int totalDenominationStorageUnitCount
            , int denominationStorageUnitCapacity, int totalProductStorageUnitCount, int productStorageUnitCapacity) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("update PRODUCT set vendingMachineName = ?, totalDenominationStorageUnitCount = ?, denominationStorageUnitCapacity = ?, totalProductStorageUnitCount = ?, productStorageUnitCapacity = ? where productId = ?");
            preparedStatement.setString(1, vendingMachineName);
            preparedStatement.setInt(2, totalDenominationStorageUnitCount);
            preparedStatement.setInt(3, denominationStorageUnitCapacity);
            preparedStatement.setInt(4, totalProductStorageUnitCount);
            preparedStatement.setInt(5, productStorageUnitCapacity);
            preparedStatement.setInt(6, vendingMachineId);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void deleteVendingMachine(int vendingMachineId) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("delete * from VENDING_MACHINE WHERE vendingMachineId = ?");
            preparedStatement.setInt(1, vendingMachineId);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    // DENOMINATION_OF_VENDING_MACHINE

    public void createDenominationOfVendingMachineTable() throws SQLException {
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE DENOMINATION_OF_VENDING_MACHINE("
                    + "vendingMachineId INT NOT NULL,"
                    + "denominationStorageUnit INT NOT NULL,"
                    + "denominationId INT NOT NULL,"
                    + "denominationCountOnStorage INT NOT NULL,"
                    + "FOREIGN KEY (vendingMachineId) REFERENCES VENDING_MACHINE(vendingMachineId) ON DELETE CASCADE,"
                    + "FOREIGN KEY (denominationId) REFERENCES DENOMINATION(denominationId) ON DELETE CASCADE,"
                    + "PRIMARY KEY (vendingMachineId, denominationStorageUnit))");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void insertDenominationToVendingMachine(int vendingMachineId,  int denominationStorageUnit, int denominationId, int denominationCountOnStorage) throws SQLException {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("insert into DENOMINATION_OF_VENDING_MACHINE values (" +
                    vendingMachineId + "," + denominationStorageUnit + "," + denominationId + "," + denominationCountOnStorage +")");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void updateDenominationOfVendingMachine(int vendingMachineId, int denominationStorageUnit, int denominationId, int denominationCountOnStorage) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("update DENOMINATION_OF_VENDING_MACHINE set denominationId = ?, denominationCountOnStorage = ? where vendingMachineId = ? and denominationStorageUnit = ?");
            preparedStatement.setInt(1, denominationId);
            preparedStatement.setInt(2, denominationCountOnStorage);
            preparedStatement.setInt(3, vendingMachineId);
            preparedStatement.setInt(4, denominationStorageUnit);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    // PRODUCT_OF_VENDING_MACHINE

    public void createProductOfVendingMachineTable() throws SQLException {
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE PRODUCT_OF_VENDING_MACHINE("
                    + "vendingMachineId INT NOT NULL,"
                    + "productStorageUnit INT NOT NULL,"
                    + "productId INT NOT NULL,"
                    + "productCountOnStorage INT NOT NULL,"
                    + "FOREIGN KEY (vendingMachineId) REFERENCES VENDING_MACHINE(vendingMachineId) ON DELETE CASCADE,"
                    + "FOREIGN KEY (productId) REFERENCES PRODUCT(productId) ON DELETE CASCADE,"
                    + "PRIMARY KEY (vendingMachineId, productStorageUnit))");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void insertProductToVendingMachine(int vendingMachineId, int productStorageUnit, int productId, int productCountOnStorage) throws SQLException {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("insert into PRODUCT_OF_VENDING_MACHINE values (" +
                    vendingMachineId + "," + productStorageUnit + "," + productId + "," + productCountOnStorage + ")");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void updateProductOfVendingMachine(int vendingMachineId, int productStorageUnit , int productId, int productCountOnStorage) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("update PRODUCT_OF_VENDING_MACHINE set productId = ?, productCountOnStorage = ? where vendingMachineId = ? and productStorageUnit = ?");
            preparedStatement.setInt(1, productId);
            preparedStatement.setInt(2, productCountOnStorage);
            preparedStatement.setInt(3, vendingMachineId);
            preparedStatement.setInt(4, productStorageUnit);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void dropVendingMachineTable() throws SQLException {
        try {
            statement = connection.createStatement();
            statement.execute("DROP TABLE VENDING_MACHINE");
            statement.close();
        }
        catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void dropDenominationOfVendingMachineTable() throws SQLException {
        try {
            statement = connection.createStatement();
            statement.execute("DROP TABLE DENOMINATION_OF_VENDING_MACHINE");
            statement.close();
        }
        catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void dropProductOfVendingMachineTable() throws SQLException {
        try {
            statement = connection.createStatement();
            statement.execute("DROP TABLE PRODUCT_OF_VENDING_MACHINE");
            statement.close();
        }
        catch (SQLException e) {
            throw new SQLException(e);
        }
    }
}
