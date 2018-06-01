package br.com;

import javax.swing.JOptionPane;

public class GreveLivros {

    public static void main(String[] args) {
        LivroDeBibliotecaV2[] biblioteca = new LivroDeBibliotecaV2[3];
        LivroDeLivrariaV2[] livraria = new LivroDeLivrariaV2[3];

        for (int i = 0; i < biblioteca.length; i++) {
            biblioteca[i] = new LivroDeBibliotecaV2();
            boolean pass = false;
            String numeroDigitado;
            while (!pass) {
                numeroDigitado = JOptionPane.showInputDialog("Digite o número de exemplares do " + i + "º livro de biblioteca!");
                if (Utilidades.isInt(numeroDigitado)) {
                    pass = true;
                    biblioteca[i].setExemplares(Integer.parseInt(numeroDigitado));
                }
            }
        }

        for (int i = 0; i < livraria.length; i++) {
            livraria[i] = new LivroDeLivrariaV2();
            boolean pass = false;
            String numeroDigitado;
            while (!pass) {
                numeroDigitado = JOptionPane.showInputDialog("Digite o valor do " + i + "º livro de livraria!");
                if (Utilidades.isNumeric(numeroDigitado)) {
                    pass = true;
                    livraria[i].setValor(Double.parseDouble(numeroDigitado));
                }
            }
        }

        for (LivroDeBibliotecaV2 biblioteca_ : biblioteca) {
            System.out.println(biblioteca_.getExemplares());
        }
        for (LivroDeLivrariaV2 livraria_ : livraria) {
            System.out.println(livraria_.getValor());
        }
    }

}
