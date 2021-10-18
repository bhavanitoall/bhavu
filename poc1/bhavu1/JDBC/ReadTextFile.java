package JDBC;


	import java.io.BufferedReader;
	import java.io.DataInputStream;
    import java.io.File;
    import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.sql.*;
	import java.util.*;

	import java.sql.*;

	public class ReadTextFile {
		static final String DB_URL = "jdbc:mysql://localhost:3306/poc1";
		static final String USER = "root";
		static final String PASS = "Panjanayagi8!";

		public static void main(String[] args) {

			try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stmt = conn.createStatement();

			) {




				Statement st = conn.createStatement();
				FileInputStream f = new FileInputStream("C:\\Users\\oshelp_it\\Documents\\PlayerDetails.txt");
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
					String  playerName = "", teamName = "", teamID ="",playerScore="";
					for (int i = 0; i < 3; i++) {
						playerName = spliting[0];
						teamName = spliting[1];
						teamID = spliting[2];
					}
					Scanner Input = new Scanner(System.in);
					System.out.println("Enter the score of "+playerName);
					playerScore = Input.nextLine();
			
					ResultSet rsSet = null;
					Statement Stmnt1 = conn.createStatement();
					Stmnt1.executeUpdate("insert into ipltable(playerName,teamName,teamID,playerScore) values('"+playerName+"','"+teamName+"','"+teamID+"','"+playerScore+"')");
					

					}
				}
			
			 catch (SQLException throwables) {
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
	

