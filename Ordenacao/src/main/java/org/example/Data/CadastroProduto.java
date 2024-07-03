package org.example.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new Produto.ComparadorPorPreco());
        produtoPorPreco.addAll(produtoSet); // Corrigido: adicionar elementos corretamente
        return produtoPorPreco;
    }

    // Getters e Setters se necessário
    public Set<Produto> getProdutoSet() {
        return produtoSet;
    }

    public void setProdutoSet(Set<Produto> produtoSet) {
        this.produtoSet = produtoSet;
    }
}
