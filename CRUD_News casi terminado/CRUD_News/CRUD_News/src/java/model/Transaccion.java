/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Samil
 */
public class Transaccion {
    private int TransaccionID;
    private String TipoTransaccion;
    private String TipoPago;
    private String Nickname;
    private int Monto;
    private String Comentario;

    public Transaccion(int TransaccionID, String TipoTransaccion, String TipoPago, String Nickname, int Monto, String Comentario) {
        this.TransaccionID = TransaccionID;
        this.TipoTransaccion = TipoTransaccion;
        this.TipoPago = TipoPago;
        this.Nickname = Nickname;
        this.Monto = Monto;
        this.Comentario = Comentario;
    }
    
    public int getTransaccionID() {
        return TransaccionID;
    }

    public void setTransaccionID(int TransaccionID) {
        this.TransaccionID = TransaccionID;
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

   
    
}
