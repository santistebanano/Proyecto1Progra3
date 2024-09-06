package model.cliente;

public class Cliente {
    private Integer id;
    private String nombre;
    private String numeroTelefono;
    private String email;
    private double porcentajeDescuento;

    // Constructor por defecto
    public Cliente() {
        this.id = 0;
        this.nombre = "";
        this.numeroTelefono = "";
        this.email = "";
        this.porcentajeDescuento = 0.0;
    }

    // Constructor con parámetros
    public Cliente(Integer id, String nombre, String numeroTelefono, String email, double porcentajeDescuento) {
        this.id = id;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
        this.setPorcentajeDescuento(porcentajeDescuento);
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

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    // Validacion de Porcentaje de Descuento
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", email='" + email + '\'' +
                ", porcentajeDescuento=" + porcentajeDescuento +
                '}';
    }
}
