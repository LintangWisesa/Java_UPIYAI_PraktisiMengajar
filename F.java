public class F {

    // method
    static void Hello() {
        System.out.println("Hello!");
    }

    // method with parameter
    static void Halo(String x) {
        System.out.println("Hello " + x + "!");
    }

    // method with multiple parameter
    static void Hai(String nama, String kota, int usia) {
        System.out.println("Hai " + nama + ", kamu asal " + kota + " usiamu " + usia);
    }

    static void Jumlah(int x, int y){
        System.out.println(x + y);
    }

    // return method
    static int ReturnLima(){
        return 5; 
    }
    static String ReturnDeni(){
        return "Deni";
    }
    static int HasilKali(int x, int y){
        int z = x * y;
        return z;
    }

    public static void main(String[] args){
        Hello();
        // argument
        Halo("Andi");
        // multiple argument
        Hai("Andi", "Jakarta", 21);
        Hai("Ali", "Bekasi", 22);
        Jumlah(10, 20);
        Jumlah(12, 6);
        System.out.println(HasilKali(3, 4));
        System.out.println(HasilKali(10, 2));
        // System.out.println(ReturnLima());
        // System.out.println(ReturnDeni());
    }
}