package EA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
	public static void createNewDatabase(String filename) {
		String url = "jdbc:sqlite:C:/Users/ongwe/Desktop/" + filename;
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(url);
			
			if(con!= null) {
				System.out.println("A new database has been created");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public static void createNewTable() {
		
		String url = "jdbc:sqlite:C:/Users/ongwe/Desktop/StudentTadikaKecil.db";
				
		String sql = "CREATE TABLE IF NOT EXISTS students (\n" 
				+ "name text PRIMARY KEY, \n" 
				+ "ic integer NOT NULL, \n" 
				+ "gender text NOT NULL,\n"
				+ "age integer NOT NULL,\n"
				+ "dateBirth text NOT NULL,\n"
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
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createNewDatabase("StudentTadikaKecil.db");
		createNewTable();
	}

}
