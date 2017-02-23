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
public class Corte {
    private int CorteID;
    private double CantidadEgresos;
    private double CantidadIngresos;
    private double Corte;
    private String Nickname;
    private Date FechaInicio;
    private Date FechaFinal;

    public Corte(int CorteID, double CantidadEgresos, double CantidadIngresos, double Corte, String Nickname, Date FechaInicio, Date FechaFinal) {
        this.CorteID = CorteID;
        this.CantidadEgresos = CantidadEgresos;
        this.CantidadIngresos = CantidadIngresos;
        this.Corte = Corte;
        this.Nickname = Nickname;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
    }
    
    

    public int getCorteID() {
        return CorteID;
    }

    public void setCorteID(int CorteID) {
        this.CorteID = CorteID;
    }

    public double getCantidadEgresos() {
        return CantidadEgresos;
    }

    public void setCantidadEgresos(int CantidadEgresos) {
        this.CantidadEgresos = CantidadEgresos;
    }

    public double getCantidadIngresos() {
        return CantidadIngresos;
    }

    public void setCantidadIngresos(double CantidadIngresos) {
        this.CantidadIngresos = CantidadIngresos;
    }

    public double getCorte() {
        return Corte;
    }

    public void setCorte(double Corte) {
        this.Corte = Corte;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }
    
    

}