package Interface;


import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnect {
    
    Connection con=null;
    
    public static Connection connectdb(){
        
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UWUART","root","");
           
            
            return con;
          
        } catch (Exception e) {
        }
        return null;
    
    
    
      
    }
    
    
}