package model.producto;

public class Producto {
    private Integer codigo;
    private String descripcion;
    private String unidadMedida;
    private Double precioBaseUnitario;
    private Integer existencias;
    private Categoria categoria;

    // Constructor sin parámetros
    public Producto() {
        this.codigo = 0;
        this.descripcion = "";
        this.unidadMedida = "";
        this.precioBaseUnitario = 0.0;
        this.existencias = 0;
        this.categoria = new Categoria();
    }

    // Constructor con parámetros
    public Producto(Integer codigo, String descripcion, String unidadMedida, Double precioBaseUnitario, Integer existencias, Categoria categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.precioBaseUnitario = precioBaseUnitario;
        this.existencias = existencias;
        this.categoria = categoria;
    }

    // Getters y Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Double getprecioBaseUnitario() {
        return precioBaseUnitario;
    }

    public void setprecioBaseUnitario(Double precioBaseUnitario) {
        this.precioBaseUnitario = precioBaseUnitario;
    }

    public Integer getExistencias() {
        return existencias;
    }

    public void setExistencias(Integer existencias) {
        this.existencias = existencias;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Codigo=" + codigo +
                ", Descripcion='" + descripcion + '\'' +
                ", Unidad de Medida='" + unidadMedida + '\'' +
                ", Precio Unitario=" + precioBaseUnitario +
                ", Existencias=" + existencias +
                ", Categoria=" + categoria.getNombre() +
                '}';
    }
}