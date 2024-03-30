import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        double[] test = {2.4, 5, 6, 1, 19}; // massiiv meetodite testimiseks
        max s = new max(test);
        min m = new min(test);
        vahemik v = new vahemik(test);
        summa sum = new summa(test);
        kogus k = new kogus(test);

        kurtosis kurt = new kurtosis(test);

        System.out.println(s.getVäärtus());
        System.out.println(m.getVäärtus());
        System.out.println(v.getVäärtus());
        System.out.println(sum.getVäärtus());
        System.out.println(k.getVäärtus());

        System.out.println(kurt.getVäärtus());

    }
}