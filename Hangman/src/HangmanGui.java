import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HangmanGui {

    private JTextField Eingabefeld;
    private JTextField Ausgabefeld;
    private JPanel Mainpanel;
    private JButton button1;
    private JButton button2;
    String c = "Gestrandet";
    String d = "ErwinArent";
    String e = "TimAsmus";

    String wort = "Hallo";
    String [] wort1;


    public static void main(String[] args) {
        JFrame frame = new JFrame("HangmanGui");
        frame.setContentPane(new HangmanGui().Mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public HangmanGui() {
        Ausgabefeld.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < wort.length(); i++) {
                    wort1[i] = " _";
                }
                Ausgabefeld.setText("");
                for (int i = 0; i < wort.length(); i++) {
                    Ausgabefeld.setText(Ausgabefeld.getText() + wort1[i]);


                }
            }
        });

        Eingabefeld.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }}












