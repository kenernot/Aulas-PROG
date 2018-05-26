package br.com.lucasj;

import javax.swing.JOptionPane;

public class EX003 {

    public EX003() {
        String operacao = "";
        String msg = "Digite o símbolo da operação que desejar + - * /\r\n"
                + "Ou digite 0 para cancelar!";
        while (!operacao.equals("0")) {
            operacao = JOptionPane.showInputDialog(msg);
            switch (operacao) {
                case "+":
                    doOperacoes("+");
                    break;
                case "-":
                    doOperacoes("-");
                    break;
                case "*":
                    doOperacoes("*");
                    break;
                case "/":
                    doOperacoes("/");
                    break;
                default:
                    break;
            }
        }
    }

    private double doOperacoes(String tipo) {
        String[] numeros = new String[2];
        Double resultado = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            while (!Utilidades.isNumeric(numeros[i])) {
                numeros[i] = JOptionPane.showInputDialog("Digite o " + (i+1) + "º número!");
            }
        }

        if (tipo.equals("+")) {
            resultado = Double.parseDouble(numeros[0]) + Double.parseDouble(numeros[1]);
        } else if (tipo.equals("-")) {
            resultado = Double.parseDouble(numeros[0]) - Double.parseDouble(numeros[1]);
        } else if (tipo.equals("*")) {
            resultado = Double.parseDouble(numeros[0]) * Double.parseDouble(numeros[1]);
        } else if (tipo.equals("/")) {
            resultado = Double.parseDouble(numeros[0]) / Double.parseDouble(numeros[1]);
        } else {
            System.out.println("DEU RUIM!");
        }
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

}
