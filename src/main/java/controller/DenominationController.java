package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import static database.DatabaseConnector.connection;

public class DenominationController {
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;

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

    public model.Denomination getDenominationById(int denominationId) {
        try {
            model.Denomination denomination = new model.Denomination();
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

    public ArrayList<model.Denomination> getDenominations() {
        try {
            ArrayList<model.Denomination> denominations= new ArrayList<>();
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

    public void dropDenominationTable() {
        try {
            statement = connection.createStatement();
            statement.execute("DROP TABLE DENOMINATION");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
