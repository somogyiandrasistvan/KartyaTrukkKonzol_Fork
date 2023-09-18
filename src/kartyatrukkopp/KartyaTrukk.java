package kartyatrukkopp;

import java.util.Scanner;

public class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);

    public KartyaTrukk() {
        indit();
    }

    private void indit() {
        int oszlop = 0;
        melyik(oszlop);
    }

    private void melyik(int oszlop) {
        boolean jo;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        Pakli e = new Pakli();
        e.kever(oszlop);
    }
}
