package school.mjc.stage0.conditions.finalTask;

import javax.swing.*;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(dividend != 0 && divider != 0) {
            int division = dividend / divider;
            if(divider * division == dividend) {
                System.out.println("can be divided completely");
            } else
                System.out.println("cannot be divided completely");
        } else
            System.out.println("division by zero");
    }
}

