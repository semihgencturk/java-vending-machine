package controller;

import model.Denomination;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static database.DatabaseConnector.connection;

public class DenominationDatabaseController {
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;

    public void createDenominationTable() throws SQLException {
        try {
            statement = connection.createStatement();
            statement.execute("CREATE TABLE DENOMINATION("
                    + "denominationId INT NOT NULL,"
                    + "denominationCurrency VARCHAR(255) NOT NULL,"
                    + "denominationAmount DOUBLE NOT NULL,"
                    + "PRIMARY KEY (denominationId))");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void insertDenomination(int denominationId, String denominationCurrency, double denominationAmount) throws SQLException {
        try {
            statement = connection.createStatement();
            statement.executeUpdate("insert into DENOMINATION values (" + denominationId + ",'" + denominationCurrency + "'," + denominationAmount + ")");
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public Denomination getDenominationById(int denominationId) throws SQLException {
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

        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public ArrayList<Denomination> getDenominations() throws SQLException {
        try {
            ArrayList<Denomination> denominations= new ArrayList<>();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select denominationId from DENOMINATION");

            while(resultSet.next()) {
                denominations.add(getDenominationById(resultSet.getInt("denominationId")));
            }
            statement.close();

            return denominations;
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void updateDenomination(int denominationId, String denominationCurrency, Double denominationAmount) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("update DENOMINATION set denominationCurrency = ?, denominationAmount = ? where denominationId = ?");
            preparedStatement.setString(1, denominationCurrency);
            preparedStatement.setDouble(2, denominationAmount);
            preparedStatement.setInt(3, denominationId);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void deleteDenomination(int denominationId) throws SQLException {
        try {
            preparedStatement = connection.prepareStatement("delete * from DENOMINATION WHERE denominationId = ?");
            preparedStatement.setInt(1, denominationId);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public void dropDenominationTable() throws SQLException {
        try {
            statement = connection.createStatement();
            statement.execute("DROP TABLE DENOMINATION");
            statement.close();
        }
        catch (SQLException e) {
            throw new SQLException(e);
        }
    }
}
