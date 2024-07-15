package edu.renzosa.contaBanco;

public class Conta {

    private String agencia;
    private Integer numero;
    private String nomeCliente;
    private Double saldo;

    public Conta() {

    }

    public Conta(String agencia, int numero, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Agencia: " + this.agencia + " | Conta: " + this.numero;
    }

    public String status() {
        return "Agencia: " + this.agencia + " | Conta: " + this.numero + "\r\nNome do Cliente: " + this.nomeCliente + "\r\nSaldo: " + this.saldo;
    }

    public void sacar(Double saque) throws Exception {
        if (saque <= 0) throw new Exception("Valor do saque deve ser positivo!");
        if (saque > this.saldo) throw new Exception("Sem saldo suficiente para o saque!");
        else this.saldo = this.saldo - saque;
    }

    public void depositar(Double deposito) throws Exception {
        if (deposito <= 0) throw new Exception("Valor do deposito deve ser positivo!");
        else this.saldo = this.saldo + deposito;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    

}