
package com.examen.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name="eventos")
public class Evento implements Serializable{
     
    @Id /*PrimaryKey*/
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    /*Esta linea signigica el primarykey es autoincremental*/
    private long id;
    private String artista;
    private long costo;
    private String fecha;
    private String capacidad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
 
@ManyToOne
    @JoinColumn(name="lugares_id") /*ForeingKey*/
    private Lugar lugares; 

    public Lugar getLugares() {
        return lugares;
    }

    public void setLugares(Lugar lugares) {
        this.lugares = lugares;
    }
    
    
    
}
