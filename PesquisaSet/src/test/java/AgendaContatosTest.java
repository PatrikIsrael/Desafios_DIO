
import org.example.Data.AgendaContatos;
import org.example.Data.Contato;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaContatosTest {

    private AgendaContatos agendaContatos;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        agendaContatos = new AgendaContatos();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testAdicionarContato() {
        agendaContatos.adicionarContato("João", 123);
        assertEquals(1, agendaContatos.contatoSet.size());
    }

    @Test
    public void testPesquisarPorNome() {
        agendaContatos.adicionarContato("Maria", 456);
        agendaContatos.adicionarContato("Mariana", 789);
        Set<Contato> contatosEncontrados = agendaContatos.pesquisarPorNome("Mar");
        assertEquals(2, contatosEncontrados.size());
        assertTrue(contatosEncontrados.stream().anyMatch(c -> c.getNome().equals("Maria")));
        assertTrue(contatosEncontrados.stream().anyMatch(c -> c.getNome().equals("Mariana")));
    }

    @Test
    public void testAtualizarNumeroContatoExistente() {
        agendaContatos.adicionarContato("Pedro", 111);
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Pedro", 222);
        assertNotNull(contatoAtualizado);
        assertEquals(222, contatoAtualizado.getNumero());
    }

    @Test
    public void testAtualizarNumeroContatoInexistente() {
        agendaContatos.adicionarContato("Ana", 333);
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Mariana", 444); // nome inexistente
        assertNull(contatoAtualizado);
    }

    @Test
    public void testExibirContato() {
        agendaContatos.adicionarContato("Carlos", 555);
        agendaContatos.adicionarContato("Cristina", 666);

        // Capturando a saída do método exibirContato()
        agendaContatos.exibirContato();
        String output = outputStreamCaptor.toString().trim();

        assertTrue(output.contains("Contato{nome='Carlos', numero=555}"));
        assertTrue(output.contains("Contato{nome='Cristina', numero=666}"));
    }
}
