package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alour
 */
public class Task {

    private int id;
    private String nombre;
    private int duracionEstimada;
    private Long fechaInicio;
    private Long fechaFin;
    private int prioridad;
    private int idProyecto;

    public Task(int id, String nombre, int duracionEstimada, Long fechaInicio, Long fechaFin, int prioridad, int idProyecto) {
        this.id = id;
        this.nombre = nombre;
        this.duracionEstimada = duracionEstimada;
        this.fechaInicio = (fechaInicio != null) ? fechaInicio:0;
        this.fechaFin = (fechaFin != null) ? fechaFin:0;
        this.prioridad = prioridad;
        this.idProyecto = idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionEstimada(int duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public void setFechaInicio(Long fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Long fechaFin) {
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

    public Long getFechaInicio() {
        return fechaInicio;
    }

    public Long getFechaFin() {
        return fechaFin;
    }

    public String getFechaInicioFormat() {
        SimpleDateFormat df = new SimpleDateFormat("d/M/yyyy");
        return (fechaInicio == 0)? "-": df.format(new Date(fechaInicio));
    }

    public String getFechaFinFormat() {
        SimpleDateFormat df = new SimpleDateFormat("d/M/yyyy");
        return (fechaFin==0) ? "-" : df.format(new Date(fechaFin));
    }
    
    
    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
