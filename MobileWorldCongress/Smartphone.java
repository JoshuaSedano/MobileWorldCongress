package MobileWorldCongress;

public class Smartphone extends Dispositiu {
    public static final String accPerDefecte = "No";
    public static final String GpsPerDefecte = "Si";
    
    private String sistemaOperatiu;
    private String accelerometre;
    private String gps;
    
    public Smartphone(String marca, String model, double preuBase, String sistemaOperatiu, String accelerometre, String gps) {
        super(marca, model, preuBase);
        this.sistemaOperatiu = sistemaOperatiu;
        this.accelerometre = accelerometre;
        this.gps = gps;
    }
    
    public Smartphone(String marca, String model, double preuBase, String sistemaOperatiu){
        this(marca, model, preuBase, sistemaOperatiu, accPerDefecte, GpsPerDefecte);
    }
    
    public Smartphone(String marca, String model, double preuBase, String sistemaOperatiu, String accelerometre){
        this(marca, model, preuBase, sistemaOperatiu, accelerometre, GpsPerDefecte);
    }
    
    public Smartphone(String marca, double preuBase, String model, String sistemaOperatiu, String gps){
        this(marca, model, preuBase, sistemaOperatiu, accPerDefecte, gps);
    }

    public String getSistemaOperatiu() {
        return sistemaOperatiu;
    }

    public void setSistemaOperatiu(String sistemaOperatiu) {
        this.sistemaOperatiu = sistemaOperatiu;
    }

    public String getAccelerometre() {
        return accelerometre;
    }

    public void setAccelerometre(String accelerometre) {
        this.accelerometre = accelerometre;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "sistemaOperatiu=" + sistemaOperatiu + ", accelerometre=" + accelerometre + ", gps=" + gps + " " + super.toString() + '}';
    }

    @Override
    public double preuFinal() {
        double nouPreu;
        double preuFinal;
        double preuBase;
        
        preuBase = getPreuBase();
        preuFinal = preuBase * 2;
        
        if(!accelerometre.equalsIgnoreCase(accPerDefecte)){
            nouPreu = preuBase * 0.10;
            nouPreu = nouPreu + preuBase;
            preuFinal = nouPreu + preuBase;
        }
        
        if(!accelerometre.equalsIgnoreCase(accPerDefecte) && gps.equalsIgnoreCase(GpsPerDefecte)){
            nouPreu = preuBase * 0.15;
            nouPreu = nouPreu + preuBase;
            preuFinal = nouPreu + preuBase;
        }
        return preuFinal;
    }
}
