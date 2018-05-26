package br.com.lucasj;

import javax.swing.JOptionPane;

public class TrabalhoGreve {

    public static void main(String[] args) {
        String msg = "Digite o número do exercício que deseja abrir: \r\n"
                + "1 - Teste de variáveis \r\n"
                + "2 - o mesmo que o de cima com messageDialog \r\n"
                + "3 - Operações usando JOptionPane \r\n"
                + "4 - Recebe três números do usuário e mostra em ordem crescente \r\n"
                + "5 - Brincadeira do professor \r\n"
                + "6 - Recebe o nome de três postos e mostra o com menor valor \r\n"
                + "7 - Sorteio \r\n"
                + "8 - Recebe nomes e mostra invertida ordem \r\n"
                + "9 - Calcula KM/L \r\n"
                + "10 - Calcular litro \r\n"
                + "Qualquer outra coisa, encerra.";

        boolean encerrar = false;
        while (!encerrar) {
            String aString = JOptionPane.showInputDialog(msg);
            switch (aString) {
                case "1":
                    EX001 ex1 = new EX001();
                    break;
                case "2":
                    EX002 ex2 = new EX002();
                    break;
                case "3":
                    EX003 ex3 = new EX003();
                    break;
                case "4":
                    EX004 ex4 = new EX004();
                    break;
                case "5":
                    EX005 ex5 = new EX005();
                    break;
                case "6":
                    EX006 ex6 = new EX006();
                    break;
                case "7":
                    EX007 ex7 = new EX007();
                    break;
                case "8":
                    EX008 ex8 = new EX008();
                    break;
                case "9":
                    EX009 ex9 = new EX009();
                    break;
                case "10":
                    EX010 ex10 = new EX010();
                    break;
                default:
                    encerrar = true;
                    break;
            }
        }

    }

}
