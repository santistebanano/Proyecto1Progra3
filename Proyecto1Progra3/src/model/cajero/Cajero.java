package model.cajero;

public class Cajero {
    private Integer id;
    private String nombre;

    // Constructor por defecto
    public Cajero() {
        this.id = 0;
        this.nombre = "";
    }

    // Constructor con parámetros
    public Cajero(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cajero{" +
                ", Identificacion =" + id +
                ", Nombre='" + nombre + '\'' +
                '}';
    }
}
