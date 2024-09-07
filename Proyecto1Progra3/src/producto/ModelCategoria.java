package producto;

public class ModelCategoria {
    private String nombre;
    private String descripcion;

    // Constructor sin parámetros
    public ModelCategoria() {
        this.nombre = "";
        this.descripcion = "";
    }

    // Constructor con parámetros
    public ModelCategoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "Nombre='" + nombre + '\'' +
                ", Descripcion='" + descripcion + '\'' +
                '}';
    }
}