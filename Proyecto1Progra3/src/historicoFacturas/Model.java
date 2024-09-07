package historicoFacturas;
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

    public List<factura.Model> getFacturas() {
        return models;
    }

    public factura.Model buscaNumeroFactura(Integer numeroFactura) {
        for (factura.Model model : models) {
            if (model.getNumeroFactura().equals(numeroFactura)) {
                return model;
            }
        }
        return null;
    }
    public List<factura.Model> listarFacturas() {
        return new ArrayList<>(models);
    }
}