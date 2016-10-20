/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alour
 */
public class Task {

    private int id;
    private String nombre;
    private int duracionEstimada;
    private int fechaInicio;
    private int fechaFin;
    private int prioridad;

    public Task(int id, String nombre, int duracionEstimada, int fechaInicio, int fechaFin, int prioridad) {
        this.id = id;
        this.nombre = nombre;
        this.duracionEstimada = duracionEstimada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.prioridad = prioridad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionEstimada(int duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionEstimada() {
        return duracionEstimada;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public int getFechaFin() {
        return fechaFin;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
