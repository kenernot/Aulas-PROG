package br.com.lucasj;

import javax.swing.JOptionPane;

public class EX002 {

    public EX002() {
        Integer idade = 45;
        Double peso = 104.5;
        Float altura = 1.77F;
        Boolean vivo = true;
        String nome = "Fuji";
        JOptionPane.showMessageDialog(null, "Idade: " + idade + "\r\n"
                + "Peso: " + peso + "\r\n"
                + "Altura: " + altura + "\r\n"
                + "Vivo: " + vivo + "\r\n"
                + "Nome: " + nome);
    }

}
