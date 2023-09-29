package MobileWorldCongress;

public class Tablet extends Dispositiu {

    private double nPolsades;

    public Tablet(String marca, String model, double preuBase, double nPolsades) {
        super(marca, model, preuBase);
        this.nPolsades = nPolsades;
    }

    public double getnPolsades() {
        return nPolsades;
    }

    public void setnPolsades(double nPolsades) {
        this.nPolsades = nPolsades;
    }

    @Override
    public String toString() {
        return "Tablet{" + "nPolsades=" + nPolsades + '"' + " " + super.toString() + '}';
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
