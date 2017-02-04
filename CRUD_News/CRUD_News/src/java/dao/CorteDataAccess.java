/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBUtils;
import dao.TransaccionDataAccess;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Corte;
import model.Transaccion;

/**
 *
 * @author Samil
 */
public class CorteDataAccess {
     
    public static List<Corte> getAll(){
        List<Corte> ls = new LinkedList<>();
        
        try {
            ResultSet rs = DBUtils.getPreparedStatement("select * from Corte").executeQuery();
            while(rs.next()){
                Corte n= new Corte(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getDate(6), rs.getDate(7));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CorteDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
    public void corte(int CorteID, String Nickname, Date FechaInicio, Date FechaFinal){
        try {
            int egresos=0;
            int ingresos=0;
            int corte;
            TransaccionDataAccess da = new TransaccionDataAccess();
             String sqle = "select * from Transaccion where TipoTransaccion = 'Egreso' AND Nickname = '" +Nickname+"' AND Fecha BETWEEN '"+FechaInicio+"' AND '"+FechaFinal+"'";
            ResultSet rs = DBUtils.getPreparedStatement(sqle).executeQuery();
            while(rs.next()){
                Transaccion r = new Transaccion(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getDate(7));
                egresos -= rs.getInt(5);
                da.delete(rs.getInt(1));
            }
            
            
            String sqli = "select * from Transaccion where TipoTransaccion = 'Ingreso' AND Nickname = '" +Nickname+"' AND Fecha BETWEEN '"+FechaInicio+"' AND '"+FechaFinal+"'";
            ResultSet ri = DBUtils.getPreparedStatement(sqli).executeQuery();
            while(ri.next()){
                Transaccion r = new Transaccion(ri.getInt(1), ri.getString(2), ri.getString(3), ri.getString(4), ri.getInt(5), ri.getString(6), ri.getDate(7));
                ingresos += ri.getInt(5);
                da.delete(ri.getInt(1));
            }
            
            
            corte=egresos+ingresos;
            
             PreparedStatement pq = DBUtils.getPreparedStatement("insert into Corte values(?,?,?,?,?,?)");
            pq.setInt(1, egresos);
            pq.setInt(2, ingresos);
            pq.setInt(3, corte);
            pq.setString(4, Nickname);
            pq.setDate(5, FechaInicio);
            pq.setDate(6, FechaFinal);
            pq.executeUpdate();
            
            corte2(egresos,ingresos,corte,Nickname);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CorteDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void corte2(int eg, int in, int corte, String nickname){
        int ID=0;
        try {
            ResultSet rt = DBUtils.getPreparedStatement("select * from Corte where CantidadEgresos = "+eg+" AND CantidadIngresos = "+in+" AND Corte = "+corte+" AND Nickname = '"+nickname+"'").executeQuery();
            while(rt.next()){
            Corte n= new Corte(rt.getInt(1), rt.getInt(2), rt.getInt(3), rt.getInt(4), rt.getString(5), rt.getDate(6), rt.getDate(7));
            ID+=rt.getInt(1);
            }
            String sqlo = "update CorteInfo SET CorteID= ? " + "where CorteID = 0";
            PreparedStatement pz= DBUtils.getPreparedStatement(sqlo);
            pz.setInt(1, ID);
            pz.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CorteDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
