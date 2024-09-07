package model.historicoFacturas;
import model.factura.Factura;
import java.util.ArrayList;
import java.util.List;

public class HistoricoFacturas {
    private List<Factura> facturas;


    public HistoricoFacturas() {
        this.facturas = new ArrayList<>();
    }

    public void agregarFactura(Factura factura) {
        if (factura != null) {
            this.facturas.add(factura);
        }
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public Factura buscaNumeroFactura(Integer numeroFactura) {
        for (Factura factura : facturas) {
            if (factura.getNumeroFactura().equals(numeroFactura)) {
                return factura;
            }
        }
        return null;
    }
    public List<Factura> listarFacturas() {
        return new ArrayList<>(facturas);
    }
}