package Java_full.lection01;

/**
 * Lection
 */
public class Lection {

    public static void main(String[] args) {
        // System.out.println("bye world!");
        // String s = null;  // всегда нужно определить значение!

        // Целые int числа
        // short age = 10;
        // int salary = 123456;
        // System.out.println(age);
        // System.out.println(salary);

        // Вещественные типы double/float
        // float e = 2.7f;
        // double pi = 3.1415;
        // System.out.println(e);
        // System.out.println(pi);

        // Тип данных char
        // char ch = '{';
        // System.out.println(ch);

        // Тип данных boolean
        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1); // true
        // boolean flag2 = 123 >= 234 || flag1;
        // System.out.println(flag2);
        // boolean flag3 = flag1 ^ flag2;
        // System.out.println(flag3); // false

        // boolean f = true && false;
        // System.out.println(f);

        // Строки string
        // String msg = "Hello world!";
        // System.out.println(msg); // Hello world!

        // Неявная типизация
    //     var a = 123;
    //     System.out.println(a);
    //     var d = 123.456;
    //     System.out.println(d);
    //     System.out.println(getType(a));
    //     System.out.println(getType(d));
    //     d = 1022;
    //     System.out.println(d);
    // }
    // static String getType(Object o){
    //     return o.getClass().getSimpleName();
    // }

    // классы обертки
    // int i = 123_232_2;
    // System.out.println(i);

    // String s = "qwer";
    // s.CharAt(1)
    // }

    // Побитовые операции
    // int a = 18;
    // // 10010
    // System.out.println(a >> 1);
    // // 1001
    // }

    // int a = 5;
    // int b = 2;
    // System.out.println(a | b);
    // 101
    // 010
    // 111 итог (число 7)

    // int a = 5;
    // int b = 2;
    // System.out.println(a | b);

    // int a = 5;
    // int b = 2;
    // System.out.println(a ^ b);
    
    // boolean a = true;
    // boolean b = true;
    // System.out.println(a & b);
    // System.out.println(a && b);

    // String s = "qww1"; // 4, 0 .. 3
    // // boolean b = s.length() >= 5 && s.charAt(4) == '1';
    // boolean b = s.length() >= 5 & s.charAt(4) == '1';
    // System.out.println(b);

    // String s = "qww1"; // 4, 0 .. 3
    // boolean b = s.length() >= 5 && s.charAt(4) == '1';
    // //boolean b = s.length() >= 5 | s.charAt(4) == '1';
    // System.out.println(b);
    }
}