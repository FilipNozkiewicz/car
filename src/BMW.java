import javax.swing.*;

public class BMW extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();

    public BMW(){
        setTitle("BMW");

        setSize(2000,2000);
      //  setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl.setIcon((new ImageIcon("bmw.jpg")));
        jp.add(jl);
        add(jp);

        validate();
    }
}