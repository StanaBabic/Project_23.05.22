package bootcamp;

/*
Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost) i
poeni se mogu menjati kroz adekvatnu metodu. Alpinista može da savlada sve uspone do 4000 metara,
placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
    Alpinista, id: id
    ime: ime i prezime
    Broj poena: poeni
*/
public class Alpinista extends Planinar {

    private int brojPoena;

    public Alpinista() {
    }

    public Alpinista(String id, String imePlaninara, String prezimePlaninara, int brojPoena) {
        super(id, imePlaninara, prezimePlaninara);
        this.brojPoena = brojPoena;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + getId() + "\n" +
                "ime: " + getImePlaninara() + " " + getPrezimePlaninara() + "\nBroj poena: " + brojPoena);
    }

    @Override
    public double clanarina() {
        int clanarina = 1500 - (brojPoena * 50);
        if (clanarina > 0)
            return clanarina;
        else
            return 0;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        return planina.getVisinaPlanine() <= 4000;
    }
}
