package br.com.lucasj;

import javax.swing.JOptionPane;

public class EX008 {

    public EX008() {

        String[] nomes = new String[5];
        String msg = "";
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = "";
            while (nomes[i].equals("")) {
                nomes[i] = JOptionPane.showInputDialog("Digite o nome da " + (i+1) + "ª pessoa.");
            }

        }

        for (int i = nomes.length - 1; i > -1; i--) {
            msg += nomes[i] + "\r\n";
        }
        
        JOptionPane.showMessageDialog(null, msg);
    }

}
