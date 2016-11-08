/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 *
 * @author EdisonA
 */
public class conectar {
Connection conectar=null;
    public Connection conexion(){
try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
             conectar = DriverManager.getConnection("jdbc:odbc:Driver=Microsoft Access Driver (*.mdb); "
                     + "DBQ=C:/Users/EdisonA/Desktop/bd.mdb");
             


 
        }
        catch (Exception e){
            System.out.print(e.getMessage());
            
        } 
        return conectar;

}
}
