package br.com.lucasj;


public class ContaBancaria {


    public static void main(String[] args) {
        Conta c = new Conta();
        c.setAgencia(0726);
        c.setBanco("Sicredi");
        c.setNumero(380040);
        c.setTitular("Johaan");
        c.setSaldo(1000);
        
        CaixaEletronico ce = new CaixaEletronico();
        ce.iniciarSessao(c);
        ce.sacar(250);
        ce.depositar(1500);
        ce.sacar(222);
        ce.depositar(7500);
        ce.depositar(245);
        ce.sacar(6546);
        System.out.println(c.getSaldo());
        ce.imprimirExtrato();
        ce.consultaSaldo();
    }
    
}
