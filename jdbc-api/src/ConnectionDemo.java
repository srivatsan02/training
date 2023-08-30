import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {

    public static void main(String[] args) throws Exception {

        
        Connection conn = JdbcFactory.getConnection();
        System.out.println("Connection successfull");
        
        java.sql.DatabaseMetaData meta = conn.getMetaData();
        System.out.println("DB Name: "+ meta.getDatabaseProductName());
        System.out.println("DB Version: "+ meta.getDatabaseProductVersion());
        System.out.println("Driver Name: "+ meta.getDriverName());
        System.out.println("Driver Version: "+ meta.getDriverVersion());


    }

}

 