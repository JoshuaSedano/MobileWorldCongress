public class Altre {
    
    private String marca;
    private String model;
    private String preuBase;
    private String descripcio;

    public Altre(String marca, String model, String preuBase, String descripcio) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.descripcio = descripcio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(String preuBase) {
        this.preuBase = preuBase;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return "Altre{" + "marca=" + marca + ", model=" + model + ", preuBase=" + preuBase + ", descripcio=" + descripcio + '}';
    }
    
    
}
