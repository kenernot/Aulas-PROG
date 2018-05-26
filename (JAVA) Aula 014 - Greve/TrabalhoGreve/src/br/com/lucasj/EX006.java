package br.com.lucasj;

import javax.swing.JOptionPane;

public class EX006 {

    public EX006() {
        Posto[] postos = new Posto[3];

        for (int i = 0; i < postos.length; i++) {
            postos[i] = new Posto();
            postos[i].setNome("");
            while (postos[i].getNome().equals("")) {
                postos[i].setNome(JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º posto!"));
            }

            String valor = "";
            while (!Utilidades.isNumeric(valor)) {
                valor = JOptionPane.showInputDialog("Digite o valor de combustível do " + (i + 1) + "º posto!");
            }
            postos[i].setValor(Double.parseDouble(valor));
        }

        int menor;
        if (postos[0].getValor() < postos[1].getValor() && postos[0].getValor() < postos[2].getValor()) {
            menor = 0;
        } else if (postos[1].getValor() < postos[0].getValor() && postos[1].getValor() < postos[2].getValor()) {
            menor = 1;
        } else {
            menor = 2;
        }

        JOptionPane.showMessageDialog(null, "O posto " + postos[menor].getNome() + " tem o menor preço (R$" + postos[menor].getValor() + ")");

    }

}

class Posto {

    private String nome;
    private Double valor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return this.valor;
    }

}
