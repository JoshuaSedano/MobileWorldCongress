package MobileWorldCongress;


public class Tablet {
    
    private String marca;
    private Strign model;
    private double preuBase;
    private double nPolsades;
    
    public Tablet(String marca, String model, double preuBase, double nPolsades) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.nPolsades = nPolsades;
    }

    // Getters
    public String getMarca() {
        return marca;
    } 

    public String getModel() {
        return model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public double getnPolsades() {
        return nPolsades;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    public void setnPolsades(double nPolsades) {
        this.nPolsades = nPolsades;
    }


    // Altres metodes
    @Override
    public String toString() {
        return "Tablet{Model" + model + ", Marca " + marca + 
        ", Preu Base " + preuBase + 
        ", nPolsades=" + nPolsades "}";
    }
}
