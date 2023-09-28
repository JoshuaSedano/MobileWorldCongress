public class Smartphone {
    private String marca;
    private String model;
    private double preuBase;
    private String sistemaOperatiu;
    private boolean accelerometre;
    private boolean gps;

    // Constructor
    public Smartphone(String marca, String model, double preuBase, String sistemaOperatiu, boolean accelerometre,
            boolean gps) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.sistemaOperatiu = sistemaOperatiu;
        this.accelerometre = accelerometre;
        this.gps = gps;
    }

    // Getters y setters
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

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    public String getSistemaOperatiu() {
        return sistemaOperatiu;
    }

    public void setSistemaOperatiu(String sistemaOperatiu) {
        this.sistemaOperatiu = sistemaOperatiu;
    }

    public boolean hasAccelerometre() {
        return accelerometre;
    }

    public void setAccelerometre(boolean accelerometre) {
        this.accelerometre = accelerometre;
    }

    public boolean hasGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    // Sobreescribir el método toString para obtener la información del smartphone
    @Override
    public String toString() {
        String info = "Marca: " + marca + "\n";
        info += "Model: " + model + "\n";
        info += "Preu Base: " + preuBase + " Euros\n";
        info += "Sistema Operatiu: " + sistemaOperatiu + "\n";
        info += "Acceleròmetre: " + (accelerometre ? "Si" : "No") + "\n";
        info += "GPS: " + (gps ? "Si" : "No") + "\n";
        return info;
    }
}
