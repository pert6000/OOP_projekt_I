import java.util.Arrays;

public class asümmeetrijakordaja extends statistilineNäitaja{
    private double väärtus;
    public asümmeetrijakordaja(double[] a) {
        super(a);
    }
    public double arvuta(double[] a ){
        hälve h = new hälve(a);
        keskmine avg = new keskmine(a);
        kogus k = new kogus(a);

        double keskmine = avg.getVäärtus();
        double kogus = k.getVäärtus();
        double hälve = h.getVäärtus();

        return (kogus * (keskmine - 3)) / (hälve * Math.sqrt(kogus - 1));
    }
    public String selgita() {
        return "Andmete asümmeetriline kordaja on " + this.getVäärtus();
    }
}