package org.example;

import java.sql.*;

public class JDBC {
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/ingest_db";
    private static final String USERNAME = "fa2";
    private static final String PASSWORD = "123456";

    public static void main(String[] args) {
        // Load the PostgreSQL JDBC driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC Driver not found");
            e.printStackTrace();
            return;
        }
        Connection connection = null;
        try {
            // Establish a connection to the PostgreSQL database
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query it returns a array rows
            ResultSet resultSet = statement.executeQuery("select * from csv_logger");

            // Iterate over the result set and print the results
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                System.out.println("ID: " + id + ", Name: " + name);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Connection failed or query execution problem");
            e.printStackTrace();
        } finally {
            try {
                // Close the connection in the finally block to ensure it always happens
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error closing connection");
                e.printStackTrace();
            }
        }
    }
}