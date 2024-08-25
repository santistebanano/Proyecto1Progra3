public class Producto {
    private Integer codigo;
    private String descripcion;
    private String unidadMedida;
    private Integer precioUnitario;
    private Integer existencias;
    private String categoria;

    public Producto(){
        this.codigo = 0;
        this.descripcion = "";
        this.unidadMedida = "";
        this.precioUnitario = 0;
        this.existencias = 0;
        this.categoria = "";
    }
    public Producto(Integer codigo, String descripcion, String unidadMedida, Integer precioUnitario, Integer existencias, String categoria){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.precioUnitario = precioUnitario;
        this.existencias = existencias;
        this.categoria = categoria;
    }


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

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getExistencias() {
        return existencias;
    }

    public void setUnidades(Integer existencias) {
        this.existencias = existencias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString(){

        return
                "Codico: " + this.getCodigo() + "\n" +
                "Descripcion: " + this.getDescripcion() + "\n" +
                "Unidad de medida: " + this.getUnidadMedida() + "\n" +
                "Precio unitario: " + this.getPrecioUnitario() + "\n" +
                "Existencias: " + this.getExistencias() + "\n" +
                "Categoria: " + this.getCategoria();
    }
}
