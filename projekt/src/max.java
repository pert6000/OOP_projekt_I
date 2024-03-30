public class max implements statistilineNäitaja{
    double väärtus;


    public max(double[] a) {
        this.väärtus = arvuta(a);
    }

    public double arvuta(double[] a) {
        double suurim = Integer.MIN_VALUE;

        for(double el: a){
            if (el > suurim)
                suurim = el;

        }
        return suurim;
    }

    public String selgita() {
        return "Andmete maksimaalne väärtus on " + väärtus;
    }
}
