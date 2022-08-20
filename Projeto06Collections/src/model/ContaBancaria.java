package Projeto06Collections.src.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {

    // #region Attributes
    protected String agencia;
    protected String conta;
    protected Integer digito;
    protected double saldo;
    protected Date dataAbertura;
    protected ArrayList<Movimentacao> movimentacoes;

    protected Double VALOR_MINIMO_DEPOSITO = 10.0;
    // #endregion

    // #region Constructors
    public ContaBancaria(String agencia, String conta, Integer digito, double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();

        // Caso não estanciar, exception de nullpointerException
        this.movimentacoes = new ArrayList<Movimentacao>();

        // Cria a primaira movimentação
        Movimentacao movimentacao = new Movimentacao("Abertura de Conta", saldoInicial);

        // Salva a movimentação dentro do array de movitações
        // Inicia o extrato bancário
        this.movimentacoes.add(movimentacao);
    }
    
    // #endregion

    // #region Getters and setters
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    // #endregion

    // #region Método
    public void depositar(Double valor) {

        // Verifica se o valor de depósito é menor que o valor mínimo.
        // Se for, não executa a operação de depósito
        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("O valor mínimo de depósito é R$ " + VALOR_MINIMO_DEPOSITO);
        }

        // Efetua o depósito, somando o valor ao saldo.
        this.saldo += valor;

        // Movimentação no extrato
        Movimentacao movimentacao = new Movimentacao("Depósito", valor);
        this.movimentacoes.add(movimentacao);
    }

    public Double sacar(Double valor) {
        // Verifica se o valor é maior que o saldo.
        // Se for, a operação não é realizada.
        if (valor > saldo) {
            throw new InputMismatchException("O saldo é insuficiente.");
        }

        // Executa a operação de saque, a partir do saldo.
        this.saldo -= valor;

        // Movimentação no extrato
        Movimentacao movimentacao = new Movimentacao("Retirada de valor", valor);
        this.movimentacoes.add(movimentacao);

        // Retorna o valor sacado ao usuário.
        return valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino) {

        // Efetua um saque na conta atual.
        this.sacar(valor);

        // Efetua o depósito na conta de destino.
        contaDestino.depositar(valor);

    }

    // #endregion

    // Método abstrato que obriga as classes, que a herdam, de o implementarem
    public abstract void imprimirExtrato();

}
