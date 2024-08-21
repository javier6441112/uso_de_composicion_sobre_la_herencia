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
public class Carro {
    String noPlaca;
    String Chassis;
    String modelo;
    String vin;
    SistemaFrenos sistemaFrenos;
    SistemaDireccion SistemaDireccion;

    public String getNoPlaca() {
        return noPlaca;
    }

    public void setNoPlaca(String noPlaca) {
        this.noPlaca = noPlaca;
    }

    public String getChassis() {
        return Chassis;
    }

    public void setChassis(String Chassis) {
        this.Chassis = Chassis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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

    public Carro() {
    }
            
    
}
