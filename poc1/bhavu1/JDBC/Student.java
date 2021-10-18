package JDBC;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.*;

import java.sql.*;

public class Student {
	static final String DB_URL = "jdbc:mysql://localhost:3306/poc";
	static final String USER = "root";
	static final String PASS = "Panjanayagi8!";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();

		) {

			String drop = "DROP TABLE IF EXISTS student";
			stmt.executeUpdate(drop);

			String sql = "CREATE TABLE IF NOT EXISTS Student " + "(StudID int, " + " FirstName VARCHAR(30), "
					+ " LastName VARCHAR(30), " + " DepID smallint not null, " + " JoiningDate date, " + " DOB date, "
					+ " MobileNo bigint," + " EmailID NVARCHAR(50)," + " PRIMARY KEY ( StudID ))";

			stmt.executeUpdate(sql);


	            
			sql = "INSERT INTO Student VALUES(1, 'pavani', 'C', 1 , '2021-01-21' , '1999-10-19' , 9867565654 , 'pavi@gmail.com')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Student VALUES (2, 'selciya', 'nayagam', 2 , '2021-02-20' , '2000-10-20' , 9766765645 , 'selci@gmail.com')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Student VALUES (3, 'keerthana', 'deivasigamani', 3 , '2021-04-21' , '2000-11-19' , 9878756534 , 'keerthana@gmail.com')";
			stmt.executeUpdate(sql);
  		System.out.println("values inserted.....");


			Statement st = conn.createStatement();
			FileInputStream f = new FileInputStream("C:\\Users\\oshelp_it\\Downloads\\inputtoday.txt");
			DataInputStream in = new DataInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			ArrayList list = new ArrayList();
			while ((strLine = br.readLine()) != null) {
				list.add(strLine);
			}
			Iterator itr;
			for (itr = list.iterator(); itr.hasNext();) {
				String str = itr.next().toString();
				String[] spliting = str.split("\t");
				String sid = "", fname = "", lname = "", deptID = "", joinDate = "", dob = "", phNo = "", email = "";
				for (int i = 0; i <= 8; i++) {
					sid = spliting[0];
					fname = spliting[1];
					lname = spliting[2];
					deptID = spliting[3];
					joinDate = spliting[4];
					dob = spliting[5];
					phNo = spliting[6];
					email = spliting[7];
				}
				ResultSet rsSet = null;
				Statement Stmnt1 = conn.createStatement();
				int i = Stmnt1.executeUpdate(
						"insert into student(StudID, FirstName, LastName, DepID, JoiningDate, DOB, MobileNo, EmailID) values('"
								+ sid + "','" + fname + "','" + lname + "','" + deptID + "','" + joinDate + "','" + dob
								+ "','" + phNo + "','" + email + "')");
				System.out.println("inserted " + fname + "into db");

			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
