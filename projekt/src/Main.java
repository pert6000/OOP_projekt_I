import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        failistLugemine();
    }
    public static void failistLugemine() {
        System.out.println("Sisesta failitee: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String failitee = scanner.nextLine();
        scanner.close();

        List<Double> arvud = new ArrayList<>(); // List kuhu arvud loetakse failist

        try {
            File fail = new File(failitee);
            Scanner failiScanner = new Scanner(fail);

            // Loeb arvud failist ja lisab listi
            while (failiScanner.hasNextLine()) {
                String rida = failiScanner.nextLine();
                try {
                    double arv = Double.parseDouble(rida); // teeb rea double väärtuseks
                    arvud.add(arv); // Lisab arvu listi
                } catch (NumberFormatException e) {
                    System.out.println("Ignoreerin rida " + rida);
                }
            }
            failiScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ei leia faili");
        }

        // Arvutame failist saadud arvudega
        if (!arvud.isEmpty()) {
            // Muudab listi massiiviks
            double[] arvudeMassiiv = new double[arvud.size()];
            for (int i = 0; i < arvud.size(); i++) {
                arvudeMassiiv[i] = arvud.get(i);
            }

            // Teeb arvutused massiivi abil
            max s = new max(arvudeMassiiv);
            min m = new min(arvudeMassiiv);
            vahemik v = new vahemik(arvudeMassiiv);
            summa sum = new summa(arvudeMassiiv);
            kogus k = new kogus(arvudeMassiiv);
            kurtosis kurt = new kurtosis(arvudeMassiiv);
            mediaan med = new mediaan(arvudeMassiiv);
            asümmeetrijakordaja asüm = new asümmeetrijakordaja(arvudeMassiiv);
            standardviga stanV = new standardviga(arvudeMassiiv);
            mood mo = new mood(arvudeMassiiv);
            dispersioon dis = new dispersioon(arvudeMassiiv);

            // Prindib tulemused
            System.out.println("Dispersioon: " + dis.getVäärtus());
            System.out.println("Mood: " + mo.getVäärtus());
            System.out.println("Standardviga: " + stanV.getVäärtus());
            System.out.println("Asümmeetrijakordaja: " + asüm.getVäärtus());
            System.out.println("Max: " + s.getVäärtus());
            System.out.println("Min: " + m.getVäärtus());
            System.out.println("Vahemik: " + v.getVäärtus());
            System.out.println("Summa: " + sum.getVäärtus());
            System.out.println("Kogus: " + k.getVäärtus());
            System.out.println("Kurtosis: " + kurt.getVäärtus());
            System.out.println("Mediaan: " + med.getVäärtus());
        } else {
            System.out.println("Failist ei leitud sobivaid arve arvutamiseks.");
        }
    }
}