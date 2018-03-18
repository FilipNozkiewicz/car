import java.util.Scanner;
import java.lang.Runtime;

public class Samochod {
    Scanner sc = new Scanner(System.in);
    private short wybor;

    public Skrzynia sk = new Skrzynia("bb", 0 , 0);

    public Silnik si = new Silnik("bb",0,0 );
    private String kolor;
    private int nrRejest;
    public String model;
    public   String marka;
    private  int Vmax;
    private  double Waga;
    private boolean isrunning;
    private boolean was_already_on = false;



    public boolean wlacz(){
        si.uruchom();
        this.si.is_running = true;
        this.isrunning = true;
        this.was_already_on = true;
        return true;
    };
    public boolean wylacz(){
        this.si.is_running = false;
        this.isrunning = false;
        si.zatrymaj();
        return false;
    };


    public Samochod(double waga, Skrzynia sk, Silnik si, String kolor, int nrRejest, String model, String marka, int vmax ) {
      //  this.sc = sc;
      //  this.wybor = wybor;
        this.sk = sk;
        this.si = si;
        this.kolor = kolor;
        this.nrRejest = nrRejest;
        this.model = model;
        this.marka = marka;
        this.Vmax = vmax;
        this.Waga = waga;
        this.isrunning = this.si.is_running;
    }
    public void set_is_running(){
        if(this.si.is_running == false) this.isrunning = false;
        else this.isrunning = true;
    }

    public double obliczWage(){
        return si.getWaga()+sk.getWaga()+this.Waga;
    };
    public int aktualna_predkosc(){
        if (this.isrunning == false) return 0;
        else if (this.was_already_on == true) return 0;
        else {
            int p = Vmax / 8;
            int identifier;
            int mmmax = si.max_obroty/8;
           if(si.obroty <= (int)mmmax+1) return p;
           else if (si.obroty <= (mmmax*2) && si.obroty > mmmax) return p*2;
           else if (si.obroty <= (mmmax*3) && si.obroty > mmmax*2) return p*2;
           else if (si.obroty <= (mmmax*4) && si.obroty > mmmax*3) return p*2;
           else if (si.obroty <= (mmmax*5) && si.obroty > mmmax*4) return p*2;
           else if (si.obroty <= (mmmax*6) && si.obroty > mmmax*5) return p*2;
           else if (si.obroty <= (mmmax*7) && si.obroty > mmmax*6) return p*2;
           else if (si.obroty <= (mmmax*8) && si.obroty > mmmax*7) return p*2;
           else return Vmax;
         //   return p * sk.aktualny_bieg;
        }
    };



    public Samochod(Skrzynia sk, String kolor, int nrRejest, String model, String marka, int vmax) {
        this.sk = sk;
        this.kolor = kolor;
        this.nrRejest = nrRejest;
        this.model = model;
        this.marka = marka;
        Vmax = vmax;
    }

    public Samochod(Skrzynia sk,  Silnik si, String kolor, int nrRejest, String model, String marka, int vmax) {
        this.sk = sk;

        this.si = si;
        this.kolor = kolor;
        this.nrRejest = nrRejest;
        this.model = model;
        this.marka = marka;
        Vmax = vmax;
    }
    public void Clear_Console(){ for (int i = 0; i < 100; ++i) System.out.println();}

    public String getMarka() {
        return marka;
    }


    public String getModel() {
        return model;
    }

    public Scanner getSc() {
        return sc;
    }

    public short getWybor() {
        return wybor;
    }

    public Skrzynia getSk() {
        return sk;
    }

    public Silnik getSi() {
        return si;
    }

    public String getKolor() {
        return kolor;
    }

    public int getNrRejest() {
        return nrRejest;
    }

    public int getVmax() {
        return Vmax;
    }

    public boolean isIsrunning() {
        return isrunning;
    }

}
