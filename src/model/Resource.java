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
public class Resource {

    private int id;
    private String nombre;
    private float valor;
    private int idProyecto;

    public Resource(int id, String nombre, float valor, int idProyecto) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.idProyecto = idProyecto;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getValor() {
        return valor;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
