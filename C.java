public class C {
    public static void main(String[] args){
        // non primitive data type
        String nama = "Andi Wahyudi";
        nama = "Ali Wahyudin";
        System.out.println(nama);
        System.out.println(nama.length());
        System.out.println(nama.toUpperCase());
        System.out.println(nama.toLowerCase());
        System.out.println(nama.charAt(1));
        System.out.println(nama.indexOf("A"));
        System.out.println(nama.indexOf(" "));
        System.out.println(nama.replace("A", "O"));

        // Buat program code
        // untuk menghitung jumlah karakter tertentu dalam suatu string
        // "arya" => berapa karakter "a" ? jumlah "a" = 2 
        String name = "Indonesia RAya";
        String cari = "A";
        name = name.toLowerCase();
        cari = cari.toLowerCase();
        String nameTanpaCari = name.replace(cari, "");
        System.out.println(name);
        System.out.println(cari);
        System.out.println(nameTanpaCari);
        System.out.println(name.length() - nameTanpaCari.length());
    }
}