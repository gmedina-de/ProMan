package model;

import java.util.logging.Logger;

public class Person {

    private int id;
    private String name;
    private String password;
    private String rol;

    public Person(int id, String nombre, String contraseña, String rol) {
        this.id = id;
        this.name = nombre;
        this.password = contraseña;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public static Logger getLOG() {
        return LOG;
    }
    private static final Logger LOG = Logger.getLogger(Person.class.getName());

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
