import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HangmanGui {

    private JTextField Eingabefeld;
    private JTextField Ausgabefeld;
    private JPanel Mainpanel;
    private JButton button2;
    private JTextArea Area;
    String c = "gestrandet";
    String d = "erwinArent";
    String e = "zimAsmus";

    String wort = "hallo";
    String [] wort1;
    String Platzhalter ;
 String [] wortBuchstabe;
 int o ;

    public static void main(String[] args) {
        JFrame frame = new JFrame("HangmanGui");
        frame.setContentPane(new HangmanGui().Mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public HangmanGui() {
        wort1 = new String [wort.length()];//Array 1
        wortBuchstabe = new String[wort.length()];//Array 2
o=0;

        for (int i = 0; i < wort.length(); i++) {
            wort1[i] = " _";
wortBuchstabe[i]= String.valueOf(wort.charAt(i));

        }
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Platzhalter = Eingabefeld.getText();

                for (int i = 0; i < wort.length(); i++) {
                    if (Platzhalter.equals(wortBuchstabe[i])) {
                        wort1[i] = Platzhalter;

                    } else {

                            if (o == 3) {
                                Area.setText("Hallo \n ich \t ");
                            }
                            if (o == 2) {
                                Area.setText("moin \n zzh \t ");
                            }
                            if (o == 1) {
                                Area.setText("Hazputpuzo \n icutzuuh \t ");
                            }
                    }

                }
                Ausgabefeld.setText("");
                for (int i = 0; i < wort.length(); i++) {
                    Ausgabefeld.setText(Ausgabefeld.getText() + wort1[i]);
                    Eingabefeld.setText("");

                }
            }
        });
    }
}

