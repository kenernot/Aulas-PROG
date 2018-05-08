package br.com.lucasj;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CaixaEletronico {

    private Conta conta;

    public void iniciarSessao(Conta conta) {
        this.conta = conta;
    }

    public void depositar(double Valor) {
        if (isValidSession()) {
            this.conta.setSaldo(this.conta.getSaldo() + Valor);
            doLog(conta, Valor, "depósito");
        }
    }

    public void sacar(double Valor) {
        if (isValidSession()) {
            this.conta.setSaldo(this.conta.getSaldo() - Valor);
            doLog(conta, Valor, "saque");
        }
    }

    public void consultaSaldo() {
        if (isValidSession()) {
            System.out.println( "Agencia:\t" +this.conta.getAgencia()    + "\n"+
                                "Banco:\t\t"   +this.conta.getBanco()      + "\n"+
                                "Numero:\t\t"  +this.conta.getNumero()     + "\n"+
                                "Titular:\t" +this.conta.getTitular()    + "\n"+
                                "Saldo:\t\tR$"   +this.conta.getSaldo());
        }
    }

    public void imprimirExtrato() {
        if (isValidSession()) {
            ArrayList<String> myLog = this.conta.getLog();
            for (int i = 0; i < myLog.size(); i++) {
                System.out.println(myLog.get(i));
            }
        }
    }

    private boolean isValidSession() {
        if (this.conta == null) {
            System.out.println("Por favor inicie uma sessão!");
            return false;
        } else {
            return true;
        }
    }
    
    private void doLog(Conta conta, double value, String tipo) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        Date date = new Date();
        String dStr = dateFormat.format(date);
        String myLog = dStr + " - "+ tipo + ": \tR$"+value;
        conta.addLog(myLog);
    }
}
