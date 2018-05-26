
package br.com.lucasj;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author lukas
 */
public class HelloWorld2 {

    public static void main(String[] args) {
        int numero = 0;
        Random ran = new Random();
        int meuIntAleatorio = ran.nextInt();
        System.out.println("Hello world");
        JOptionPane.showMessageDialog(null, "Teste");
    }
    
}
