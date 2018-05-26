package br.com.lucasj;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class EX007 {

    public EX007() throws InterruptedException {
        String[] numeros = new String[6];

        for (int i = 0; i < numeros.length; i++) {
            boolean pass = false;
            while (!pass) {

                String temp = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número!");
                if (Utilidades.isInt(temp)) {
                    int num = Integer.parseInt(temp);
                    if (num >= 0 && num <= 60 && !Utilidades.isAlreadyListed(num, numeros)) {
                        pass = true;
                        numeros[i] = temp;
                    }
                }
            }
        }
        Arrays.sort(numeros);
        String tipo = JOptionPane.showInputDialog("Digite 'S' caso queira ver quantas vezes seriam necessários um sorteio para conseguir acertar! \r\n"
                + "Ou digite qualquer outra coisa para fazer um teste de 1x 1000x 10000x 100000x 1000000x").toUpperCase();

        if (tipo.equals("S") || tipo.equals("'S'")) {
            double cont = 0;
            boolean deuCerto = false;
            while (!deuCerto) {
                cont++;
                if (doRoll(numeros)) {
                    deuCerto = true;
                    JOptionPane.showMessageDialog(null,String.format("%f%n", cont));
                }
            }
        } else {
            int count = 0;
            if (doRoll(numeros)) {
                count++;
            }
            String msg = "";
            msg += ("1x = " + count + " completo acerto\r\n");

            int mult = 100;
            for (int i = 0; i < 5; i++) {
                mult *= 10;
                count = 0;
                for (int y = 0; y < mult; y++) {

                    if (doRoll(numeros)) {
                        count++;
                    }
                }
                msg += (mult + "x = " + count + " completos acertos\r\n");
            }
            JOptionPane.showMessageDialog(null, msg);
        }

    }

    private boolean doRoll(String[] numeros) throws InterruptedException {
        boolean pass = false;
        Random ran = new Random();

        String[] numerosAleatorios = new String[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            boolean randomPass = false;
            while (!randomPass) {
                String myStringo = String.valueOf(ran.nextInt(61));
                if (!Utilidades.isAlreadyListed(myStringo, numerosAleatorios)) {
                    numerosAleatorios[i] = myStringo;
                    randomPass = true;
                }
            }
        }

        Arrays.sort(numerosAleatorios);

        // ShowArray
        if (Arrays.equals(numeros, numerosAleatorios)) {
            pass = true;
        }
        //

        /*
        for (int i = 0; i < numeros.length; i++) {
            if (Utilidades.isAlreadyListed(numeros[i], numerosAleatorios)) {
                pass = true;
            } else {
                pass = false;
                break;
            }
        }
         */
        return pass;
    }

}
