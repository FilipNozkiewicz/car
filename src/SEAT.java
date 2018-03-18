import javax.swing.*;

public class SEAT extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();

    public SEAT(){
        setTitle("Seat");

        setSize(2000,2000);
     //   setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl.setIcon((new ImageIcon("seat.jpg")));
        jp.add(jl);
        add(jp);

        validate();
    }
}