import java.sql.*;
import java.io.*;
class Dynamicdata
{
	public static void main(String[] args) 
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/training";
			String username="root";
			String password="Databasesql@1";
			Connection con=DriverManager.getConnection(url,username,password);
			String q="insert into table1(tName,tCity) values (?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name:");
			String name=br.readLine();
			System.out.println("Enter city:");
			String city=br.readLine();
			pstmt.setString(1,name);
			pstmt.setString(2,city);
			pstmt.executeUpdate();
			System.out.println("table data inserted...");
			con.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}