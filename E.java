public class E {
    public static void main(String[] args){
        // 1. Arithmetic operators
        double x = 10.0d;
        double y = 4.0d;
        System.out.println(x + y);  // add
        System.out.println(x - y);  // reduce
        System.out.println(x * y);  // kali
        System.out.println(x / y);  // bagi
        System.out.println(x % y);  // modulus (sisa bagi)

        // 2. Assignment Operator
        // increment by 1
        x++;    // x = x + 1 
        x++;
        System.out.println(x);
        // decrement by 1
        x--;    // x = x - 1 
        x--;
        System.out.println(x);

        x += 3;     // x = x + 3
        System.out.println(x);      // 13
        x *= 2;     // x = 13 * 2 = 26
        x /= 13;    // x = 26 / 13 = 2
        x -= 4;     // x = 2 - 4 = -2
        System.out.println(x); // -2
        
        int a = 100;
        a %= 2;     // a = a % 2 = 100 % 2 = 0
        System.out.println(a);

        // 3. Comparison operator
        int b = 2;
        int c = 3;
        System.out.println(b == c); // sama dengan
        System.out.println(b != c); // tidak sama dengan
        System.out.println(b > c);  // lebih dari
        System.out.println(b < c);  // kurang dari
        System.out.println(b >= c); // lebih dari atau sama dengan
        System.out.println(b <= c); // kurang dari atau sama dengan

        // 4. logical operator: AND, OR & NEGASI
        int g = 9;
        int h = 6;
        System.out.println(g < h && h > g); // operator AND &&
        // true && true => true
        // true && false => false  vv
        // false && false => false

        System.out.println(g < h || h > g); // operator OR ||
        // true || true => true
        // true || false => true   vv
        // false || false => false

        System.out.println(!(true));
        System.out.println(!(6 > 12));

        System.out.println(!(10 <= 10 && 9 >= 9));

    }
}