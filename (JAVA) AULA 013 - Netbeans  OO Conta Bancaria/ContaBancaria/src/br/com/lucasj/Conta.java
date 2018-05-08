package br.com.lucasj;

import java.util.ArrayList;

public class Conta {

    private int numero;
    private int agencia;
    private String banco;
    private double saldo;
    private String titular;
    private ArrayList<String> LogConta;

    public Conta() {
        LogConta = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void addLog(String LogTexto) {
        this.LogConta.add(LogTexto);
    }

    public ArrayList<String> getLog() {
        return this.LogConta;
    }

}
