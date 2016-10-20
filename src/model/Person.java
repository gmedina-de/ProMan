package model;

public class Person {

    private int id;
    private String name;
    private String password;

    public Person(int id, String nombre, String contraseña) {
        this.id = id;
        this.name = nombre;
        this.password = contraseña;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
