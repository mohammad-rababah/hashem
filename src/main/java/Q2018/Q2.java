package Q2018;

import java.sql.*;

public class Q2 {

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
            ResultSet resultSet = statement.executeQuery("select itemName,number,price from Stock ");
            String sLet = "a";
            // Iterate over the result set and print the results
            while (resultSet.next()) {
                String itemName = resultSet.getString("itemName");
                if (itemName.startsWith(sLet)) {
                    // right
                    System.out.println(itemName + "\t" + "$" + resultSet.getDouble("price"));
                }

            }


            ResultSet resultSet2 = statement.executeQuery("select TrainNo,From,Status,Time from TrainArrivals ");
            String location = "London";
            // Iterate over the result set and print the results
            while (resultSet.next()) {
                String from = resultSet2.getString("From");
                String status = resultSet2.getString("Status");
                String time = resultSet2.getString("Time");
                if (from.equals(location)) {
                    // right
                    System.out.print(from);
                    System.out.print(time);
                    System.out.println(status);
                }


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

    void insert(String itemName, int number, double price) {
        try {

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query it returns a array rows
//            itemName = "item1";
//            number = 10;
//            price = 100.0;
            // insert into Stock values ('item1',10,100.0)
            statement.executeUpdate("insert into Stock values ('" + itemName + "'," + number + "," + price + ")");
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

    void insert2(String TrainNo, String From, String Status, String Time) {
        try {

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query it returns a array rows
            statement.executeUpdate("insert into TrainArrivals values ('" + TrainNo + "','" + From + "','" + Time + "','" + Status + "')");
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

