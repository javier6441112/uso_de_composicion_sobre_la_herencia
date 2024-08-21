/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicion_herencia;

/**
 *
 * @author lestu
 */
//esta es la clase que se va a componer de otras clases
public class Moto {
    String placa;
    String color;
    String cilindraje;
    SistemaFrenos sistemaFrenos;
    SistemaDireccion SistemaDireccion;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public SistemaFrenos getSistemaFrenos() {
        return sistemaFrenos;
    }

    public void setSistemaFrenos(SistemaFrenos sistemaFrenos) {
        this.sistemaFrenos = sistemaFrenos;
    }

    public SistemaDireccion getSistemaDireccion() {
        return SistemaDireccion;
    }

    public void setSistemaDireccion(SistemaDireccion SistemaDireccion) {
        this.SistemaDireccion = SistemaDireccion;
    }

    public Moto() {
    }
    
    
}
