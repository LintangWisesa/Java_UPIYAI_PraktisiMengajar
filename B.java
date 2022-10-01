public class B {
    public static void main(String[] args){
        // primitive data type
        boolean isGraduated = true;    
        // 1 bit = _ = minimal 0 = biner 0 = desimal 0 x 2^0 = 0
        //             maximal 1 = biner 1 = desimal 1 x 2^0 = 1
        System.out.println(isGraduated);

        byte x = -120;
        // range byte = -128 s/d 127
        // 1 byte = 8 bit _ _ _ _ _ _ _ _
        // minimal = biner 00000000 = desimal 0x2^0 + 0x2^1 + ... + 0x2^7 = 0
        // maximal = biner 11111111 = desimal 1x2^0 + 1x2^1 + ... + 1x2^7 =
        //                                    1 + 2 + 4 + 8 + 16 + 32 + 64 + 128 =
        //                                    127 + 128 = 255
        //                                    range : -128 => 0 => 127
        System.out.println(x);

        // bilangan desimal
        double y = 12.5d;
        float z = 13.56f;
        System.out.println(y);
        System.out.println(z);

        // char
        // value = 1 karakter alphabet | hex unicode | ascii code
        // ascii = american standard code for information interchange
        char a = 'a';
        char hexcode = '\u0061';
        char ascii = 97;
        System.out.println(a);
        System.out.println(hexcode);
        System.out.println(ascii);
    }
}