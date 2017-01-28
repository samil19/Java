/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesk.lproduct.conn;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lesk
 */
public class ConnectionUtils {
    public static Connection getConnection()
             throws ClassNotFoundException, SQLException {
      
       // Here I using Oracle Database.
       //return OracleConnUtils.getOracleConnection();
        
        return MySqlConnUtils.getMySQLConnection();
       // return SQLServerConnUtils_JTDS.getSQLServerConnection_JTDS();
       // return SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
   }
    
   public static void closeQuietly(Connection conn) {
       try {
           conn.close();
       } catch (Exception e) {
       }
   }
 
   public static void rollbackQuietly(Connection conn) {
       try {
           conn.rollback();
       } catch (Exception e) {
       }
   }
}


