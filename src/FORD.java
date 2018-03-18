import javax.swing.*;

public class FORD extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();

    public FORD(){
        setTitle("Ford");

        setSize(2000,2000);
      //  setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl.setIcon((new ImageIcon("ford.jpg")));
        jp.add(jl);
        add(jp);

        validate();
    }
}