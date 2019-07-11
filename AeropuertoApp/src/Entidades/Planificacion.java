/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Sistema.Sistema;
import java.time.LocalDateTime;

/**
 *
 * @author Homar Herrera
 */
public class Planificacion {
    
    private static int contador = 0;
    private String avion;
    private String cod_vuelo;
    private LocalDateTime boarding_time;
    private LocalDateTime departute_time;
    private String IATA_arribo;
    private String IATA_salida;
    private String destino;
    private int asientos_prim_clase;
    private int asientos_norm_clase;

    public Planificacion(String avion, String cod_vuelo, LocalDateTime boarding_time, LocalDateTime departute_time, String IATA_arribo, String IATA_salida, int asientos_prim_clase, int asientos_norm_clase) {
        this.avion = avion;
        this.cod_vuelo = cod_vuelo;
        this.boarding_time = boarding_time;
        this.departute_time = departute_time;
        this.IATA_arribo = IATA_arribo;
        this.IATA_salida = IATA_salida;
        this.asientos_prim_clase = asientos_prim_clase;
        this.asientos_norm_clase = asientos_norm_clase;
        this.destino = IATA_arribo.split("/")[1];
    }
    
    
   
    public static boolean existeCodigoVuelo(String cod){
        boolean control=false;
        if( cod.equals("")){
            control=true;
        }
        for(Planificacion planificacion: Sistema.planificaciones){
            if(planificacion.cod_vuelo.equals(cod)){
                control=true;
            }
        }
        return control;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Planificacion.contador = contador;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    public String getCod_vuelo() {
        return cod_vuelo;
    }

    public void setCod_vuelo(String cod_vuelo) {
        this.cod_vuelo = cod_vuelo;
    }

    public LocalDateTime getBoarding_time() {
        return boarding_time;
    }

    public void setBoarding_time(LocalDateTime boarding_time) {
        this.boarding_time = boarding_time;
    }

    public LocalDateTime getDepartute_time() {
        return departute_time;
    }

    public void setDepartute_time(LocalDateTime departute_time) {
        this.departute_time = departute_time;
    }

    public String getIATA_arribo() {
        return IATA_arribo;
    }

    public void setIATA_arribo(String IATA_arribo) {
        this.IATA_arribo = IATA_arribo;
    }

    public String getIATA_salida() {
        return IATA_salida;
    }

    public void setIATA_salida(String IATA_salida) {
        this.IATA_salida = IATA_salida;
    }

    public int getAsientos_prim_clase() {
        return asientos_prim_clase;
    }

    public void setAsientos_prim_clase(int asientos_prim_clase) {
        this.asientos_prim_clase = asientos_prim_clase;
    }

    public int getAsientos_norm_clase() {
        return asientos_norm_clase;
    }

    public void setAsientos_norm_clase(int asientos_norm_clase) {
        this.asientos_norm_clase = asientos_norm_clase;
    }
    
}