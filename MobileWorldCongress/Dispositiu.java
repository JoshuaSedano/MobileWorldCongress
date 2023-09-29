package MobileWorldCongress;

public abstract class Dispositiu {

    private String marca;
    private String model;
    private double preuBase;

    public Dispositiu(String marca, String model, double preuBase) {
        if (preuBase < 0) {
            throw new IllegalArgumentException("El preu no es correcte");
        }

        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
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

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    @Override
    public String toString() {
        return "Dispositiu{" + "marca=" + marca + ", model=" + model + ", preuBase=" + preuBase + "€" + '}';
    }

    public abstract double preuFinal();
}