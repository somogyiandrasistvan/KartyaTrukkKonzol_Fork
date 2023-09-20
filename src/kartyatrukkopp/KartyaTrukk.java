package kartyatrukkopp;

import java.util.Scanner;

public class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);
    private Pakli pakli;

    public KartyaTrukk() {
        int oszlop = 0;
        this.pakli = new Pakli();
        for (int i = 0; i < 3; i++) {
            this.pakli.kirak();
            melyik(oszlop);
        }
        this.pakli.ezVolt();
    }

    public static void main(String[] args) {
        new KartyaTrukk();
    }

    private void melyik(int oszlop) {
        boolean jo;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        this.pakli.kever(oszlop);
    }
}
