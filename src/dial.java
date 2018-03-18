import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;



public class dial extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel imagepanel;
    private BufferedImage image;
    private ImageIcon bmw = new ImageIcon("../bwm.jpg");
    private ImageIcon ford = new ImageIcon("../ford.jpg");
    private ImageIcon fiat = new ImageIcon("../fiat.jpg");
    private ImageIcon seat = new ImageIcon("../seat.jpg");
    private JLabel LBLimage = new JLabel();

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


    public dial() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }




    public void disp(int p){
        JLabel picLabel = new JLabel();
        switch(p){
            case 0:  picLabel.setIcon(bmw); add(picLabel); break;
            case 1:  picLabel.setIcon(ford); add(picLabel);break;
            case 2:  picLabel.setIcon(fiat);add(picLabel); break;
            case 3:  picLabel.setIcon(seat); add(picLabel);break;

        }
    }
    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }


   /* public static void main(String[] args) {
        dial dialog = new dial();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }*/
}
