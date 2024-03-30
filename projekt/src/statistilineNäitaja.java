public abstract class statistilineNäitaja {
    private double väärtus;

    public statistilineNäitaja(double[] a) {
        this.väärtus = arvuta(a);
    }

    public abstract double arvuta(double[] a);

    public abstract String selgita();

    public double getVäärtus() {
        return väärtus;
    }

}
