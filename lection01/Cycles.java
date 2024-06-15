package lection01;

public class Cycles {
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        //     if (i % 2 != 0) {
        //         // continue;
        //         break;
        //     }
        //     System.out.println(i);
        // }

        for (int i = 0; i < 10; i++) {
            for(int j = 0; j < 5; j++) {
                break;
            }
            break;
        }
    }
}
