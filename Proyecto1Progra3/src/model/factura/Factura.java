package model.factura;
import model.cliente.Cliente;
import model.cajero.Cajero;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private Integer numeroFactura;
    private Cliente cliente;
    private Cajero cajero;
    private List<DetalleFactura> detalles;
    private double total;
    private LocalDate fecha;

    // Constructor por defecto
    public Factura() {
        this.numeroFactura = 0;
        this.cliente = new Cliente();
        this.cajero = new Cajero();
        this.detalles = new ArrayList<>();
        this.total = 0.0;
        this.fecha = LocalDate.now();
    }
    public Factura(Integer numeroFactura, Cliente cliente, Cajero cajero, List<DetalleFactura> detalles, double total, LocalDate fecha) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente != null ? cliente : new Cliente(); // actua como un if else
        this.cajero = cajero != null ? cajero : new Cajero();
        this.detalles = detalles != null ? detalles : new ArrayList<>();
        this.total = total;
        this.fecha = fecha != null ? fecha : LocalDate.now();
        calcularTotal();
    }

    public Integer getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public List<DetalleFactura> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleFactura> detalles) {
        this.detalles = detalles != null ? detalles : new ArrayList<>();
        calcularTotal();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha != null ? fecha : LocalDate.now();
    }
    private void calcularTotal() {
        total = 0.0;
        for (DetalleFactura detalle : detalles) {
            total += detalle.getSubtotal();
        }
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroFactura=" + numeroFactura +
                ", cliente=" + cliente.getNombre() +
                ", cajero=" + cajero.getNombre() +
                ", total=" + total +
                ", fecha=" + fecha +
                '}';
    }
}