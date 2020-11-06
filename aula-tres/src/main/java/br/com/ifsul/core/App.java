package br.com.ifsul.core;

import java.util.ArrayList;
import java.util.List;
import br.com.ifsul.core.model.*;

public class App {
    public static void main(String[] args) {

        // Pessoa pessoa = new Pessoa();
        //Conta minhaConta = Conta.createConta("Rodrigo", 1, 171, BigDecimal.ONE);

        Pais pais = new Pais("Brasil", "BR");
        Estado estado = new Estado("Rio grande do Sul", "RS", pais );
        Cidade cidade = new Cidade("Bagé", "BGX", estado);
        Cidade cidade2 = new Cidade("Candiota", "CND", estado);
        Cidade cidade3 = new Cidade("Hulha Negra", "HNG", estado);
        List<Cidade> cidadeList = new ArrayList<>();
        cidadeList.add(cidade);
        cidadeList.add(cidade2);
        cidadeList.add(cidade3);

        estado.addCidade(cidadeList);

        System.out.println(estado.getCidade().toString());

    }
}
