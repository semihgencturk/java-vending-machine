package controller;

import model.VendingMachine;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static database.DatabaseConnector.connection;

public class VendingMachineController {
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;

    public void createVendingMachineTable() throws SQLException {
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
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void insertVendingMachine(int vendingMachineId, String vendingMachineName, int totalDenominationStorageUnitNumber, int denominationStorageUnitCapacity, int totalProductStorageUnitNumber, int productStorageUnitCapacity) throws SQLException {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("insert into VENDING_MACHINE values (" +
                    vendingMachineId + ",'" + vendingMachineName + "'," + totalDenominationStorageUnitNumber + "," + denominationStorageUnitCapacity + "," + totalProductStorageUnitNumber + "," + productStorageUnitCapacity + ")");
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
                    vendingMachine.setProductsOnSale(resultSet3.getInt("productStorageUnit"), resultSet3.getInt("productId"));
                    vendingMachine.setProductsOnSaleAvailability(resultSet3.getInt("productStorageUnit"), resultSet3.getInt("productPiece"));
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

    public void updateVendingMachine(int vendingMachineId, String vendingMachineName, int totalDenominationStorageUnitNumber, int denominationStorageUnitCapacity, int totalProductStorageUnitNumber, int productStorageUnitCapacity) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("update PRODUCT set vendingMachineName = ?, totalDenominationStorageUnitNumber = ?, denominationStorageUnitCapacity = ?, totalProductStorageUnitNumber = ?, productStorageUnitCapacity = ? where productId = ?");
            preparedStatement.setString(1, vendingMachineName);
            preparedStatement.setInt(2, totalDenominationStorageUnitNumber);
            preparedStatement.setInt(3, denominationStorageUnitCapacity);
            preparedStatement.setInt(4, totalProductStorageUnitNumber);
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
                    + "denominationPiece INT NOT NULL,"
                    + "FOREIGN KEY (vendingMachineId) REFERENCES VENDING_MACHINE(vendingMachineId) ON DELETE CASCADE,"
                    + "FOREIGN KEY (denominationId) REFERENCES DENOMINATION(denominationId) ON DELETE CASCADE,"
                    + "PRIMARY KEY (vendingMachineId, denominationStorageUnit))");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void insertDenominationToVendingMachine(int vendingMachineId,  int denominationStorageUnit, int denominationId, int denominationPiece) throws SQLException {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("insert into DENOMINATION_OF_VENDING_MACHINE values (" +
                    vendingMachineId + "," + denominationStorageUnit + "," + denominationId + "," + denominationPiece +")");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void updateDenominationOfVendingMachine(int vendingMachineId, int denominationStorageUnit, int denominationId, int denominationPiece) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("update DENOMINATION_OF_VENDING_MACHINE set denominationId = ?, denominationPiece = ? where vendingMachineId = ? and denominationStorageUnit = ?");
            preparedStatement.setInt(1, denominationId);
            preparedStatement.setInt(2, denominationPiece);
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
                    + "productPiece INT NOT NULL,"
                    + "FOREIGN KEY (vendingMachineId) REFERENCES VENDING_MACHINE(vendingMachineId) ON DELETE CASCADE,"
                    + "FOREIGN KEY (productId) REFERENCES PRODUCT(productId) ON DELETE CASCADE,"
                    + "PRIMARY KEY (vendingMachineId, productStorageUnit))");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void insertProductToVendingMachine(int vendingMachineId, int productStorageUnit, int productId, int productPiece) throws SQLException {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("insert into PRODUCT_OF_VENDING_MACHINE values (" +
                    vendingMachineId + "," + productStorageUnit + "," + productId + "," + productPiece + ")");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void updateProductOfVendingMachine(int vendingMachineId, int productStorageUnit , int productId, int productPiece) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("update PRODUCT_OF_VENDING_MACHINE set productId = ?, productPiece = ? where vendingMachineId = ? and productStorageUnit = ?");
            preparedStatement.setInt(1, productId);
            preparedStatement.setInt(2, productPiece);
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
