public class FirstLabArrays {
    public static double elementOfArray(int e1, double x1) {
        if (e1 == 3) {
            return Math.cos(Math.exp(Math.exp(x1)));
            // cos(e**(e**x))
        } else if (e1 == 9 || e1 == 11 || e1 == 13 || e1 == 17) {
            return Math.exp(Math.atan(Math.cos(x1)));
            // e**arctan(cos(x))
        } else {
            double y = (3.0 / 4.0) - Math.tan(Math.cbrt(Math.exp(x1)));
            return Math.pow((1.0 / 3.0) * y, 3);
            // 1.0, 3.0, и т.д., чтоб не делить double на целые числа
        }
    }

    public static void matrix(double[][] h) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%6.2f ", h[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int e[] = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        double x[] = {-7.3, 1.4, -12.8, -0.5, -3.9, 0.2, -14.1, -6.7, 1.9, -9.4, -2.1, -11.6, -4.8, 0.8, -13.5, -8.2, 1.1, -5.3, -10.7};
        double h[][] = new double[9][19];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 19; j++) {
                h[i][j] = elementOfArray(e[i], x[j]);
            }

        }
        System.out.println("Полученный массив: ");
        matrix(h);
    }

}


