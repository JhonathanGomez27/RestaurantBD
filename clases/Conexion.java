/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package clases;

import java.sql.*;

/**
 *
 * @author jhonathan
 */
public class Conexion {
    
    private Connection conexion=null;
    private Cliente cliente;
    
    public Conexion(){
        conectarBD();
    }
    
    public void conectarBD(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            
            System.out.println("ERROR:No fue posible cargar el driver JDBC"+ ex.getLocalizedMessage());
            System.exit(1);
        }
        String 
    }
    
   
}
