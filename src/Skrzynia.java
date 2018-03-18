public class Skrzynia extends Komponent {

    protected int aktualny_bieg;
    protected int ilosc_biegow;
    private int aktualne_prelozenie;
    private String id;
    public Sprzeglo sp= new Sprzeglo("bb" , 0 , 0 , true);

    public int zmienBieg(int nr_Biegu){
        if(nr_Biegu <= ilosc_biegow )
            return this.aktualny_bieg = nr_Biegu;
        else  return this.aktualny_bieg;
    };
    public int oblicz_Przelozenie(){
        return this.aktualne_prelozenie;
    };


    public Skrzynia(String nazwa, double waga, double cena, int aktualny_bieg, int ilosc_biegow, int aktualne_prelozenie) {
        super(nazwa, waga, cena);
        this.aktualny_bieg = aktualny_bieg;
        this.ilosc_biegow = ilosc_biegow;
        this.aktualne_prelozenie = aktualne_prelozenie;
    }

    public Skrzynia(String nazwa, double waga, double cena) {
        super(nazwa, waga, cena);
    }

    public Skrzynia(String nazwa, double waga, double cena, int aktualny_bieg, int ilosc_biegow, int aktualne_prelozenie, Sprzeglo sp) {
        super(nazwa, waga, cena);
        this.aktualny_bieg = aktualny_bieg;
        this.ilosc_biegow = ilosc_biegow;
        this.aktualne_prelozenie = aktualne_prelozenie;
        this.sp = sp;
    }

    public Skrzynia(String id,String nazwa, double waga, double cena, int aktualny_bieg, int ilosc_biegow, int aktualne_prelozenie,  Sprzeglo sp) {
        super(nazwa, waga, cena);
        this.aktualny_bieg = aktualny_bieg;
        this.ilosc_biegow = ilosc_biegow;
        this.aktualne_prelozenie = aktualne_prelozenie;
        this.id = id;
        this.sp = sp;
    }

    public int getAktualny_bieg() {
        return aktualny_bieg;
    }

    public int getIlosc_biegow() {
        return ilosc_biegow;
    }

    public int getAktualne_prelozenie() {
        return aktualne_prelozenie;
    }

    public String getId() {
        return id;
    }

    public Sprzeglo getSp() {
        return sp;
    }

    public void setAktualny_bieg(int aktualny_bieg) {
        this.aktualny_bieg = aktualny_bieg;
    }

    public void setIlosc_biegow(int ilosc_biegow) {
        this.ilosc_biegow = ilosc_biegow;
    }

    public void setAktualne_prelozenie(int aktualne_prelozenie) {
        this.aktualne_prelozenie = aktualne_prelozenie;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSp(Sprzeglo sp) {
        this.sp = sp;
    }

    public double getWaga() {
        return sp.getWaga()+ this.waga;
    }
}
