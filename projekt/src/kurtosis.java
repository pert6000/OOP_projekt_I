public class kurtosis extends statistilineNäitaja {

    private double väärtus;

    public kurtosis(double[] a) {
        super(a);
    }

    public double arvuta(double[] a) {
        keskmine avg = new keskmine(a);
        standardhälve s = new standardhälve(a);
        kogus k = new kogus(a);
        double n = k.getVäärtus();

        double tulem1 = 0;
        double tulem2 = 0;

        double kurt;

        for (double el : a) {
            tulem1 += Math.pow((el - avg.getVäärtus()) / s.getVäärtus(), 4);
            tulem2 += Math.pow((el - avg.getVäärtus()) / s.getVäärtus(), 2);

        }

        kurt = n * tulem1/tulem2;

        //kurt = (n * (n + 1) / ((n - 1) * (n - 2) * (n - 3))) * tulem - (3 * Math.pow(n - 1, 2)) / ((n - 2) * (n - 3));

        return kurt;
    }


    public String selgita() {
        return "";
    }
}
