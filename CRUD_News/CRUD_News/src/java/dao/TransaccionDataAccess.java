/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import db.DBUtils;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Transaccion;

/**
 *
 * @author Samil
 */
public class TransaccionDataAccess {
    public void addNew(Transaccion n){
        try {
            PreparedStatement ps = DBUtils.getPreparedStatement("insert into Transaccion values( ?, ?, ?, ?, ?, ?)");
            ps.setString(1, n.getTipoTransaccion());
            ps.setString(2, n.getTipoPago());
            ps.setString(3, n.getNickname());
            ps.setInt(4, n.getMonto());
            ps.setString(5, n.getComentario());
            ps.setDate(6, n.getFecha());
            ps.executeUpdate();
//            addNew2(n);
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public void addNew2(Transaccion z) {
//        try{
//            
//        PreparedStatement in = DBUtils.getPreparedStatement("insert into CorteInfo values( ?, ?, ?, ?, ?, ?, ?, ?)");
//            in.setInt(1, 0);
//            in.setString(2, z.getTipoTransaccion());
//            in.setString(3, z.getTipoPago());
//            in.setString(4, z.getNickname());
//            in.setInt(5, z.getMonto());
//            in.setString(6, z.getComentario());
//            in.setInt(7, 0);
//            in.setDate(8, z.getFecha());
//            in.executeUpdate();
//            
//            } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    public static List<Transaccion> getAll(){
        List<Transaccion> ls = new LinkedList<>();
        
        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from Transaccion").executeQuery();
            while(rs.next()){
                Transaccion n= new Transaccion(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getDate(7));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
    public static List<Transaccion> getNewById(int id){
        List<Transaccion> ls = new LinkedList<>();
        String sql = "select * from Transaccion where TransaccionID = " +id;
        try {
            ResultSet rs = DBUtils.getPreparedStatement(sql).executeQuery();
            while(rs.next()){
                Transaccion n = new Transaccion(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getDate(7));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }
    
    public void edit(int TransaccionID, String TipoTransaccion, String TipoPago, String Nickname, int Monto, String Comentario, Date Fecha){
        try {
            String sql = "update Transaccion SET TipoTransaccion = ?, TipoPago = ?, Nickname = ?, Monto = ?, Comentario = ?, Fecha = ?" + " where TransaccionID = "+ TransaccionID;
            PreparedStatement ps= DBUtils.getPreparedStatement(sql);
            ps.setString(1, TipoTransaccion);
            ps.setString(2, TipoPago);
            ps.setString(3, Nickname);
            ps.setInt(4, Monto);
            ps.setString(5, Comentario);
            ps.setDate(6, Fecha);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void delete(int TransaccionID){
        try {
            String sql = "delete Transaccion where TransaccionID = ?";
            String sql2 = "delete CorteInfo where TransaccionID = ?";
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setInt(1, TransaccionID);
            ps.executeUpdate();
            PreparedStatement ps2 = DBUtils.getPreparedStatement(sql2);
            ps2.setInt(1, TransaccionID);
            ps2.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public void delete2(int TransaccionID){
        try {
            String sql = "delete Transaccion where TransaccionID = ?";
            
            PreparedStatement ps = DBUtils.getPreparedStatement(sql);
            ps.setInt(1, TransaccionID);
            ps.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaccionDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
