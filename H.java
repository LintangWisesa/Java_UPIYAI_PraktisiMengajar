public class H {
    public static void main(String[] args){
        // for loop
        // for (initial value iterator, kondisi (selama true: loop run), execute after nth iteration)
        for(int i = 0; i < 100; i++){
            System.out.println(i);
        }

        for(int i = 100; i > 0; i--){
            System.out.println(i);
        }

        String[] nama = {"Andi", "Budi", "Caca"};
        for (int i = 0; i < nama.length; i++){
            System.out.println(nama[i]);
        }

        int[][] angka = { {1, 2, 3, 4},  {5, 6, 7, 8} };
        for (int i = 0; i < angka.length; i++){
            for (int j = 0; j < angka[i].length; j++){
                System.out.println(angka[i][j]);
            }
        }
    }
}

// i = 0   i<100? true     print(0)    i++ => i=0+1
// i = 1   i<100? true     print(1)    i++ => i=1+1
// ...
// i = 100 i<100? false    done.