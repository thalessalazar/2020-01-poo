package br.com.ifsul.core;

import java.math.BigDecimal;
import br.com.ifsul.core.model.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // Pessoa pessoa = new Pessoa();
        Conta minhaConta = Conta.createConta("Rodrigo", 1, 171, BigDecimal.ONE);

        Pais pais = new Pais("Brasil", "BR");
        Estado estado = new Estado("Rio grande do Sul", "RS", pais );
        Cidade cidade = new Cidade("Bagé", "BG", estado);
        Pessoa pessoaUm = new Pessoa("Thales Salazar" , "07/06/2000", cidade);

        System.out.println(pessoaUm);
        System.out.println(estado);
        System.out.println(cidade);
        System.out.println(pais);
    }
}
