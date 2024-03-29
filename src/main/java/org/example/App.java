package org.example;
import java.sql.*;

public class App
{
    public static void main( String[] args ) throws SQLException {
        System.out.println( "Попробую соедениться с базой данных " );

        Connection connection  = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pp_1_1",
                "root", "1125");
    }
}
