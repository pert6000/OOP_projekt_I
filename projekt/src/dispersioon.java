public class dispersioon extends statistilineNäitaja{
    private double väärtus;
    public dispersioon(double[] a) {
        super(a);
    }
    public double arvuta(double[] a ){
        keskmine avg = new keskmine(a);
        kogus k = new kogus(a);

        double keskmine = avg.getVäärtus();
        double kogus = k.getVäärtus();

        // Arvutab vahemike summa keskmise
        double vaheKesk = 0;
        for (double number : a) {
            vaheKesk += Math.pow(number - keskmine, 2);
        }

        // Arvutab ja tagastab dispersiooni
        return vaheKesk / (kogus - 1);
    }
    public String selgita() {
        return "Andmete dispersioon on " + väärtus;
    }
}
