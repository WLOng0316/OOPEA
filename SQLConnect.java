package EA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SQLConnect {
	
	Connection con= null;
	
	public static Connection ConnectDB() {
		String url = "jdbc:sqlite:C:/Users/ongwe/Desktop/StudentTadikaKecil.db";
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(url);
			System.out.println("Connection Established");
			createNewTable();
			
			return con;
		} catch (Exception e)
		{
		return null;
		}
	}
	
	
public static void createNewTable() {
		
		String url = "jdbc:sqlite:C:/Users/ongwe/Desktop/StudentTadikaKecil.db";
				
		String sql = "CREATE TABLE IF NOT EXISTS students (\n" 
				+ "name text PRIMARY KEY, \n" 
				+ "ic integer NOT NULL, \n" 
				+ "gender text NOT NULL,\n"
				+ "age integer NOT NULL,\n"
				+ "dateBirth integer NOT NULL,\n"
				+ "address text NOT NULL,\n"
				+ "G1Name text NOT NULL,\n"
				+ "G1Ic integer NOT NULL,\n"
				+ "G1Relationship text NOT NULL,\n"
				+ "G1phNum integer NOT NULL,\n"
				+ "G2Name text NOT NULL,\n"
				+ "G2Ic integer NOT NULL,\n"
				+ "G2Relationship text NOT NULL,\n"
				+ "G2phNum integer NOT NULL\n"
				+ ");";
		
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(url);
			
			Statement stmt = con.createStatement();
			stmt.execute(sql);
			
			if(con !=null) {
				System.out.println("A new table has been created");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
/*public static ObservableList<Score> getDatausers(){
			
			ObservableList<Score> list = FXCollections.observableArrayList();
			String url3 = "jdbc:sqlite:C:/Users/ongwe/Desktop/Score.db";
			String Sql = "SELECT * FROM scores";
			try {
				
				Class.forName("org.sqlite.JDBC");
				Connection con= DriverManager.getConnection(url3);
				Statement ps = con.createStatement();
				ResultSet resultSet = ps.executeQuery(Sql);
				
//							
				while(resultSet.next()) {
					list.add(new Score(resultSet.getString("course"),Integer.parseInt(resultSet.getString("id")),Integer.parseInt(resultSet.getString("score"))));
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list;
		}*/

}