import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class ProjectCars {

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
    private JButton playSoundButton;
    private JFormattedTextField p;
    private JPasswordField number;






    BMW bmw = new BMW();
    SEAT seat = new SEAT();
    FIAT fiat= new FIAT();
    FORD ford = new FORD();


    //********************************************************************************************************
    ///////////TWORZENIE OBIEKTOW//////////////////////////////////////////////////////////////////////////
    Sprzeglo sp1 = new Sprzeglo("sp1","sprzeglo1" , 4.4 , 7.8 , true);
    Sprzeglo sp2 = new Sprzeglo("sp2","sprzeglo2" , 6.4 , 7.8 , true);
    Sprzeglo sp3 = new Sprzeglo("sp3","sprzeglo3" , 7.4 , 7.8 , false);
    Sprzeglo sp4 = new Sprzeglo("sp4","sprzeglo4" , 8.4 , 7.8 , true);
    Skrzynia sk1 = new Skrzynia("sk1", "automatyczna" ,15.55 , 6.78 ,2,8,3,sp1);
    Skrzynia sk2 = new Skrzynia("sk2","manualna" ,17.55 , 6.78 ,2,8,3,sp1);
    Skrzynia sk3 = new Skrzynia("sk3","sportowa" ,19.55 , 6.78 ,2,8,3,sp1);
    Skrzynia sk4 = new Skrzynia("sk4","polautomatyczna" ,18.55 , 6.78 ,2,8,3,sp1);
    Silnik si1 = new Silnik("silnik_BMW","diesel" , 238.5 , 6.7 , 7000,2000,false);
    Silnik si2 = new Silnik("silnik_Ford","biturbo" , 411.5 , 6.7 , 7000,2000,false);
    Silnik si3 = new Silnik("silnik_Fiat","twinturbo" , 313.5 , 6.7 , 7000,2000,false);
    Silnik si4 = new Silnik("silnik_Seat","boxxer" , 224.5 , 6.7 , 7000,2000,false);

    Samochod car1 = new Samochod(1000,sk1,si1,"Blue" , 223456 , "Seria_5" ,"BMW" , 270 );
    Samochod car2 = new Samochod(1200,sk2,si2,"Red" , 224566 , "Mondeo" ,"Ford" , 200 );
    Samochod car3 = new Samochod(1400,sk3,si3,"Green" , 224566 , "Punto" ,"Fiat" , 180 );
    Samochod car4 = new Samochod(1150,sk4,si4,"Yellow" , 224566 , "Leon" ,"Seat" , 250 );


    ArrayList<Skrzynia> Skrzynie = new ArrayList<Skrzynia>();
    ArrayList<Samochod> Samochody = new ArrayList<Samochod>();
    ArrayList<Silnik> Silniki = new ArrayList<Silnik>();
    ArrayList<Sprzeglo> Sprzegla = new ArrayList<Sprzeglo>();



    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public ProjectCars() {
        dial dialog = new dial();
        dialog.pack();
       //dial2 dialog2 = new dial2();
     //   dialog2.pack();
      //  dial3 dialog3 = new dial3();
      //  dialog3.pack();
       /* JFrame frame1 = new JFrame("TTTTTT");
     //   frame1.setContentPane(new TTTTT().panel2);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();*/

       Pomocnicza helpin_object = new Pomocnicza();
       Sound Sounding = new Sound();


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

        Samochody.add(car1);
        Samochody.add(car2);
        Samochody.add(car3);
        Samochody.add(car4);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////SILNIK SILNIK ////////////////////////////////////////////////////////
        for(int i = 0 ; i < Silniki.size() ; i++) {
            silnikbox.insertItemAt(Silniki.get(i).getId() , i);
        }
        silnikbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = silnikbox.getSelectedItem().toString();
                int p = helpin_object.switching_method_silniki(sel);
                if (Silniki.get(p).is_running == true)
                    WlWylSil.setText("Wylacz");
                else
                    WlWylSil.setText("Wlacz");
            }
        });
        playSoundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = silnikbox.getSelectedItem().toString();
                int p = helpin_object.switching_method_silniki(sel);
                Sounding.which_sound(p);
            }
        });

        WagaSilnika.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = silnikbox.getSelectedItem().toString();
                String WAGA;
                int p = helpin_object.switching_method_silniki(sel);
                Double waga = Silniki.get(p).getWaga();
               WAGA = waga.toString();
               wagadisp.setText(WAGA + " kg");
            }
        });
        zmienButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wagadisp.setText("");
                Modsildisp.setText("");
                zm.setText("");
                obrotydisp2.setText("");
                obrotydisp.setText("");
                zwk.setText("");
                obrotydisp.setText("");
                //  dialog2.setVisible(true);
            }
        });
        WykZmn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = silnikbox.getSelectedItem().toString();
                int p = helpin_object.switching_method_silniki(sel);
                String text = zm.getText();
                Integer w = Integer.parseInt(text);
                Silniki.get(p).zmniejsz_obroty(w);
                Integer scanuj =  Silniki.get(p).obroty;
                obrotydisp.setText(scanuj.toString());
                if(Silniki.get(p).obroty == 0)
                    WlWylSil.setText("Wlacz");
                else
                    WlWylSil.setText("Wylacz");

                Samochody.get(p).set_is_running();
                if(   Samochody.get(p).isIsrunning() == true) UrWyl.setText("Wylacz");
                else UrWyl.setText("Wlacz");

             /*   String sell = comboBox1.getSelectedItem().toString();
                int pp = helpin_object.switching_method(sell);
                if (pp == p){
                   Samochody.get(pp).set_is_running();
                   Integer aktualspeeed =     Samochody.get(pp).aktualna_predkosc();
                   samaktdisp.setText(aktualspeeed.toString());
                   if(   Samochody.get(pp).isIsrunning() == true) UrWyl.setText("Wylacz");
                   else UrWyl.setText("Wlacz");
                }*/

            }
        });

        WlWylSil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        modelsilnika.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = silnikbox.getSelectedItem().toString();
                int p = helpin_object.switching_method_silniki(sel);
                Modsildisp.setText(Silniki.get(p).getNazwa());
                Integer pp = Silniki.get(p).obroty;
                String ss = pp.toString();
                obrotydisp.setText(ss);
            }
        });


        WykZwk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = silnikbox.getSelectedItem().toString();
                int p = helpin_object.switching_method_silniki(sel);
                String text = zwk.getText();
                Integer w = Integer.parseInt(text);
                Silniki.get(p).zwieksz_obroty(w);
                Integer scanuj =  Silniki.get(p).obroty;
                obrotydisp.setText(scanuj.toString());
                if(Silniki.get(p).obroty == 0)
                    WlWylSil.setText("Wlacz");
                else
                    WlWylSil.setText("Wylacz");

            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////Skrzynia Skrzynia////////////////////////////////////////////////////////
        ModelSkrzyni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        zmienButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k;
                boolean p = false;


                    modelskdisp.setText("");
                    mskdisp.setText("");
                    iloscbiegow.setText("");
                    aktbieg.setText("");
                    zmb.setText("");
                //frame1.setVisible(true);
            }
        });
        pokMOdelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k = 0;
                boolean pp = false;

                for (int i = 0 ; i < Skrzynie.size() ; i++){
                    if(Skrzynie.get(i).getId().equals(ModelSkrzyni.getText())){
                        k = i;  pp = true; break;
                    }

                }
                if( pp == true) {
                    modelskdisp.setText(Skrzynie.get(k).getNazwa());
                    panel1.setVisible(true);
                }
                pp = false;
            }
        });
        WagaSkrzyni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k = 0;
                boolean p = false;

                for (int i = 0 ; i < Skrzynie.size() ; i++){
                    if(Skrzynie.get(i).getId().equals(ModelSkrzyni.getText())){
                        k = i;  p = true; break;
                    }
                }
                if( p == true) {
                    Double d = Skrzynie.get(k).getWaga();
                    String s = d.toString();
                    mskdisp.setText(s);

                }
                p = false;
            }


        });
        IloscBiegowSkrz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k = 0;
                boolean p = false;

                for (int i = 0 ; i < Skrzynie.size() ; i++){
                    if(Skrzynie.get(i).getId().equals(ModelSkrzyni.getText())){
                        k = i;  p = true; break;
                    }
                }
                if( p == true) {
                    Integer d = Skrzynie.get(k).getIlosc_biegow();
                    String s = d.toString();
                    iloscbiegow.setText(s);

                }
                p = false;

            }
        });
        AktBieg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k = 0;
                boolean p = false;

                for (int i = 0 ; i < Skrzynie.size() ; i++){
                    if(Skrzynie.get(i).getId().equals(ModelSkrzyni.getText())){
                        k = i;  p = true; break;
                    }
                }
                if( p == true) {
                    Integer d = Skrzynie.get(k).getAktualny_bieg();
                    String s = d.toString();
                    aktbieg.setText(s);

                }
                p = false;


            }
        });
        zmienButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k = 0;
               boolean p = false;
                for (int i = 0 ; i < Skrzynie.size() ; i++){
                    if(Skrzynie.get(i).getId().equals(ModelSkrzyni.getText())){
                        k = i;  p = true; break;
                    }
                }
                if( p == true) {
                    Integer buff;
                    String s = zmb.getText();
                    buff = Integer.parseInt(s);
                    Integer w = Skrzynie.get(k).zmienBieg(buff);

                    aktbieg.setText(w.toString());

                }
                p = false;
            }
        });


        //////////////////////////////////////////////SPRZEGLO//////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Sprzeglo> Sprzegla = new ArrayList<Sprzeglo>();

        Sprzegla.add(sp1);
        Sprzegla.add(sp2);
        Sprzegla.add(sp3);
        Sprzegla.add(sp4);

        zmienButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textField1.setText("");
                wagasprzegla.setText("");
                stansprzegla.setText("");

            }
        });
        pokazMOdelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k = 0;
                boolean p = false;
                for (int i = 0 ; i < Skrzynie.size() ; i++){
                    if(Sprzegla.get(i).getId().equals(ModelSprzegla.getText())){
                        k = i;  p = true; break;
                    }
                }
                textField1.setText(Sprzegla.get(k).getNazwa());
            }
        });


        WagaSprzegla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k = 0;
                boolean p = false;
                for (int i = 0 ; i < Skrzynie.size() ; i++){
                    if(Sprzegla.get(i).getId().equals(ModelSprzegla.getText())){
                        k = i;  p = true; break;
                    }
                }
                if( p == true) {


                    Double buff = Sprzegla.get(k).getWaga();
                    String s = buff.toString();
                    wagasprzegla.setText(s);

                }
                p = false;

            }
        });
        NacSpusc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k = 0;
                boolean p = false;
                for (int i = 0 ; i < Skrzynie.size() ; i++){
                    if(Sprzegla.get(i).getId().equals(ModelSprzegla.getText())){
                        k = i;  p = true; break;
                    }
                }
                if( p == true){
                    if(Sprzegla.get(k).isStan_sprzegla() == true) {
                        Sprzegla.get(k).setStan_sprzegla(false);
                        NacSpusc.setText("Nac");
                        Sprzegla.get(k).setStan_sprzegla(false);
                        stansprzegla.setText("");
                    }
                    else{
                        Sprzegla.get(k).setStan_sprzegla(true);
                        NacSpusc.setText("Spusc");
                        Sprzegla.get(k).setStan_sprzegla(true);
                        stansprzegla.setText("");
                    }


                }
            }
        });
        Stan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int k = 0;
                boolean p = false;
                for (int i = 0 ; i < Skrzynie.size() ; i++){
                    if(Sprzegla.get(i).getId().equals(ModelSprzegla.getText())){
                        k = i;  p = true; break;
                    }
                }
                if( p == true) {

                    if(Sprzegla.get(k).isStan_sprzegla() == true)
                    stansprzegla.setText("Nacisniete");
                    else stansprzegla.setText("Spuszczone");
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////SAMOCHOD///////////////////////////////////////////////


        for(int i = 0 ; i < Samochody.size() ; i++) {
            comboBox1.insertItemAt(Samochody.get(i).getMarka() , i);
        }
        Atrybuty.setText("Wyglad");
        Wyglad.setText("Pokaz");

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
            });
        pokazButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = comboBox1.getSelectedItem().toString();
                int p = helpin_object.switching_method(sel);
                sammodeldisp.setText(Samochody.get(p).getModel());
            }
        });

        czyscButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sammodeldisp.setText("");
                vmaxdisp.setText("");
                samwagadisp.setText("");
                samaktdisp.setText("");
            }
        });
        Vmax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = comboBox1.getSelectedItem().toString();
                int p = helpin_object.switching_method(sel);
                Integer vmax = Samochody.get(p).getVmax();
                String VMAX = vmax.toString();
                vmaxdisp.setText(VMAX + " km/h");
            }
        });
        WagaSam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = comboBox1.getSelectedItem().toString();
                int p = helpin_object.switching_method(sel);
                Double waga = Samochody.get(p).obliczWage();
                String WAGA = waga.toString();
                samwagadisp.setText(WAGA + " kg");
            }
        });
        AktPredk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = comboBox1.getSelectedItem().toString();
                int p = helpin_object.switching_method(sel);
                Integer akt = Samochody.get(p).aktualna_predkosc();
                String AKT = akt.toString();
                samaktdisp.setText(AKT+ " km/h");
            }
        });
        UrWyl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = comboBox1.getSelectedItem().toString();
                int p = helpin_object.switching_method(sel);
                if (Samochody.get(p).isIsrunning() == true) {
                    Samochody.get(p).wylacz();
                    UrWyl.setText("Uruchom");

                    samaktdisp.setText( Samochody.get(p).aktualna_predkosc() + " km/h");

                    panel1.setVisible(true);
                    WlWylSil.setText("Wlacz");
                }
                else{
                    Samochody.get(p).wlacz();
                    UrWyl.setText("Zatrzymaj");
                    samaktdisp.setText( Samochody.get(p).aktualna_predkosc() + " km/h");
                    panel1.setVisible(true);
                    WlWylSil.setText("Wylacz");

                }
            }
        });
        Wyglad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sel = comboBox1.getSelectedItem().toString();
                int p = helpin_object.switching_method(sel);
             switch(p){
                 case 0: bmw.setVisible(true); break;
                 case 1: ford.setVisible(true);break;
                 case 2: fiat.setVisible(true);break;
                 case 3: seat.setVisible(true);break;
             }

            }
        });



    }
    public static void main(String[] args){
        JFrame frame = new JFrame("ProjectCars");
        frame.setContentPane(new ProjectCars().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}


