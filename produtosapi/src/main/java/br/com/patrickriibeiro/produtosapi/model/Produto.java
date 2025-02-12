package br.com.patrickriibeiro.produtosapi.model;

import lombok.Data;

@Data
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private Double preco;

}
