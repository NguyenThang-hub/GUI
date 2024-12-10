import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout.*;
public class Sum extends JFrame {
    static JTextField txta, txtb;
    static JLabel kq ;
    public static void main(String args[]){
        JFrame frame = new JFrame("Sum");
        frame.setSize( 400, 300);
        frame.setLayout(new GridLayout( 4 , 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("a"));
        txta = new JTextField();
        frame.add(txta);
        frame.add(new JLabel("b"));
        txtb = new JTextField();
        frame.add(txtb);
        frame.add( new JLabel("Kết quả"));
        kq = new JLabel();
        frame.add(kq);
        JPanel PN = new JPanel();
        frame.setLayout(new GridLayout(4, 0));
        JButton btn = new JButton("+");
        frame.add(btn);
        JButton btn1 = new JButton("-");
        frame.add(btn1);
        btn.addActionListener(e -> {
            int a = Integer.parseInt(txta.getText());
            int b = Integer.parseInt(txtb.getText());
            kq.setText(String.valueOf(a+b));
        });
        btn1.addActionListener(e -> {
            int a = Integer.parseInt(txta.getText());
            int b = Integer.parseInt(txtb.getText());
            kq.setText(String.valueOf(a-b));
        });
        frame.setVisible(true);

    }

}