package br.com.lucasj;

import javax.swing.JOptionPane;

public class EX009 {

    public EX009() {
        String km = "";
        String litros = "";

        while (!Utilidades.isNumeric(km)) {
            km = JOptionPane.showInputDialog("Digite a quantidade de kilometros!");
        }

        while (!Utilidades.isNumeric(litros)) {
            litros = JOptionPane.showInputDialog("Digite a quantidade de litros!");
        }

        double km_l = Double.parseDouble(km) / Double.parseDouble(litros);
        System.out.println("KM/L = " + km_l);

    }

}
