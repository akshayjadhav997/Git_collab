package Testing;

public class jdbc_connection {
public static void main(String[] args) {
	
	String dbClass = "com.mysql.jdbc.Driver";
    Class.forName(dbClass).newInstance();
    // Get connection to DB
    Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    // Statement object to send the SQL statement to the Database
    stmt = con.createStatement();
    }
    catch (Exception e)
    {
          e.printStackTrace();
    }
}
}
