package estadisticas;
import factura.ModelDetalleFactura;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<factura.Model> models;

    public Model() {
        this.models = new ArrayList<>();
    }
    public void agregarFactura(factura.Model model) {
        if (model != null) {
            this.models.add(model);
        }
    }
    private boolean facturaMes(LocalDate fechaFactura, LocalDate mes) {
        return fechaFactura.getYear() == mes.getYear() && fechaFactura.getMonth() == mes.getMonth();
    }
    public double calcularVentasPorCategoria(String categoria, LocalDate mes) {
        double totalVentas = 0.0;
        for (factura.Model model : models) {
            if (facturaMes(model.getFecha(), mes)) {
                for (ModelDetalleFactura detalle : model.getDetalles()) {
                    producto.Model producto = detalle.getProducto();
                    if (producto.getCategoria().equals(categoria)) {
                        totalVentas += detalle.getSubtotal();
                    }
                }
            }
        }
        return totalVentas;
    }

    public double calculaVentaTotal(LocalDate mes) {
        double totalVentas = 0.0;
        for (factura.Model model : models) {
            if (facturaMes(model.getFecha(), mes)) {
                totalVentas += model.getTotal();
            }
        }
        return totalVentas;
    }

    public List<factura.Model> getFacturas() {
        return models;
    }

    public void setFacturas(List<factura.Model> models) {
        if (models != null) {
            this.models = models;
        } else {
            this.models = new ArrayList<>();
        }
    }
}