package factura;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private Integer numeroFactura;
    private cliente.Model model;
    private cajero.Model model2;
    private List<ModelDetalleFactura> detalles;
    private double total;
    private LocalDate fecha;

    public Model() {
        this.numeroFactura = 0;
        this.model = new cliente.Model();
        this.model2 = new cajero.Model();
        this.detalles = new ArrayList<>();
        this.total = 0.0;
        this.fecha = LocalDate.now();
    }
    public Model(Integer numeroFactura, cliente.Model cliente, cajero.Model model, List<ModelDetalleFactura> detalles, double total, LocalDate fecha) {
        this.numeroFactura = numeroFactura;
        this.model = cliente != null ? cliente : new cliente.Model(); // actua como un if else
        this.model2 = model != null ? model : new cajero.Model();
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

    public cliente.Model getCliente() {
        return model;
    }

    public void setCliente(cliente.Model model) {
        this.model = model;
    }

    public cajero.Model getCajero() {
        return model2;
    }

    public void setCajero(cajero.Model model) {
        this.model2 = model;
    }

    public List<ModelDetalleFactura> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<ModelDetalleFactura> detalles) {
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
        for (ModelDetalleFactura detalle : detalles) {
            total += detalle.getSubtotal();
        }
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroFactura=" + numeroFactura +
                ", cliente=" + model.getNombre() +
                ", cajero=" + model.getNombre() +
                ", total=" + total +
                ", fecha=" + fecha +
                '}';
    }
}