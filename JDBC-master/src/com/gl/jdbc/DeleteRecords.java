package com.gl.jdbc;

import java.sql.*;

public class DeleteRecords {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection con;
        Statement stmt;
        ResultSet rs;
        String url="jdbc:mysql://localhost:3306/GL";
        String user="root";
        String password="962630";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,user,password);
        stmt = con.createStatement();


        //Delete employee records 3 and 4.

        int updateQuery1 = stmt.executeUpdate("DELETE FROM EMPLOYEE WHERE ID IN (3,4)");

        System.out.println("Deleted Successfully " + updateQuery1);

        //Remove all records from the table employee.

        String deleteQuery = "DELETE FROM Employee";
        int result = stmt.executeUpdate(deleteQuery);
        System.out.println("Number of records deleted: "+result);
    }
}
