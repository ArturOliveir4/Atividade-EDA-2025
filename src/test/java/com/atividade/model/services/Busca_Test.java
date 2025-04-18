package com.atividade.model.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Busca_Test {

    private final int[] numerosOrdenados = {
        1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
    };

    private final Busca_IF busca = new Busca();

    
    //Testando com valor encontrado...

    @Test
    public void testBuscaLinearIterativa() throws Exception {
        long inicio = System.nanoTime();
        assertTrue( busca.buscaLinear_iterativa(numerosOrdenados, 10) );
        long fim = System.nanoTime();
        System.out.println("Tempo de execução da busca Linear Interativa com valor existente: " + (fim - inicio) + " nanosegundos");
    }
    
    @Test
    public void testBuscaLinearRecursiva() throws Exception {
        long inicio = System.nanoTime();
    	assertTrue( busca.buscaLinear_recursiva(numerosOrdenados, 10) );
        long fim = System.nanoTime();
        System.out.println("Tempo de execução da busca Linear Recursiva com valor existente: " + (fim - inicio) + " nanosegundos");
    }
    
    @Test
    public void testBuscaBinariaIterativa() throws Exception {
        long inicio = System.nanoTime();
    	assertTrue( busca.buscaBinaria_iterativa(numerosOrdenados, 10) );
        long fim = System.nanoTime();
        System.out.println("Tempo de execução da busca Binária Interativa com valor existente: " + (fim - inicio) + " nanosegundos");
    }

    @Test
    public void testBuscaBinariaRecursiva() throws Exception {
        long inicio = System.nanoTime();
    	assertTrue( busca.buscaBinaria_recursiva(numerosOrdenados, 10) );
        long fim = System.nanoTime();
        System.out.println("Tempo de execução da busca Binária Recursiva com valor existente: " + (fim - inicio) + " nanosegundos");
    }

    @Test
    public void testBuscaLinearIterativa2Pontas() throws Exception {
        long inicio = System.nanoTime();
    	assertTrue( busca.buscaLinear_iterativa_duasPontas(numerosOrdenados, 10) );
        long fim = System.nanoTime();
        System.out.println("Tempo de execução da busca Linear Interativa 2 pontas com valor existente: " + (fim - inicio) + " nanosegundos");
    }
    
    //Testando com valor inexistente...
    
    @Test
    public void testBuscaLinearIterativa_valorInexistente() throws Exception {
        long inicio = System.nanoTime();
    	assertFalse( busca.buscaLinear_iterativa(numerosOrdenados, -1) );
        long fim = System.nanoTime();
        System.out.println("Tempo de execução da busca Linear Iterativa com valor inexistente: " + (fim - inicio) + " nanosegundos");
    }
    
    @Test
    public void testBuscaLinearRecursiva_valorInexistente() throws Exception {
        long inicio = System.nanoTime();
    	assertFalse( busca.buscaLinear_recursiva(numerosOrdenados, -1) );
        long fim = System.nanoTime();
        System.out.println("Tempo de execução da busca Linear Recursiva com valor inexistente: " + (fim - inicio) + " nanosegundos");
    }
    
    @Test
    public void testBuscaBinariaIterativa_valorInexistente() throws Exception {
        long inicio = System.nanoTime();
    	assertFalse( busca.buscaBinaria_iterativa(numerosOrdenados, -1) );
        long fim = System.nanoTime();
        System.out.println("Tempo de execução da busca Binária Iterativa com valor inexistente: " + (fim - inicio) + " nanosegundos");
    }

    @Test
    public void testBuscaBinariaRecursiva_valorInexistente() throws Exception {
        long inicio = System.nanoTime();
    	assertFalse( busca.buscaBinaria_recursiva(numerosOrdenados, -1) );
        long fim = System.nanoTime();
        System.out.println("Tempo de execução da busca Binária Recursiva com valor inexistente: " + (fim - inicio) + " nanosegundos");
    }

    @Test
    public void testBuscaLinearIterativa2Pontas_valorInexistente() throws Exception {
        long inicio = System.nanoTime();
    	assertFalse( busca.buscaLinear_iterativa_duasPontas(numerosOrdenados, -1) );
        long fim = System.nanoTime();
        System.out.println("Tempo de execução da busca Linear Iterativa 2 pontas com valor inexistente: " + (fim - inicio) + " nanosegundos");
    }
}
