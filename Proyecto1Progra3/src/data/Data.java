package data;
import cliente.Model;
import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {


    @XmlElementWrapper(name = "tipos")
    @XmlElement(name = "tipo")
    private List <Model> model;



    public Data(){
        model = new ArrayList<>();

    }
    public List <Model> getCliente() {
        return getCliente();
    }
}
