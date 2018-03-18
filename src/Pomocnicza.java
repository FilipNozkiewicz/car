import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Pomocnicza {

    private JPanel panel1;
    private JButton WlWylSil;
    private JFormattedTextField Zwk;
    private JButton WykZwk;
    private JFormattedTextField ZmnObroty;
    private JButton WykZmn;
    private JButton WagaSilnika;
    private JTextField ModelSilnika;
    private JFormattedTextField WpiszBieg;
    private JButton WykZmBiegu;
    private JButton AktBieg;
    private JButton IloscBiegowSkrz;
    private JButton WagaSkrzyni;
    private JTextField ModelSkrzyni;
    private JTextField ModelSprzegla;
    private JButton WagaSprzegla;
    private JButton NacSpusc;
    private JButton Stan;
    private JTextField ModelSam;
    private JButton Vmax;
    private JButton WagaSam;
    private JButton AktPredk;
    private JButton Wyglad;
    private JButton UrWyl;
    private JTextField zwk;
    private JTextField zm;
    private JTextField zmb;
    private JTextField Modsildisp;
    JTextField wagadisp;
    private JTextField obrotydisp;
    private JTextField obrotydisp2;
    private JTextField modelskdisp;
    private JPasswordField wagaskdisp;
    private JTextField iloscbiegow;
    private JTextField aktbieg;
    private JTextField modelsprzeglodisp;
    private JPasswordField wagasprzegla;
    private JTextField stansprzegla;
    private JTextField sammodeldisp;
    private JTextField vmaxdisp;
    private JTextField samaktdisp;
    private JTextField samwagadisp;
    private JButton modelsilnika;
    private JButton zmienButton;
    private JButton zmienButton1;
    private JButton pokMOdelButton;
    private JTextField mskdisp;
    private JButton zmienButton2;
    private JButton pokazMOdelButton;
    private JButton zmienButton3;
    private JTextField textField1;
    private JButton czyscButton;
    private JButton pokazButton;
    private JComboBox comboBox1;
    private JLabel Atrybuty;
    private JComboBox silnikbox;
    private JFormattedTextField p;
    private JPasswordField number;




    //********************************************************************************************************
    ///////////TWORZENIE OBIEKTOW//////////////////////////////////////////////////////////////////////////
    Sprzeglo sp1 = new Sprzeglo("sp1","sprzeglo1" , 4.4 , 7.8 , true);
    Sprzeglo sp2 = new Sprzeglo("sp2","sprzeglo2" , 6.4 , 7.8 , true);
    Sprzeglo sp3 = new Sprzeglo("sp3","sprzeglo3" , 7.4 , 7.8 , false);
    Sprzeglo sp4 = new Sprzeglo("sp4","sprzeglo4" , 8.4 , 7.8 , true);
    Skrzynia sk1 = new Skrzynia("sk1", "automatyczna" ,5.55 , 6.78 ,2,8,3,sp1);
    Skrzynia sk2 = new Skrzynia("sk2","manualna" ,7.55 , 6.78 ,2,8,3,sp1);
    Skrzynia sk3 = new Skrzynia("sk3","sportowa" ,9.55 , 6.78 ,2,8,3,sp1);
    Skrzynia sk4 = new Skrzynia("sk4","polautomatyczna" ,8.55 , 6.78 ,2,8,3,sp1);
    Silnik si1 = new Silnik("silnik_BMW","diesel" , 8.5 , 6.7 , 7000,2000,false);
    Silnik si2 = new Silnik("silnik_Ford","biturbo" , 11.5 , 6.7 , 7000,2000,false);
    Silnik si3 = new Silnik("silnik_Fiat","twinturbo" , 13.5 , 6.7 , 7000,2000,false);
    Silnik si4 = new Silnik("silnik_Seat","boxxer" , 4.5 , 6.7 , 7000,2000,false);

    Samochod car1 = new Samochod(1000,sk1,si1,"Blue" , 223456 , "Seria_5" ,"BMW" , 270 );
    Samochod car2 = new Samochod(1200,sk2,si2,"Red" , 224566 , "Mondeo" ,"Ford" , 200 );
    Samochod car3 = new Samochod(1400,sk3,si3,"Green" , 224566 , "Punto" ,"Fiat" , 180 );
    Samochod car4 = new Samochod(1150,sk4,si4,"Yellow" , 224566 , "Leon" ,"Seat" , 250 );


    ArrayList<Skrzynia> Skrzynie = new ArrayList<Skrzynia>();
    ArrayList<Samochod> Samochody = new ArrayList<Samochod>();
    ArrayList<Silnik> Silniki = new ArrayList<Silnik>();
    ArrayList<Sprzeglo> Sprzegla = new ArrayList<Sprzeglo>();

    public Pomocnicza(){

                Samochody.add(car1);
                Samochody.add(car2);
                Samochody.add(car3);
                Samochody.add(car4);

                Skrzynie.add(sk1);
                Skrzynie.add(sk2);
                Skrzynie.add(sk3);
                Skrzynie.add(sk4);

                Silniki.add(si1);
                Silniki.add(si2);
                Silniki.add(si3);
                Silniki.add(si4);

                Sprzegla.add(sp1);
                Sprzegla.add(sp2);
                Sprzegla.add(sp3);
                Sprzegla.add(sp4);

        }

        public int switching_method(String selected )
        {
            int k = 0;
            boolean p = false;
            for (int i = 0 ; i < Samochody.size() ; i++){
                if(Samochody.get(i).getMarka().equals(selected)){
                    k = i;  break;
                }

            }
            return k;
        }
    public int switching_method_silniki(String selected )
    {
        int k = 0;
        boolean p = false;
        for (int i = 0 ; i < Silniki.size() ; i++){
            if(Silniki.get(i).getId().equals(selected)){
                k = i;  break;
            }

        }
        return k;
    }
        public void clear_car()
        {
            ;
        }

}

