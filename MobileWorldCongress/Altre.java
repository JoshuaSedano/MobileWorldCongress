package MobileWorldCongress;

public class Altre extends Dispositiu {

    private String descripcio;

    public Altre(String marca, String model, double preuBase, String descripcio) {
        super(marca, model, preuBase);
        this.descripcio = descripcio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return "AltreDispositiu{" + "descripcio=" + descripcio + " " + super.toString() + '}';
    }

    @Override
    public double preuFinal() {
        double preuFinal;
        double preuBase;

        preuBase = getPreuBase();
        preuFinal = preuBase * 2;
        return preuFinal;
    }
}
