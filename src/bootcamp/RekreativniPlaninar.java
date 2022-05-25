package bootcamp;

/*
Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
    - težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
    - naziv okruga odakle je rekreativni planinar
    - maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
    - da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
      s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
    - rekeativci placaju clanarinu u iznosu od 1000 rsd
    - metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
        Rekreativac, id: id
        ime: ime prezime Okrug: okrug
*/

public class RekreativniPlaninar extends Planinar {

    private int tezinaOpreme;
    private String nazivOkruga;
    private int maksimalniUspon;
    private static final int clanarina = 1000; // Clanarina je ista za sve i necemo dozvoliti promenu

    public RekreativniPlaninar() {
    }

    public RekreativniPlaninar(String id, String imePlaninara, String prezimePlaninara, int tezinaOpreme, String nazivOkruga, int maksimalniUspon) {
        super(id, imePlaninara, prezimePlaninara);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalniUspon = maksimalniUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + getId() + "\n" +
                "ime: " + getImePlaninara() + " " + getPrezimePlaninara() + " Okrug: " + nazivOkruga);
    }

    @Override
    public double clanarina() {
        return clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        return (maksimalniUspon - (tezinaOpreme * 50)) > planina.getVisinaPlanine();
    }
}
