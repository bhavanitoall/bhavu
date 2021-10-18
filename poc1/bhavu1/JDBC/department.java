package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class department {
	static final String DB_URL = "jdbc:mysql://localhost:3306/poc";
	static final String USER ="root";
	static final String PASS ="Panjanayagi8!";
	
	public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
        	String drop = "DROP TABLE IF EXISTS student";
		     stmt.executeUpdate(drop);

		String sql = "CREATE TABLE IF NOT EXISTS Student " + "(StudID int, " + " FirstName VARCHAR(30), "
				+ " LastName VARCHAR(30), " + " DepID smallint not null, " + " JoiningDate date, " + " DOB date, "
				+ " MobileNo bigint," + " EmailID NVARCHAR(50)," + " PRIMARY KEY ( StudID ))";

		stmt.executeUpdate(sql);
        	

//            Insert value
            System.out.println("Inserting records into the table...");
            sql = "INSERT INTO Department VALUES (111, 'CSE')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Department VALUES (112, 'EEE')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Department VALUES (113, 'IT')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Department VALUES(114, 'ECE')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Department VALUES(115, 'Arch')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Department VALUES(116, 'MECH')";
            stmt.executeUpdate(sql);
            
            System.out.println("data inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

	