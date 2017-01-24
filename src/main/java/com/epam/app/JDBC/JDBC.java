package com.epam.app.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by jacek on 24.01.17.
 */
public class JDBC {

    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin@localhost:1521:xe";

    static final String USER = "oracle";
    static final String PASS = "oracle";

    public static Connection connection() throws SQLException{

           return DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe","oracle","oracle");


    }
}
