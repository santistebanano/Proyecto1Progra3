package factura;

import producto.Model;

public class ModelDetalleFactura {
    private Model model;
    private int cantidad;
    private double precioUnitario;

    public ModelDetalleFactura(Model model, int cantidad, double precioUnitario) {
        this.model = model;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return cantidad * precioUnitario;
    }

    public Model getProducto() {
        return model;
    }
}