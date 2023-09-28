public class Altre {
    
    private String marca;
    private String model;
    private int preuBase;
    private String descripcio;

    public Altre(String marca, String model, int preuBase, String descripcio) {
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

    public int getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(int preuBase) {
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
        String info = "Marca: " + marca + "\n";
        info += "Model: " + model + "\n";
        info += "Preu Base: " + preuBase + " Euros\n";
        info += "Descripcio: " + descripcio + "\n";
        return info;
    }
}
