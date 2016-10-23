package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alour
 */
public class Task {

    private final int id;
    private String nombre;
    private String descripcion;


    private int duracionEstimada;
    private long fechaInicio;
    private long fechaFin;
    private int prioridad;
    private int estado;
    private int idPadre;
    private int idProyecto;

    public Task(int id, String nombre, String descripcion, int duracionEstimada, long fechaInicio, long fechaFin, int prioridad, int estado, int idPadre, int idProyecto) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracionEstimada = duracionEstimada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.prioridad = prioridad;
        this.estado = estado;
        this.idPadre = idPadre;
        this.idProyecto = idProyecto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public void setFechaInicio(long fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(long fechaFin) {
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

    public long getFechaInicio() {
        return fechaInicio;
    }

    public long getFechaFin() {
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
