/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Samil
 */
public class CorteInfo {
    private int ID;
    private String TipoTransaccion;
    private String TipoPago;
    private String Nickname;
    private int Monto;
    private String Comentario;
    private int CorteID;
    private Date Fecha;

    public CorteInfo(int ID, String TipoTransaccion, String TipoPago, String Nickname, int Monto, String Comentario, int CorteID, Date Fecha) {
        this.ID = ID;
        this.TipoTransaccion = TipoTransaccion;
        this.TipoPago = TipoPago;
        this.Nickname = Nickname;
        this.Monto = Monto;
        this.Comentario = Comentario;
        this.CorteID = CorteID;
        this.Fecha = Fecha;
    }
    
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipoTransaccion() {
        return TipoTransaccion;
    }

    public void setTipoTransaccion(String TipoTransaccion) {
        this.TipoTransaccion = TipoTransaccion;
    }

    public String getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public int getCorteID() {
        return CorteID;
    }

    public void setCorteID(int CorteID) {
        this.CorteID = CorteID;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

   
}