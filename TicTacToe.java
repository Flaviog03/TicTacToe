import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe{

        static boolean vinto1 = false;
        static boolean vinto2 = false;
        static boolean a = true;
        static int vet[] = new int[9];
        private static JButton button1 = new JButton("");
        private static JButton button2 = new JButton("");
        private static JButton button3 = new JButton("");
        private static JButton button4 = new JButton("");
        private static JButton button5 = new JButton("");
        private static JButton button6 = new JButton("");
        private static JButton button7 = new JButton("");
        private static JButton button8 = new JButton("");
        private static JButton button9 = new JButton("");

        public static void main(String[] args) {

                JFrame frame = new JFrame("Tris");
                JPanel panel = new JPanel();
                panel.setBackground(Color.black);
                panel.setLayout(new GridLayout(3, 3, 10, 10));

                // Check condition

                // Action listener set

                button1.addActionListener(new Gestore(button1));
                button1.setActionCommand("1");
                button2.addActionListener(new Gestore(button2));
                button2.setActionCommand("2");
                button3.addActionListener(new Gestore(button3));
                button3.setActionCommand("3");
                button4.addActionListener(new Gestore(button4));
                button4.setActionCommand("4");
                button5.addActionListener(new Gestore(button5));
                button5.setActionCommand("5");
                button6.addActionListener(new Gestore(button6));
                button6.setActionCommand("6");
                button7.addActionListener(new Gestore(button7));
                button7.setActionCommand("7");
                button8.addActionListener(new Gestore(button8));
                button8.setActionCommand("8");
                button9.addActionListener(new Gestore(button9));
                button9.setActionCommand("9");

                // Add Section

                panel.add(button1);
                panel.add(button2);
                panel.add(button3);
                panel.add(button4);
                panel.add(button5);
                panel.add(button6);
                panel.add(button7);
                panel.add(button8);
                panel.add(button9);

                // Frame set

                frame.getContentPane().add(panel);
                frame.setSize(320, 320);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
        }



    // Make it work

    // Action listener class

    public static class Gestore implements ActionListener{

                private JButton button;

                static boolean mat[][] = new boolean[3][3];

                public Gestore(JButton button){
                        this.button = button;
                }

            @Override
            public void actionPerformed(ActionEvent e) {
                    String action = e.getActionCommand();
                    int i = Integer.parseInt(action);

                    switch (i) {
                            case 1:
                                    vet[0] = 1;
                                    button.setText("X");
                                    button.setEnabled(false);
                                    mat[0][0] = true;
                                    break;
                            case 2:
                                    vet[1] = 1;
                                    button.setText("X");
                                    button.setEnabled(false);
                                    mat[1][0] = true;
                                    break;
                            case 3:
                                    vet[2] = 1;
                                    button.setText("X");
                                    button.setEnabled(false);
                                    mat[2][0] = true;
                                    break;
                            case 4:
                                    vet[3] = 1;
                                    button.setText("X");
                                    button.setEnabled(false);
                                    mat[0][1] = true;
                                    break;
                            case 5:
                                    vet[4] = 1;
                                    button.setText("X");
                                    button.setEnabled(false);
                                    mat[1][1] = true;
                                    break;
                            case 6:
                                    vet[5] = 1;
                                    button.setText("X");
                                    button.setEnabled(false);
                                    mat[2][1] = true;
                                    break;
                            case 7:
                                    vet[6] = 1;
                                    button.setText("X");
                                    button.setEnabled(false);
                                    mat[0][2] = true;
                                    break;
                            case 8:
                                    vet[7] = 1;
                                    button.setText("X");
                                    button.setEnabled(false);
                                    mat[1][2] = true;
                                    break;
                            case 9:
                                    vet[8] = 1;
                                    button.setText("X");
                                    button.setEnabled(false);
                                    mat[2][2] = true;
                                    break;

                    }

                    int cont = 0; // Contatore delle caselle rimanenti

                    for (int j = 0; j < 3; j++)
                            for (int k = 0; k < 3; k++) {
                                    if (mat[k][j] == true) {
                                            cont++;
                                    }
                            }
                    if (cont < 9) {
                            boolean esci = false;
                            int n = 0;
                            int m = 0;

                            while (!esci) {
                                    n = (int) (Math.random() * 3);
                                    m = (int) (Math.random() * 3);

                                    if (mat[n][m] == false) {
                                            mat[n][m] = true;
                                            esci = true;
                                    }
                            }

                    switch (n) {
                            case 0:
                                    switch (m) {
                                            case 0:
                                                    vet[0] = 2;
                                                    button1.setText("O");
                                                    button1.setEnabled(false);
                                                    break;
                                            case 1:
                                                    vet[3] = 2;
                                                    button4.setText("O");
                                                    button4.setEnabled(false);
                                                    break;
                                            case 2:
                                                    vet[6] = 2;
                                                    button7.setText("O");
                                                    button7.setEnabled(false);
                                                    break;
                                    }
                                    break;
                            case 1:
                                    switch (m) {
                                            case 0:
                                                    vet[1] = 2;
                                                    button2.setText("O");
                                                    button2.setEnabled(false);
                                                    break;
                                            case 1:
                                                    vet[4] = 2;
                                                    button5.setText("O");
                                                    button5.setEnabled(false);
                                                    break;
                                            case 2:
                                                    vet[7] = 2;
                                                    button8.setText("O");
                                                    button8.setEnabled(false);
                                                    break;
                                    }
                                    break;
                            case 2:
                                    switch (m) {
                                            case 0:
                                                    vet[2] = 2;
                                                    button3.setText("O");
                                                    button3.setEnabled(false);
                                                    break;
                                            case 1:
                                                    vet[5] = 2;
                                                    button6.setText("O");
                                                    button6.setEnabled(false);
                                                    break;
                                            case 2:
                                                    vet[8] = 2;
                                                    button9.setText("O");
                                                    button9.setEnabled(false);
                                                    break;
                                    }
                                    break;
                        }
                    }

                    // Opzioni vittoria giocatore

                    boolean pareggio = false;

                    if (vet[0] == 1 && vet[1] == 1 && vet[2] == 1) {
                            System.out.println("Orizzontale Superiore");
                            button1.setText("-");button2.setText("-");button3.setText("-");
                            vinto1 = true;
                    }

                    if (vet[3] == 1 && vet[4] == 1 && vet[5] == 1) {
                            System.out.println("Orizzontale Centro");
                            button4.setText("-");button5.setText("-");button6.setText("-");
                            vinto1 = true;

                    }

                    if (vet[6] == 1 && vet[7] == 1 && vet[8] == 1) {
                            System.out.println("Orizzontale Inferiore");
                            button7.setText("-");button8.setText("-");button9.setText("-");
                            vinto1 = true;

                    }

                    if (vet[0] == 1 && vet[3] == 1 && vet[6] == 1) {
                            System.out.println("Verticale sinistra");
                            button1.setText("|");button4.setText("|");button7.setText("|");
                            vinto1 = true;

                    }

                    if (vet[1] == 1 && vet[4] == 1 && vet[7] == 1) {
                            System.out.println("Verticale Centrale");
                            button2.setText("|");button5.setText("|");button8.setText("|");
                            vinto1 = true;

                    }

                    if (vet[2] == 1 && vet[5] == 1 && vet[8] == 1) {
                            System.out.println("Vertoicale Destra");
                            button3.setText("|");button6.setText("|");button9.setText("|");
                            vinto1 = true;

                    }

                    if (vet[0] == 1 && vet[4] == 1 && vet[8] == 1) {
                            System.out.println("Diagonale prima");
                            button1.setText("\\");button5.setText("\\");button9.setText("\\");
                            vinto1 = true;

                    }

                    if (vet[2] == 1 && vet[4] == 1 && vet[6] == 1) {
                            System.out.println("Diagonale seconda");
                            button3.setText("/");button5.setText("/");button7.setText("/");
                            vinto1 = true;

                    }

                    // Opzioni di vittoria secondo giocatore

                    if (vet[0] == 2 && vet[1] == 2 && vet[2] == 2) {
                            System.out.println("Orizzontale Superiore");
                            button1.setText("-");button2.setText("-");button3.setText("-");
                            vinto2 = true;

                    }

                    if (vet[3] == 2 && vet[4] == 2 && vet[5] == 2) {
                            System.out.println("Orizzontale Centro");
                            button4.setText("-");button5.setText("-");button6.setText("-");
                            vinto2 = true;

                    }

                    if (vet[6] == 2 && vet[7] == 2 && vet[8] == 2) {
                            System.out.println("Orizzontale Inferiore");
                            button7.setText("-");button8.setText("-");button9.setText("-");
                            vinto2 = true;

                    }

                    if (vet[0] == 2 && vet[3] == 2 && vet[6] == 2) {
                            System.out.println("Verticale sinistra");
                            button1.setText("|");button4.setText("|");button7.setText("|");
                            vinto2 = true;

                    }

                    if (vet[1] == 2 && vet[4] == 2 && vet[7] == 2) {
                            System.out.println("Verticale Centrale");
                            button2.setText("|");button5.setText("|");button8.setText("|");
                            vinto2 = true;

                    }

                    if (vet[2] == 2 && vet[5] == 2 && vet[8] == 2) {
                            System.out.println("Vertoicale Destra");
                            button3.setText("|");button6.setText("|");button9.setText("|");
                            vinto2 = true;

                    }

                    if (vet[0] == 2 && vet[4] == 2 && vet[8] == 2) {
                            System.out.println("Diagonale prima");
                            button1.setText("\\");button5.setText("\\");button9.setText("\\");
                            vinto2 = true;

                    }

                    if (vet[2] == 2 && vet[4] == 2 && vet[6] == 2) {
                            System.out.println("Diagonale seconda");
                            button3.setText("/");button5.setText("/");button7.setText("/");
                            vinto2 = true;

                    }

                    // Cose ultime

                    int count = 0;

                    for(int j = 0 ; j < 3 ; j++){
                            for (int k = 0 ; k < 3 ; k++){
                                    if(mat[k][j] == true){
                                            count++;
                                    }
                            }
                    }

                    if(count == 9){
                            pareggio = true;
                    }

                    if(vinto1){
                            JOptionPane.showMessageDialog(null, "Hai vinto Giocatore1", "Risultato" ,JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(vinto2){
                            JOptionPane.showMessageDialog(null, "Hai vinto Giocatore2", "Risultato" ,JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(pareggio){
                            JOptionPane.showMessageDialog(null, "Pareggio", "Risultato" ,JOptionPane.INFORMATION_MESSAGE);
                    }

            }
    }
}
