package com.interfaces;

public interface IConta {
 public void sacar(double valor) throws Exception;
 public void depositar(double valor);
 public void transferir(double valor, IConta conta) throws Exception;

 public void info();

}
