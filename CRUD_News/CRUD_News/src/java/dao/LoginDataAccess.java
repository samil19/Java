/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBUtils;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Login;
/**
 *
 * @author Samil
 */
public class LoginDataAccess {

    
    
    public void addNew(Login n){
        try {
            CallableStatement ps = DBUtils.prepareCall("EXEC dbo.uspAddUser ?,?,?,?");
            
            ps.setString(1, n.getLoginName());
            ps.setString(2, n.getPassword());
            ps.setString(3, n.getFirstName());
            ps.setString(4, n.getLastName());
            ps.executeQuery();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
