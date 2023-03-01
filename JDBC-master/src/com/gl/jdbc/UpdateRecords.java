package com.gl.jdbc;

import java.sql.*;

public class UpdateRecords {

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



        //Modify Email_Id column to varchar(30) NOT NULL

        String queryModify = "ALTER TABLE Employee MODIFY COLUMN Email_Id varchar(30) NOT NULL ";

        stmt.executeUpdate(queryModify);

        //Insert 2 records and check

        String queryInsert1 = "Insert into employee(Id,Name,Email_id,Phone_Number) values(6,'Rishabh','rishabh@gmail.com','987654321')";
        String queryInsert2 = "Insert into employee(Id,Name,Email_id,Phone_Number) values(7,'Shubham','shubham@gmail.com','887654321')";

        int i1 = stmt.executeUpdate(queryInsert1);
        int i2 = stmt.executeUpdate(queryInsert2);



        //Update the name of employee Id 3 to Karthik and phone number to 1234567890.

        int updateQuery1 = stmt.executeUpdate("UPDATE Employee SET Name='Karthik' WHERE Id = 3");
        int updateQuery2 = stmt.executeUpdate("UPDATE Employee SET Phone_Number = '1234567890' WHERE Id = 3");



    }
}
