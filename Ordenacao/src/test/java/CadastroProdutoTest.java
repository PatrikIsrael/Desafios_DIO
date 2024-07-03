
import org.example.Data.CadastroProduto;
import org.example.Data.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CadastroProdutoTest {

    private CadastroProduto cadastroProduto;

    @BeforeEach
    public void setUp() {
        cadastroProduto = new CadastroProduto();
    }

    @Test
    public void testAdicionarProduto() {
        cadastroProduto.adicionarProduto("Notebook", 123456, 3500.0, 10);
        Set<Produto> produtos = cadastroProduto.exibirProdutoPorNome();
        assertEquals(1, produtos.size());
        assertTrue(produtos.stream().anyMatch(p -> p.getNome().equals("Notebook")));
    }

    @Test
    public void testExibirProdutoPorNome() {
        cadastroProduto.adicionarProduto("Mouse", 789012, 50.0, 20);
        cadastroProduto.adicionarProduto("Teclado", 345678, 150.0, 15);

        Set<Produto> produtosPorNome = cadastroProduto.exibirProdutoPorNome();
        assertEquals(2, produtosPorNome.size());
        assertTrue(produtosPorNome.stream().anyMatch(p -> p.getNome().equals("Mouse")));
        assertTrue(produtosPorNome.stream().anyMatch(p -> p.getNome().equals("Teclado")));
    }

    @Test
    public void testExibirProdutoPorPreco() {
        cadastroProduto.adicionarProduto("Monitor", 111222, 1200.0, 5);
        cadastroProduto.adicionarProduto("HD Externo", 333444, 400.0, 8);
        cadastroProduto.adicionarProduto("SSD", 555666, 300.0, 10);

        Set<Produto> produtosPorPreco = cadastroProduto.exibirProdutoPorPreco();
        assertEquals(3, produtosPorPreco.size());

        // Verificar a ordem dos produtos por preço usando TreeSet
        Produto[] produtosArray = produtosPorPreco.toArray(new Produto[0]);
        assertEquals("SSD", produtosArray[0].getNome());
        assertEquals("HD Externo", produtosArray[1].getNome());
        assertEquals("Monitor", produtosArray[2].getNome());
    }
}
