package br.com.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;import javax.swing.undo.CannotUndoException;

public class Cliente {

    private Long id;
    private String nome;
    private String email;
    private LocalDate dataNascimento;

    // TODO Analisar se deve utilizar uma Collection ou um SET.
    private Collection<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String email, LocalDate dataNascimento) {
        this.id = Long.parseLong(UUID.randomUUID().toString());
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Collection<Conta> getContas() {
        return contas;
    }

    public void addConta(final Conta conta) {
        // TODO verificar se o cliente já tem uma conta para o mesmo tipo, se tiver lança uma exceção
    	if(this.getContaPorTipo(conta.getTipoConta())==null) {
    		throw new IllegalArgumentException("O cliente já possui uma conta desse tipo!");
    	}
        this.getContas().add(conta);
    }

    public Conta getContaPorTipo(TipoConta tipoConta) {
        // TODO obter a conta por tipo, pode fazer um forEach ou trabalhar com Stream com Java8
    	
    	List<Conta> contas = (List<Conta>) this.getContas();
    	for( Conta c : contas ) {
    		if(c.getTipoConta() == tipoConta) {
    			return c;
    		} else {
    			System.out.println("Não existe conta com esse tipo!");
    			return null;
    		}
    	}
		return null;
    }
}
