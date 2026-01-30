package parteB.gestaoBiblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Livro livro1;
    Livro livro2;
    Livro livro3;
    Livro livro4;
    Livro livro5;
    Livro livro6;

    Biblioteca biblioteca;


    @BeforeEach
    void setUp() {
        livro1 = new Livro("Harry Potter 01", "JK Rowling", 1999, 350);
        livro2 = new Livro("Harry Potter 02", "JK Rowling", 2000, 375);
        livro3 = new Livro("Introdução a Java", "Joaquim", 1995, 800);
        livro4 = new Livro("Introdução a Portugol", "Joaquim", 2025, 3450);
        livro5 = new Livro("Introdução a Python", "Joaquim", 1998, 670);
        livro6 = new Livro("Geografia para Bebés", "Ricardo", 2007, 780);

        biblioteca = new Biblioteca();
    }

    @Test
    public void testAdicionarLivro() {
        assertEquals(0, biblioteca.contarLivros());

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        assertEquals(2, biblioteca.contarLivros());

        biblioteca.adicionarLivro(livro3);

        assertEquals(3, biblioteca.contarLivros());

        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);

        assertEquals(6, biblioteca.contarLivros());
    }

    @Test
    public void testPesquisarLivroPorTituloNaoExistente() {

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        assertNull(biblioteca.pesquisarLivroPorTitulo("A Biblia"));
        assertNull(biblioteca.pesquisarLivroPorTitulo("Grimm Brothers"));
    }

    @Test
    public void testPesquisarLivroPorTituloExistente() {

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);

        Livro livroPesquisado1 = biblioteca.pesquisarLivroPorTitulo("Introdução a Java");
        assertEquals("Joaquim", livroPesquisado1.getAutor());
        assertEquals(1995, livroPesquisado1.getAnoPublicacao());

        Livro livroPesquisado2 = biblioteca.pesquisarLivroPorTitulo("Geografia para Bebés");
        assertEquals("Ricardo", livroPesquisado2.getAutor());
        assertEquals(2007, livroPesquisado2.getAnoPublicacao());
    }

    @Test
    public void testRemoverLivroPorTitulo() {

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);

        biblioteca.removerLivroPorTitulo("Introdução a Portugol");

        assertNull(biblioteca.pesquisarLivroPorTitulo("Introdução a Portugol"));

        biblioteca.removerLivroPorTitulo("Introdução a Python");

        assertNull(biblioteca.pesquisarLivroPorTitulo("Introdução a Python"));
    }

    @Test
    public void testRemoverLivroPorTituloBibliotecaVazia() {

        biblioteca.removerLivroPorTitulo("Introdução a Portugol");

        assertNull(biblioteca.pesquisarLivroPorTitulo("Introdução a Portugol"));

        biblioteca.removerLivroPorTitulo("Harry Potter 02");

        assertNull(biblioteca.pesquisarLivroPorTitulo("Harry Potter 02"));
    }


    @Test
    public void testRemoverLivroPorTituloNaoExistente() {

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);

        biblioteca.removerLivroPorTitulo("O Principezinho");

        assertEquals(6,biblioteca.contarLivros());

        biblioteca.removerLivroPorTitulo("O Rei Leão");

        assertEquals(6,biblioteca.contarLivros());
    }


}