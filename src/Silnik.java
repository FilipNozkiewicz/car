public class Silnik extends Komponent {

    protected int max_obroty;
    public int obroty;
    protected boolean is_running;
    private String id;

    public boolean uruchom(){
        return  this.is_running = true;
    }
    public boolean zatrymaj(){
        this.obroty = 0;
        return this.is_running = false;
    }
    public int zwieksz_obroty(int obroty_1){

        if (this.obroty + obroty_1 >= this.max_obroty) {
            this.obroty = this.max_obroty;
            this.is_running = true;
            return this.max_obroty;
        }
        else {
         //   this.obroty += obroty_1;
            if(this.obroty > 0)
                this.is_running = true;
            return this.obroty += obroty_1;
        }


    }
    public int zmniejsz_obroty(int obroty_1){
        if( this.obroty - obroty_1 <= 0) {
            this.is_running = false;
            return this.obroty = 0;
        }


        else
            return this.obroty -= obroty_1;

    };

    public Silnik(String nazwa, double waga, double cena, int max_obroty, int obroty) {
        super(nazwa, waga, cena);
        this.max_obroty = max_obroty;
        this.obroty = obroty;
        if (this.obroty == 0)
            is_running = false;
        else this.is_running = true;
    }

    public Silnik(String nazwa, double waga, double cena) {

        super(nazwa, waga, cena);
        if (this.obroty == 0)
            is_running = false;
        else this.is_running = true;
    }

    public Silnik(String nazwa, double waga, double cena, int max_obroty, int obroty, boolean is_running) {
        super(nazwa, waga, cena);
        this.max_obroty = max_obroty;
        this.obroty = obroty;
        this.is_running = is_running;
        if (this.obroty == 0)
            is_running = false;
        else this.is_running = true;
    }
    public Silnik(String id , String nazwa, double waga, double cena, int max_obroty, int obroty, boolean is_running) {
        super(nazwa, waga, cena);
        this.max_obroty = max_obroty;
        this.obroty = obroty;
        this.id = id;
        this.is_running = is_running;
        if (this.obroty == 0)
            is_running = false;
        else this.is_running = true;
    }

    public String getId() {
        return id;
    }
}
