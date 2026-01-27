package parteB.gestaoBiblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    Livro livro1;
    Livro livro2;

    @BeforeEach
    void setUp() {
        livro1 = new Livro("Os Maias", "Eça Queiros", 1918, 850);
        livro2 = new Livro("Harry Potter","JK Rowling",1999,540);
    }

    @Test
    public void testGetTitulo() {
        assertEquals("Os Maias",livro1.getTitulo());
        assertEquals("Harry Potter",livro2.getTitulo());
    }

    @Test
    public void testGetAutor() {
        assertEquals("Eça Queiros",livro1.getAutor());
        assertEquals("JK Rowling",livro2.getAutor());
    }

    @Test
    public void testAnoPublicacao() {
        assertEquals(1918,livro1.getAnoPublicacao());
        assertEquals(1999,livro2.getAnoPublicacao());
    }

    @Test
    public void testAlterarTitulo(){
        livro1.alterarTitulo("O Principezinho");
        assertEquals("O Principezinho",livro1.getTitulo());

        livro2.alterarTitulo("Java Heads First");
        assertEquals("Java Heads First",livro2.getTitulo());

    }

    @Test
    public void testEmprestarDisponiveis(){
        assertTrue(livro1.estaDisponivel());
        assertTrue(livro2.estaDisponivel());

        livro1.emprestar();

        assertFalse(livro1.estaDisponivel());
        assertTrue(livro2.estaDisponivel());

        livro2.emprestar();

        assertFalse(livro1.estaDisponivel());
        assertFalse(livro2.estaDisponivel());
    }

    @Test
    public void testEmprestarIndisponiveis(){
        assertTrue(livro1.estaDisponivel());
        assertTrue(livro2.estaDisponivel());

        livro1.emprestar();
        livro2.emprestar();

        assertFalse(livro1.estaDisponivel());
        assertFalse(livro2.estaDisponivel());

        livro1.emprestar();
        livro2.emprestar();

        assertFalse(livro1.estaDisponivel());
        assertFalse(livro2.estaDisponivel());
    }
}