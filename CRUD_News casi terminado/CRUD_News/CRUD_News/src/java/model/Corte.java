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
public class Corte {
    private int CorteID;
    private int CantidadEgresos;
    private int CantidadIngresos;
    private int Corte;
    private String Nickname;

    public Corte(int CorteID, int CantidadEgresos, int CantidadIngresos, int Corte, String Nickname) {
        this.CorteID = CorteID;
        this.CantidadEgresos = CantidadEgresos;
        this.CantidadIngresos = CantidadIngresos;
        this.Corte = Corte;
        this.Nickname = Nickname;
    }

    public Corte(int aInt, int aInt0, String string, String string0, int aInt1, String string1, int aInt2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public int getCorteID() {
        return CorteID;
    }

    public void setCorteID(int CorteID) {
        this.CorteID = CorteID;
    }

    public int getCantidadEgresos() {
        return CantidadEgresos;
    }

    public void setCantidadEgresos(int CantidadEgresos) {
        this.CantidadEgresos = CantidadEgresos;
    }

    public int getCantidadIngresos() {
        return CantidadIngresos;
    }

    public void setCantidadIngresos(int CantidadIngresos) {
        this.CantidadIngresos = CantidadIngresos;
    }

    public int getCorte() {
        return Corte;
    }

    public void setCorte(int Corte) {
        this.Corte = Corte;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    
    
}
