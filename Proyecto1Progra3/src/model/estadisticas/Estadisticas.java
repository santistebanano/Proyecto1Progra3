package model.estadisticas;
import model.factura.DetalleFactura;
import model.factura.Factura;
import model.producto.Producto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estadisticas {
    private List<Factura> facturas;

    public Estadisticas() {
        this.facturas = new ArrayList<>();
    }
    public void agregarFactura(Factura factura) {
        if (factura != null) {
            this.facturas.add(factura);
        }
    }
    private boolean facturaMes(LocalDate fechaFactura, LocalDate mes) {
        return fechaFactura.getYear() == mes.getYear() && fechaFactura.getMonth() == mes.getMonth();
    }
    public double calcularVentasPorCategoria(String categoria, LocalDate mes) {
        double totalVentas = 0.0;
        for (Factura factura : facturas) {
            if (facturaMes(factura.getFecha(), mes)) {
                for (DetalleFactura detalle : factura.getDetalles()) {
                    Producto producto = detalle.getProducto();
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
        for (Factura factura : facturas) {
            if (facturaMes(factura.getFecha(), mes)) {
                totalVentas += factura.getTotal();
            }
        }
        return totalVentas;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        if (facturas != null) {
            this.facturas = facturas;
        } else {
            this.facturas = new ArrayList<>();
        }
    }
}