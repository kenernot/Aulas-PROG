package br.com.lucasj;

import javax.swing.JOptionPane;

public class EX010 {

    public EX010() {
        String km = "";
        String km_l = "";

        while (!Utilidades.isNumeric(km)) {
            km = JOptionPane.showInputDialog("Digite a quantidade de kilometros!");
        }

        while (!Utilidades.isNumeric(km_l)) {
            km_l = JOptionPane.showInputDialog("Digite a quantidade de KM/L!");
        }
        double litros = Double.parseDouble(km) / Double.parseDouble(km_l);
        System.out.println("Quantidade de litros necessária = " + litros);

    }

}
