package se;

import static se.Form.roundAvoid;

public class Main {
    public static void main(String[] args) {
        double Xi[] = {-3, -2, -1, 0, 1, 2};
        double Yi[] = {-1.4, -4.3, -5.20, -4.1, -1.1, 4.2};
//        double Xi[] = {0, 2, 4, 6, 8, 10};
//        double Yi[] = {5, -1, 0.5, 1.5, 4.5, 8.5};

        double abLine[][] = new double[2][2];
        Form.formTable(Xi, Yi);
        abLine[0][0]=Form.sumX2;
        abLine[0][1]= abLine[1][0]= Form.sumX;
        abLine[1][1]=Xi.length;

        double ansverLine[] = new double[2];
        ansverLine[0] = Form.sumXY;
        ansverLine[1] = Form.sumY;

        double [] ansverLineFinal = Matrix.getResult(abLine,ansverLine);
        System.out.println("y= " + roundAvoid(ansverLineFinal[0],4) + "x + " +roundAvoid(ansverLineFinal[1],4));
        Test.proofLine(Xi,Yi,roundAvoid(ansverLineFinal[0],4), roundAvoid(ansverLineFinal[1],4));

        double abHiper[][] = new double[2][2];
        abHiper[0][0]=Form.sum1divX2;
        abHiper[0][1]= abHiper[1][0]= Form.sum1divX;
        abHiper[1][1]=Xi.length;

        double ansverHiper[] = new double[2];
        ansverHiper[0] = Form.sumYdivX;
        ansverHiper[1] = Form.sumY;

        double [] ansverHiperbFinal = Matrix.getResult(abHiper,ansverHiper);
        System.out.println("y= " + roundAvoid(ansverHiperbFinal[0],4) + "/x + " +roundAvoid(ansverHiperbFinal[1],4));
        Test.proofHiperb(Xi,Yi,roundAvoid(ansverHiperbFinal[0],4), roundAvoid(ansverHiperbFinal[1],4));

        double abParab[][] = new double[3][3];
        Form.formTableParabola(Xi, Yi);
        abParab[0][0]=Form.sumX4;
        abParab[0][1] =abParab[1][0] = Form.sumX3;
        abParab[0][2] = abParab[2][0] = abParab[1][1] =Form.sumX2;
        abParab[1][2] = abParab[2][1] = Form.sumX;
        abParab[2][2] = Xi.length;

        double ansverParab[] = new double[3];
        ansverParab[0] = Form.sumX2Y;
        ansverParab[1] = Form.sumXY;
        ansverParab[2] = Form.sumY;


        double [] ansverParabFinal = Matrix.getResult(abParab,ansverParab);
        System.out.println("y= " +roundAvoid(ansverParabFinal[0],4) + "x^2 + " +roundAvoid(ansverParabFinal[1],4)+
                "x + " +roundAvoid(ansverParabFinal[2],4));
        Test.proofParab(Xi,Yi,roundAvoid(ansverParabFinal[0],4), roundAvoid(ansverParabFinal[1],4), roundAvoid(ansverParabFinal[2],4));
    }
}
