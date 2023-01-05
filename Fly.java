package com.example.java_gugakordzakhia;

import java.sql.SQLException;

public class Fly {
    private static final String CREATE_TABLE = "CREATE TABLE AIRLINES(" +
            "DIRECTION VARCHAR(255)," +
            "TIME VARCHAR(155)," +
            "SEATS INTEGER," +
            "PRICE INTEGER," +
            "PRIMARY KEY(ID))";


    public static void createTable() throws SQLException {
        try {
            JDBCConfig.getStatement().executeUpdate(CREATE_TABLE);
            System.out.println("Create table in given database");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
