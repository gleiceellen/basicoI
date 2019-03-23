package br.com;

import br.com.modelo.Cliente;
import br.com.modelo.Conta;
import br.com.modelo.TipoConta;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Cliente cli = new Cliente("Gleice", "gleice@gmail.com", LocalDate.of(1988, 10, 6));

        Conta c1 = new Conta(TipoConta.CONTA_CORRENT, cli, 0.00);
        cli.addConta(c1);
        cli.exibirCliente();
        cli.exibirContas();
    }
}
