public class D {
    public static void main(String[] args){
        
        String student1 = "Andi";
        String student2 = "Budi";
        // best practice: Array
        String[] students = {"Andi", "Budi", "Caca"};
        System.out.println(students);
        // [Ljava.lang.String;@15db9742
        // [ : array
        // Ljava.lang.String : valuenya class Ljava.lang.String
        // 15db9742 : memory address
        System.out.println(students.length);    // 3
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        // students[2] = 12;
        // System.out.println(students[2]);

        int[] angka = {1, 2, 3, 4, 5};
        System.out.println(angka[0]);
        angka[0] = 99;
        System.out.println(angka[0]);

        // multidimensional array
        // 2D
        int[][] numbers = { {1, 2}, {3, 4} };
        System.out.println(numbers);
        // [[I@6d06d69c
        // [[ = array 2d
        // I = integer
        // 6d06d69c = memory address
        System.out.println(numbers[0]); // [I@7852e922
        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);
        System.out.println(numbers[1][0]);
        System.out.println(numbers[1][1]);

        String[][] names = { {"Ali", "Budi"}, {"Cici", "Deni"}, {"Euis", "Fina"} };
        System.out.println(names[0][1]);
        // Budi
        System.out.println(names[1][1]);
        // Deni
        System.out.println(names[2][1]);
        // Fina
    }
}