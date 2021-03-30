package se;

public class Form {
    public static double sumX2;
    public static double sumXY;
    public static double sumX;
    public static double sumY;
    public static double sumX3;
    public static double sumX4;
    public static double sumX2Y;

    public static double sum1divX;
    public static double sum1divX2;
    public static double sumYdivX;

    public static void formTable
            (double Xi[], double Yi[]) {
        for (int i = 0; i < Xi.length; i++) {
            sumX2 += Xi[i] * Xi[i];
            sumX += Xi[i];
            sumY += Yi[i];
            sumXY += Xi[i] * Yi[i];
            if (Xi[i] != 0) {
                sum1divX += 1 / Xi[i];
                sum1divX2 += 1 / (Xi[i] * Xi[i]);
                sumYdivX += Yi[i] / Xi[i];
            }
        }
    }

    public static void formTableParabola
            (double Xi[], double Yi[]) {
        for (int i = 0; i < Xi.length; i++) {
            sumX3 += Xi[i] * Xi[i] * Xi[i];
            sumX4 += Xi[i] * Xi[i] * Xi[i] * Xi[i];
            sumX2Y += Xi[i] * Xi[i] * Yi[i];
        }
    }


    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}

