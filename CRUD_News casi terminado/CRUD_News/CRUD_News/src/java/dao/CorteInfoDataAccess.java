/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CorteInfo;

/**
 *
 * @author Samil
 */
public class CorteInfoDataAccess {
    public static List<CorteInfo> getAll(){
        List<CorteInfo> ls = new LinkedList<>();
        
        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from CorteInfo").executeQuery();
            while(rs.next()){
                CorteInfo n= new CorteInfo(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4),rs.getString(5));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CorteInfoDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
}