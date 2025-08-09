package com.JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {
        String sql = "select first_name from employees where employee_id=1";
        String url = "jdbc:postgresql://localhost:5432/JDBC1";
        String username = "postgres";
        String password = "Maharj@n123";

        // 1. Connect to the database
        Connection con = DriverManager.getConnection(url, username, password);

        // 2. Create statement object
        Statement st = con.createStatement();

        // 3. Execute query
        ResultSet rs = st.executeQuery(sql);

        // 4. Move to first row
        if (rs.next()) {
            // 5. Get value of first column
            String name = rs.getString(1);
            System.out.println(name);
        } else {
            System.out.println("No result found for id=1");
        }

        // 6. Close resources
        rs.close();
        st.close();
        con.close();
    }
}
