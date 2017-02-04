/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBUtils;
import java.util.Random;
import java.io.UnsupportedEncodingException;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getInt;
import static jdk.nashorn.internal.objects.NativeMath.random;
import model.Register;
import model.Login;
/**
 *
 * @author Samil
 */
public class LoginDataAccess {

    
    
    public void addNew(Register n){
        try {
            CallableStatement ps = DBUtils.prepareCall("EXEC dbo.uspAddUser ?,?,?,?,?");
            
            ps.setString(1, n.getLoginName());
            ps.setString(2, n.getPassword());
            ps.setString(3, n.getFirstName());
            ps.setString(4, n.getLastName());
            ps.setString(5, n.getEmail());
            ps.executeQuery();
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String loguear(Login n) throws UnsupportedEncodingException{
        String Passwordhash =null;
        int id=0;
        String rid=null;
        try {
            String sql ="SELECT UserID FROM [dbo].[User] WHERE LoginName = '"+ LoginName+"'" ;
            
            
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            id=rs.getInt(1);
            rid=Integer.toString(id);
            Passwordhash=get_SHA_512_SecurePassword(Password,rid);
           
                
                
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LoginDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Passwordhash ;
    }
   
    
    public static String get_SHA_512_SecurePassword(String passwordToHash, String  salt) throws UnsupportedEncodingException{
String generatedPassword = null;
    try {
         MessageDigest md = MessageDigest.getInstance("SHA-512");
         md.update(salt.getBytes("UTF-8"));
         byte[] bytes = md.digest(passwordToHash.getBytes("UTF-8"));
         StringBuilder sb = new StringBuilder();
         for(int i=0; i< bytes.length ;i++){
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
         }
         generatedPassword = sb.toString();
        } 
       catch (NoSuchAlgorithmException e){
       }
    return generatedPassword;
}
}
