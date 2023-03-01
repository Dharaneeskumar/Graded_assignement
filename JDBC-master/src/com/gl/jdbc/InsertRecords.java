package com.gl.jdbc;

import java.sql.*;

public class InsertRecords {

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

        //Insert 5 records.

        String insert1 = "Insert into employee(Id,Name,Email_id,Phone_Number) values" +
                "(1,'Virat','rachel@gmail.com','987654321')";
        String insert2 = "Insert into employee(Id,Name,Email_id,Phone_Number) values" +
                "(2,'Rohit','rohit@gmail.com','887654321')";
        String insert3 = "Insert into employee(Id,Name,Email_id,Phone_Number) values" +
                "(3,'Rahane','rahane@gmail.com','787654321')";
        String insert4 = "Insert into employee(Id,Name,Email_id,Phone_Number) values" +
                "(4,'Shreyas','shreyas@gmail.com','9987654321')";
        String insert5 = "Insert into employee(Id,Name,Email_id,Phone_Number) values" +
                "(5,'Ashwin','ashwin@gmail.com','9787654321')";

        int result1 = stmt.executeUpdate(insert1);

        int result2 = stmt.executeUpdate(insert2);

        int result3 = stmt.executeUpdate(insert3);

        int result4 = stmt.executeUpdate(insert4);

        int result5 = stmt.executeUpdate(insert5);


        




    }
}
