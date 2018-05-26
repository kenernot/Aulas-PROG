/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author lukas
 */
public class TesteAleatorio {

    public static void main(String[] args) {
        Random ran = new Random();
        Integer[] numeroConcedidos = new Integer[4];
        for (int i = 0; i < numeroConcedidos.length; i++) {
            numeroConcedidos[i] = i * -1;
        }
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numerosAleatorios.add(ran.nextInt(100));
        }

        for (int i = 0; i < 4; i++) {
            boolean pass = false;
            while (!pass) {
                Integer myDigitedNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0-100!"));

                if (myDigitedNumber >= 0 && myDigitedNumber <= 100 && !isAlreadyListed(myDigitedNumber, numeroConcedidos)) {
                    pass = true;
                    numeroConcedidos[i] = myDigitedNumber;
                }
            }
        }

        boolean pass = false;
        for (int i = 0; i < numeroConcedidos.length; i++) {
            if (isAlreadyListed(numeroConcedidos[i], numerosAleatorios)) {
                pass = true;
            } else {
                pass = false;
                break;
            }
        }

        if (pass == false) {
            System.out.println("Mas que peninha, você perdeu");
        } else {
            System.out.println("Olha só, tu ganhaste!");
        }

    }

    private static boolean isAlreadyListed(int numeroConcedido, Integer[] numerosConcedidos) {
        for (int i = 0; i < numerosConcedidos.length; i++) {
            if (numeroConcedido == numerosConcedidos[i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAlreadyListed(int numeroConcedido, ArrayList<Integer> numerosAleatorios) {
        boolean pass = false;
        for (int i = 0; i < numerosAleatorios.size(); i++) {
            if (numeroConcedido == numerosAleatorios.get(i)) {
                pass = true;
            }
        }
        return pass;
    }

}
