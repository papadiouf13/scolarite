package com.ecole221;

import com.ecole221.service.DBHelper;

import java.sql.Array;
import java.sql.SQLException;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws SQLException {
        DBHelper db = DBHelper.getInstance();
        db.executeMaj("INSERT INTO filiere VALUES (null, 'xxxxxxxxx')", null);
        int id = db.getGeneratedKeys();
        System.out.println(id);
    }
}
