import java.sql.*;
class TabledataJDBC
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
			pstmt.setString(1,"Nasrin Ansari");
			pstmt.setString(2,"Bangalore");
			pstmt.executeUpdate();
			System.out.println("table data inserted...");
			con.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}