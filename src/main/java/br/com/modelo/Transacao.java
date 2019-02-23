package br.com.modelo;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transacao {

    private Long id;
    private Conta contaPagadora;
    private Conta contaRecebedora;
    private LocalDateTime dataTransacao;
    private Double valorTransacao;

    public Transacao(Conta contaPagadora, Conta contaRecebedora, Double valorTransacao) {
        this.id = Long.parseLong(UUID.randomUUID().toString());
        this.contaPagadora = contaPagadora;
        this.contaRecebedora = contaRecebedora;
        this.dataTransacao = LocalDateTime.now();
        this.valorTransacao = valorTransacao;
    }

    public void realizaTransacao(Conta contaPagadora, Conta contaRecebedora, Double valor) {
        // TODO Fazer operação de transacao, se o saldo da pagodora for menor que o valor que deseja transferir deve
        // lançar uma exceção

        //Se o valor for negativo, também deve levantar uma exceção
    }
}
