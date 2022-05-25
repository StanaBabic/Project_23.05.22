package bootcamp;

import java.util.ArrayList;

/*
Kreirati glavnu klasu I u njoj:
    - instancirati jednu planinu
    - napraviti niz ili listu koji ce sadrzati najmanje tri rekrativna planinara I tri alpiniste
    - ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti na instanciranu planin
    - ispisati kolika je zbir svih clanarina planinara iz niza/liste
*/
public class Main {

    public static void main(String[] args) {

        Planina planina = new Planina("Kopaonik", "Srbija", 1500);

        ArrayList<Planinar> planinari = new ArrayList<>();
        planinari.add(new RekreativniPlaninar("123", "Marko", "Markovic",
                19, "Uzice", 3500));
        planinari.add(new RekreativniPlaninar("124", "Petar", "Petrovic",
                20, "Novi Sad", 2250));
        planinari.add(new RekreativniPlaninar("125", "Milan", "Milosevic",
                18, "Nis", 4500));

        planinari.add(new Alpinista("126", "Ivan", "Jovanovic",
                45));
        planinari.add(new Alpinista("127", "Marija", "Ilic",
                41));
        planinari.add(new Alpinista("128", "Ivan", "Markovic",
                14));

        int ukupnaClanarina = 0;
        for (Planinar planinar : planinari) {
            planinar.stampaj();
            if (planinar.uspesanUspon(planina)) {
                System.out.println("Uspsan uspon!");
            } else {
                System.out.println("Neuspesan uspon!");
            }
            ukupnaClanarina += planinar.clanarina();
        }

        System.out.println(ukupnaClanarina);
    }
}
