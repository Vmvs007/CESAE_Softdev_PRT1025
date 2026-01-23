package parteA.gestaoBancaria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria conta1;
    ContaBancaria conta2;

    @BeforeEach
    void setUp() {
        conta1 = new ContaBancaria("Joaquim",0,2025,"PT","PT50 0000 1333 4444");
        conta2 = new ContaBancaria("Joana",1000,2024,"ES","ES40 0000 1333 4444");

    }

    @Test
    public void consultarSaldoTest(){
        assertEquals(0,conta1.consultarSaldo());
        assertEquals(1000,conta2.consultarSaldo());
    }

    @Test
    public void testDepositarPositivo(){
        conta1.depositar(150);
        assertEquals(150,conta1.consultarSaldo());

        conta2.depositar(300);
        assertEquals(1300,conta2.consultarSaldo());
    }

    @Test
    public void testDepositarZero(){

    }

    @Test
    public void testDepositarNegativo(){

    }

    @Test
    public void testLevantarValido(){
        conta2.levantar(200);
        assertEquals(800,conta2.consultarSaldo());
    }


}