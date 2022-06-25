package com.stanrunge.opt3.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    public static String connectToDatabase(String query) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/com.stanrunge.opt3.osu", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if(rs.next()) {
                return rs.getString(1);
            }

            return "null";
        } catch (Exception e) {
            return e.toString();
        }
    }
}
