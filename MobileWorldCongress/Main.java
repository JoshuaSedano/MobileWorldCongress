package MobileWorldCongress;

public class Main {
    public static void main(String[] args) {
        Dispositiu[] dispositiu = new Dispositiu[5];
        dispositiu[0] = new Altre("Huawei", "TX800", 100, "Rellotge intel·ligent");
        dispositiu[1] = new Smartphone("Samsung", 300, "S20 FE", "Android", "No");
        dispositiu[2] = new Smartphone("Iphone", "X10", 500, "IOS16", "Si");
        dispositiu[3] = new Tablet("Xiaomi", "LH65", 400, 15);
        dispositiu[4] = new Smartphone("Samsung", "touch", 650, "Android");

        for (int i = 0; i < dispositiu.length; i++) {
            System.out.println(dispositiu[i]);
        }

        System.out.println(dispositiu[0].preuFinal());
        System.out.println(dispositiu[1].preuFinal());
        System.out.println(dispositiu[2].preuFinal());
        System.out.println(dispositiu[3].preuFinal());
        System.out.println(dispositiu[4].preuFinal());

        Smartphone s1 = new Smartphone("Samsung", 300, "S20 FE", "Android", "No");
        Smartphone s2 = new Smartphone("Iphone", "X10", 500, "IOS16", "Si");
        Tablet t1 = new Tablet("Xiaomi", "LH65", 400, 15);
        Smartphone s3 = new Smartphone("Samsung", "touch", 650, "Android");
    }
}