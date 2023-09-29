public class Main {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Samsung", "TX800", 300, "Android", false, false);
        Smartphone smartphone2 = new Smartphone("Iphone", "10P", 500, "IOS", true, true);
        Tablet tablet1 = new Tablet("Siaomi", "14", 400, 17);
        Altre altre1 = new Altre("Xiaomi", "LH65", 100, "Rellotge Int");
        Tablet tablet2 = new Tablet("TonyOmi", "23", 1000, 23);     

        
        
        System.out.println(smartphone1);
        System.out.println(smartphone2);
        System.out.println(tablet1);
        System.out.println(altre1);
        System.out.println(tablet2);
        
    }
}
