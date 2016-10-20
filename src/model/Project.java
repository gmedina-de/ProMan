package model;

public class Project {

    private int id;
    private String name;
    private String descripcion;

    public Project(int id, String name, String descripcion) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
