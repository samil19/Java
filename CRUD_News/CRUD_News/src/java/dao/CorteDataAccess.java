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
                Corte n= new Corte(rs.getInt(1), rs.getDouble(2), rs.getDouble(3), rs.getDouble(4), rs.getString(5), rs.getDate(6), rs.getDate(7));
                ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CorteDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ls;
    }
    
    public void corte(int CorteID, String Nickname, Date FechaInicio, Date FechaFinal){
        try {
            double egresos=0;
            double ingresos=0;
            double corte;
            TransaccionDataAccess da = new TransaccionDataAccess();
             String sqle = "select * from Transaccion where TipoTransaccion = 'Egreso' AND Nickname = '" +Nickname+"' AND Fecha BETWEEN '"+FechaInicio+"' AND '"+FechaFinal+"'";
            ResultSet rs = DBUtils.getPreparedStatement(sqle).executeQuery();
            while(rs.next()){
                Transaccion q = new Transaccion(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getDouble(9), rs.getDouble(10));
                egresos -= rs.getDouble(5);
                da.delete2(rs.getInt(1));
            }
            
            
            String sqli = "select * from Transaccion where TipoTransaccion = 'Ingreso' AND Nickname = '" +Nickname+"' AND Fecha BETWEEN '"+FechaInicio+"' AND '"+FechaFinal+"'";
            ResultSet ri = DBUtils.getPreparedStatement(sqli).executeQuery();
            while(ri.next()){
                Transaccion r = new Transaccion(ri.getInt(1), ri.getString(2), ri.getString(3), ri.getString(4), ri.getDouble(5), ri.getString(6), ri.getDate(7), ri.getString(8), ri.getDouble(9), ri.getDouble(10));
                ingresos += ri.getDouble(5);
                da.delete2(ri.getInt(1));
            }
            
            
            corte=egresos+ingresos;
            
             PreparedStatement pq = DBUtils.getPreparedStatement("insert into Corte values(?,?,?,?,?,?)");
            pq.setDouble(1, egresos);
            pq.setDouble(2, ingresos);
            pq.setDouble(3, corte);
            pq.setString(4, Nickname);
            pq.setDate(5, FechaInicio);
            pq.setDate(6, FechaFinal);
            pq.executeUpdate();
            
            corte2(egresos,ingresos,corte,Nickname,FechaInicio,FechaFinal);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CorteDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void corte2(double eg, double in, double corte, String nickname, Date FechaInicio, Date FechaFinal){
        int ID=0;
        try {
            ResultSet rt = DBUtils.getPreparedStatement("select * from Corte where CantidadEgresos = "+eg+" AND CantidadIngresos = "+in+" AND Corte = "+corte+" AND Nickname = '"+nickname+"'").executeQuery();
            while(rt.next()){
            Corte n= new Corte(rt.getInt(1), rt.getDouble(2), rt.getDouble(3), rt.getDouble(4), rt.getString(5), rt.getDate(6), rt.getDate(7));
            ID+=rt.getInt(1);
            }
            String sqlo = "update CorteInfo SET CorteID= ? " + "where CorteID = 0 AND Fecha BETWEEN '"+FechaInicio+"' AND '"+FechaFinal+"'";
            PreparedStatement pz= DBUtils.getPreparedStatement(sqlo);
            pz.setInt(1, ID);
            pz.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CorteDataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
