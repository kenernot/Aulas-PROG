package br.com.lucasj;

import javax.swing.JOptionPane;

public class EX004 {

    public EX004() {

        String[] numeros = new String[3];
        for (int i = 0; i < numeros.length; i++) {
            while (!Utilidades.isNumeric(numeros[i])) {
                numeros[i] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número!");
            }
        }

        for (int x = 0; x < numeros.length; x++) {
            for (int y = x + 1; y < numeros.length; y++) {
                if (Double.parseDouble(numeros[x]) > Double.parseDouble(numeros[y])) {
                    String nuvem = numeros[x];
                    numeros[x] = numeros[y];
                    numeros[y] = nuvem;
                }
            }
        }

        String msg = "";

        for (int i = 0; i < numeros.length; i++) {
            msg += "Número " + (i+1) + ": " + numeros[i] + "\r\n";
        }

        JOptionPane.showMessageDialog(null, msg);

    }
}
