import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        double[] test = {2.4,5,6,1,19}; // massiiv meetodite testimiseks
        max s = new max(test);
        min m = new min(test);
        vahemik v = new vahemik(test);

        System.out.println(s.getVäärtus());
        System.out.println(m.getVäärtus());
        System.out.println(v.getVäärtus());

    }
}