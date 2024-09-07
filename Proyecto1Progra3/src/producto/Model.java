package producto;

public class Model {
    private Integer codigo;
    private String descripcion;
    private String unidadMedida;
    private Double precioBaseUnitario;
    private Integer existencias;
    private ModelCategoria modelCategoria;

    // Constructor sin parámetros
    public Model() {
        this.codigo = 0;
        this.descripcion = "";
        this.unidadMedida = "";
        this.precioBaseUnitario = 0.0;
        this.existencias = 0;
        this.modelCategoria = new ModelCategoria();
    }

    // Constructor con parámetros
    public Model(Integer codigo, String descripcion, String unidadMedida, Double precioBaseUnitario, Integer existencias, ModelCategoria modelCategoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.precioBaseUnitario = precioBaseUnitario;
        this.existencias = existencias;
        this.modelCategoria = modelCategoria;
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

    public ModelCategoria getCategoria() {
        return modelCategoria;
    }

    public void setCategoria(ModelCategoria modelCategoria) {
        this.modelCategoria = modelCategoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Codigo=" + codigo +
                ", Descripcion='" + descripcion + '\'' +
                ", Unidad de Medida='" + unidadMedida + '\'' +
                ", Precio Unitario=" + precioBaseUnitario +
                ", Existencias=" + existencias +
                ", Categoria=" + modelCategoria.getNombre() +
                '}';
    }
}