package com.bank;

import com.interfaces.IConta;

public abstract class ContaGlobal implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 2;

    protected int agencia;
    protected int numero;
    protected double saldo;


    public ContaGlobal() {
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;

    }

    @Override
    public void sacar(double valor) throws Exception {
        if (saldo < valor) {
            throw new Exception("saldo insuficiente!");
        }
        this.saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta conta) throws Exception {

        this.sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public void info() {

        System.out.printf("\nNúmero da Conta ---- %d\n", numero);
        System.out.printf("Agência ---- %d\n", agencia);
        System.out.printf("Saldo ---- %.2f R$\n", saldo);
        System.out.println("------------------------------\n\n");


    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
}
