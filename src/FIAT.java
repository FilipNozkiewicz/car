import javax.swing.*;

public class FIAT extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();

    public FIAT(){
        setTitle("Fiat");

        setSize(2000,2000);
     //   setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl.setIcon((new ImageIcon("fiat.jpg")));
        jp.add(jl);
        add(jp);

        validate();
    }
}