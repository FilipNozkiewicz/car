public class Sprzeglo extends Komponent {

    private boolean Stan_sprzegla;

    private String id;
    public boolean zalacz(boolean z){
        return this.Stan_sprzegla = true;
    };
    public boolean rozlacz(boolean z){
        return this.Stan_sprzegla = false;
    };


    public Sprzeglo(String nazwa, double waga, double cena, boolean stan_sprzegla) {
        super(nazwa, waga, cena);
        Stan_sprzegla = stan_sprzegla;
    }

    public Sprzeglo(String id , String nazwa, double waga, double cena, boolean stan_sprzegla) {
        super(nazwa, waga, cena);
        Stan_sprzegla = stan_sprzegla;
        this.id = id;
    }

    public boolean isStan_sprzegla() {
        return Stan_sprzegla;
    }

    public String getId() {
        return id;
    }

    public void setStan_sprzegla(boolean stan_sprzegla) {
        Stan_sprzegla = stan_sprzegla;
    }

    public void setId(String id) {
        this.id = id;
    }
}
