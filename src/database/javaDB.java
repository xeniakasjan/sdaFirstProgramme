package database;

import java.sql.*;

public class javaDB {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee18","root", "kuristik");

            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM human");

            while (result.next()){
                System.out.println(result.getInt(1));
            }


            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
