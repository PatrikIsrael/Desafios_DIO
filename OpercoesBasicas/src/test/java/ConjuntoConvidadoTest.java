

import org.example.Data.ConjuntoConvidados;
import org.example.Data.Convidado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ConjuntoConvidadoTest {

    private ConjuntoConvidados conjuntoConvidados;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        conjuntoConvidados = new ConjuntoConvidados();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testAdicionarConvidado() {
        conjuntoConvidados.adicionarConvidado("João", 123);
        assertEquals(1, conjuntoConvidados.contarConvidado());
    }

    @Test
    public void testRemoverConvidadoExistente() {
        conjuntoConvidados.adicionarConvidado("Maria", 456);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(456);
        assertEquals(0, conjuntoConvidados.contarConvidado());
    }

    @Test
    public void testRemoverConvidadoInexistente() {
        conjuntoConvidados.adicionarConvidado("Pedro", 789);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(999); // código que não existe
        assertEquals(1, conjuntoConvidados.contarConvidado());
    }

    @Test
    public void testExibirConvidados() {
        conjuntoConvidados.adicionarConvidado("Ana", 111);
        conjuntoConvidados.adicionarConvidado("Carlos", 222);

        // Capturando a saída do método exibirConvidado()
        conjuntoConvidados.exibirConvidado();
        String output = outputStreamCaptor.toString().trim();

        assertTrue(output.contains("Convidado{nome='Ana', codigoConvite=111}"));
        assertTrue(output.contains("Convidado{nome='Carlos', codigoConvite=222}"));
    }
}
