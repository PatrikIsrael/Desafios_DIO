
import org.example.Data.CatalogoLivros;
import org.example.Data.Livro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



public class CatalogoLivrosTest {

    private CatalogoLivros catalogoLivros;

    @BeforeEach
    public void setUp() {
        catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Apanhador no Campo de Centeio", "J.D. Salinger", 1951);
        catalogoLivros.adicionarLivro("O Sol é para Todos", "Harper Lee", 1960);
        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
    }

    @Test
    public void testAdicionarLivro() {
        catalogoLivros.adicionarLivro("Admirável Mundo Novo", "Aldous Huxley", 1932);
        List<Livro> livros = catalogoLivros.pesquisarPorAutor("Aldous Huxley");
        assertEquals(1, livros.size());
        assertEquals("Admirável Mundo Novo", livros.get(0).getTitulo());
    }

    @Test
    public void testPesquisarPorAutor() {
        List<Livro> livros = catalogoLivros.pesquisarPorAutor("George Orwell");
        assertEquals(2, livros.size());
        assertTrue(livros.stream().anyMatch(l -> l.getTitulo().equals("1984")));
        assertTrue(livros.stream().anyMatch(l -> l.getTitulo().equals("A Revolução dos Bichos")));
    }

    @Test
    public void testPesquisarPorIntervaloAno() {
        List<Livro> livros = catalogoLivros.pesquisarPorIntervaloAno(1940, 1950);
        assertEquals(2, livros.size());
        assertTrue(livros.stream().anyMatch(l -> l.getTitulo().equals("1984")));
        assertTrue(livros.stream().anyMatch(l -> l.getTitulo().equals("A Revolução dos Bichos")));
    }

    @Test
    public void testPesquisarPorTitulo() {
        List<Livro> livros = catalogoLivros.pesquisarPorTitulo("O Sol é para Todos");
        assertEquals(1, livros.size());
        assertEquals("O Sol é para Todos", livros.get(0).getTitulo());
    }
}

