![simplinnovation](https://1.bp.blogspot.com/-wStk0VZDfMk/YCC0GIRPrDI/AAAAAAAAAGc/1yj7IOUedvoeO1CuCxq7ETLW0FqXni6mwCLcBGAsYHQ/s320/logotext.png)

# __Praktisi Mengajar 2022__

- Kelas: __Dasar-Dasar Pemrograman__
- Program Studi: __Sistem Informasi__
- Perguruan Tinggi: __Universitas Persada Indonesia Y.A.I__
- Dosen: __Drs. Ahmad Rosadi, M.Kom__
- Praktisi: __Lintang Wisesa Atissalam, S.Si__

<hr/>

## Pertemuan 1 - Sabtu, 1 Oktober 2022

📁 Slide: [Primitive and Non Primitif Data Types](https://docs.google.com/presentation/d/1lmAKCo4QR-s9maFcgxjJX5b765MhIn2FLPQ_Mk0cj1s/edit?usp=sharing)

Variabel dalam bahasa pemrograman Java harus memiliki tipe data yang spesifik, yang mengidentifikasikan ukuran maupun value dari variabel tersebut. Di Java, terdapat 2 jenis tipe data berdasarkan ukuran dan valuenya, yakni tipe data primitif (`boolean`, `byte`, `char`, `int`, `float`, `double`, `short`, `long`) dan tipe data non-primitif (`String`, `Array`, `Class`). Tipe data primitif memiliki ukuran memori tertentu namun tidak memiliki method tambahan. Sedangkan tipe data non-primitif merupakan object Java yang memiliki method tambahan tertentu.

```java
public class MainClass {
    public static void main(String[] args){
        // primitive data types
        boolean a = true;
        byte b = 120;
        int c = 123456789;
        double d = 3.5d;
        float e = 13.56f;
        char f = 'a';
        char g = '\u0061';  // hex code
        char h = 97;        // ASCII code

        // non-primitive data type
        String i = "Hello World!";
        System.out.println(i);
        System.out.println(i.length());
        System.out.println(i.toUpperCase());
        System.out.println(i.toLowerCase());
        System.out.println(i.charAt(1));
        System.out.println(i.indexOf("H"));
        System.out.println(i.replace("e", "a"));
    }
}
```

<hr/>

## Pertemuan 2 - Rabu, 5 Oktober 2022

📁 Slide: [Primitive and Non Primitif Data Types](https://docs.google.com/presentation/d/1lmAKCo4QR-s9maFcgxjJX5b765MhIn2FLPQ_Mk0cj1s/edit?usp=sharing)

Methods di bahasa pemrograman Java merupakan block code yang akan berjalan hanya ketika dipanggil. Dalam methods terdapat parameter yang dapat digunakan untuk menyisipkan argumen saat pemanggilan method. Selain method, block code di Java dapat pula berupa control flow statement yang terdiri atas decision making statement (`if`, `else if`, `else` dan `switch`), looping statement (`for`, `while`, `do while`) dan branching (`break`, `continue`, `return`).

```java
public class MainClass {

    // method with a parameter
    static void Halo(String x) {
        System.out.println("Hello " + x + "!");
    }

    // method with multiple parameter
    static void Jumlah(int x, int y){
        System.out.println(x + y);
    }

    // return method
    static int ReturnLima(){
        return 5; 
    }

    public static void main(String[] args){
        Halo("Andi");
        Jumlah(20, 10);
        System.out.println(ReturnLima());

        // if statement
        int nilai = 90;
        if (nilai > 80){
            System.out.println("ANDA LULUS!");
        } else {
            System.out.println("ANDA TIDAK LULUS!");
        }

        // else if statement
        int x = 6;
        if (x > 7){
            System.out.println("NILAI X TINGGI");
        } else if (x < 5){
            System.out.println("NILAI X RENDAH");
        } else {
            System.out.println("NILAI X MEDIUM");
        }
        
        // for loop increment
        for(int i = 0; i < 100; i++){
            System.out.println(i);
        }

        // for loop decrement
        for(int i = 100; i > 0; i--){
            System.out.println(i);
        }

        // for loop in array
        String[] nama = {"Andi", "Budi", "Caca"};
        for (int i = 0; i < nama.length; i++){
            System.out.println(nama[i]);
        }

        // for loop in multidimensional array
        int[][] angka = { {1, 2, 3, 4},  {5, 6, 7, 8} };
        for (int i = 0; i < angka.length; i++){
            for (int j = 0; j < angka[i].length; j++){
                System.out.println(angka[i][j]);
            }
        }

    }
}
```

<hr>

#### 🍔 Lintang Wisesa

<br>

<a href="mailto: lintangwisesa@ymail.com">
  <img align="left" style="margin-right:10px" alt="lintang ymail" width="22px" src="https://camo.githubusercontent.com/b6e5ff081d7552ec05656de193794847e14d47ad/68747470733a2f2f732e79696d672e636f6d2f63762f61706976322f6d79632f6d61696c2f4d61696c5f694f535f6170705f69636f6e2e706e67" />
</a>

<a href="https://web.facebook.com/lintangbagus/">
  <img align="left" style="margin-right:10px" alt="lintang facebook" width="22px" src="https://camo.githubusercontent.com/a461898d72dd9f4c8c526dfcca9dfdc8a8c69605/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f636f6d6d6f6e732f7468756d622f352f35312f46616365626f6f6b5f665f6c6f676f5f253238323031392532392e7376672f3130323470782d46616365626f6f6b5f665f6c6f676f5f253238323031392532392e7376672e706e67" />
</a>

<a href="https://twitter.com/Lintang_Wisesa">
  <img style="margin-right:10px" align="left" alt="lintang twitter" width="24px" src="https://camo.githubusercontent.com/b6943877f3d8a1269974b9f820388403ee2b1978/68747470733a2f2f332e62702e626c6f6773706f742e636f6d2f2d4e786f754d6d7a32624f592f54385f61633937636573492f41414141414141414767302f65337659315f62646e62452f73313630302f547769747465722b6c6f676f2b323031322e706e67" />
</a>

<a href="https://www.youtube.com/user/lintangbagus">
  <img style="margin-right:10px" align="left" alt="lintang youtube" width="29px" src="https://www.pinclipart.com/picdir/big/55-557137_a-quiet-drifter-takes-a-janitorial-job-at.png" />
</a>

<a href="https://www.linkedin.com/in/lintangwisesa/">
  <img style="margin-right:10px" align="left" alt="lintang linkedin" width="24px" src="https://camo.githubusercontent.com/0d70d8c72e2f45755511d6799489dc49d0e325f0/68747470733a2f2f692e70696e696d672e636f6d2f6f726967696e616c732f63652f30392f33632f63653039336337323134616433353762623636356366643266363661386236622e706e67" />
</a>

<a href="https://github.com/LintangWisesa">
  <img style="margin-right:10px" align="left" alt="lintang github" width="23px" src="https://cdn-icons-png.flaticon.com/512/25/25231.png" />
</a>

<a href="https://www.hackster.io/lintangwisesa">
  <img style="margin-right:10px" align="left" alt="lintang hackster" width="23px" src="https://user-images.githubusercontent.com/10383395/49821324-358fa080-fda0-11e8-8b00-def2a67fc598.png" />
</a>

<a href="https://lintangwisesa.github.io/me/">
  <img style="margin-right:10px" align="left" alt="lintang bio" width="24px" src="https://avatars2.githubusercontent.com/u/30064213?s=460&u=6640a1c3d5c1892283e1c273006755de8d32fa59&v=4" />
</a>