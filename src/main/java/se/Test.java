package se;

import static se.Form.roundAvoid;

public class Test {
    public static void proofLine(double Xi[], double Yi[], double a, double b) {
        double answer = 0;
        for (int i = 0; i < Xi.length; i++) {
            answer += Math.pow(a * Xi[i] + b - Yi[i],2);
        }
        System.out.println("погрешность перовой функции = " + roundAvoid(answer,1));
    }

    public static void proofParab(double Xi[], double Yi[], double a, double b, double c) {
        double answer = 0;
        for (int i = 0; i < Xi.length; i++) {
            answer += Math.pow(a * Xi[i]* Xi[i] + b * Xi[i] + c - Yi[i],2);
        }
        System.out.println("погрешность второй функции = " + roundAvoid(answer,1));
    }

    public static void proofHiperb(double Xi[], double Yi[], double a, double b) {
        double answer = 0;
        for (int i = 0; i < Xi.length; i++) {
            if(Xi[i] != 0)
                answer += Math.pow(a / Xi[i] + b - Yi[i],2);
        }
        System.out.println("погрешность третьей функции = " + roundAvoid(answer,1));
    }




}
