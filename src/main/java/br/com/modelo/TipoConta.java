package br.com.modelo;

public enum TipoConta {

    CONTA_CORRENT("Conta Corrente"),
    POUPANCA("Poupança");
    // TODO será que pode ter mais tipos de contas ?

    private String tipoConta;

    TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    // TODO Criar um método que retorne o Enum passando uma String como parametro

}
