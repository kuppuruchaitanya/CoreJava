import java.sql.*;  
public class Proc {  
public static void main(String[] args) throws Exception{  
  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Chaitu","chaitu");  
  
CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");  
stmt.setInt(1,1012);  
stmt.setString(2,"Chaitu");  
stmt.execute();  
  
System.out.println("success");  
}  
}  