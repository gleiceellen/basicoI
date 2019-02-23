package br.com.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class Conta {

    private Long id;
    private TipoConta tipoConta;
    private Cliente cliente;
    private Double saldo;
    private Collection<Transacao> transacoes = new ArrayList<>();

    public Conta(TipoConta tipoConta, Cliente cliente, Double saldo) {
        this.id = Long.parseLong(UUID.randomUUID().toString());
        this.tipoConta = tipoConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public Collection<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(Collection<Transacao> transacoes) {
        this.transacoes = transacoes;
    }
}
