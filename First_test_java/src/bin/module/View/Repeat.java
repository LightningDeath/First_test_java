package bin.module.View;

import bin.module.Interface.i_View.i_Repeat;

import java.util.Scanner;

public class Repeat implements i_Repeat {
    @Override
    public int repeat() {
        int c;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                1 - да;
                2 - выйти.
                """);
        System.out.print("--> ");
        try {
            c = in.nextInt();
        } catch (Exception e){
            System.out.println("\nВведен не корректный параметр! Попробуйте снова.");
            return repeat();
        }
        if (!(c >= 1 && c <= 2)){
            System.out.println("\nВведен не верный параметр! Попробуйте снова.");
            return repeat();
        }
        return c;
    }
}
