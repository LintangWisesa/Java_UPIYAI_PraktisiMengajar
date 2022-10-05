public class G {

    // Method untuk menentukan ganjil / genap
    static String GanGen(int x){
        // x % 2 = 0 ga ada sisa = genap
        // x % 2 != 0 ada sisa = ganjil
        if (x % 2 == 0){
            return x + " = GENAP";
        } else {
            return x + " = GANJIL";
        }
    }

    public static void main(String[] args){

        // if statement
        int nilai = 90; // jika nilai > 80, LULUS. nilai <= 80, TIDAK LULUS
        if (nilai > 80){
            System.out.println("ANDA LULUS!");
        } else {
            System.out.println("ANDA TIDAK LULUS!");
        }

        // else if statement
        int x = 6;  // x>7: TINGGI | x<5: RENDAH | 5<=x<=7: MEDIUM
        if (x > 7){
            System.out.println("NILAI X TINGGI");
        } else if (x < 5){
            System.out.println("NILAI X RENDAH");
        } else {
            System.out.println("NILAI X MEDIUM");
        }

        System.out.println(GanGen(12));
        System.out.println(GanGen(13));
        System.out.println(GanGen(99));
    }
}