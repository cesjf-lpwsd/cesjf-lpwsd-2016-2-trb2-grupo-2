/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class AtividadeTest {
    
    public AtividadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class Atividade.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Atividade instance = new Atividade();
        instance.setNome("JoãoA");
        String result = instance.getNome();
        assertEquals("JoãoA", result);

    }

    /**
     * Test of setNome method, of class Atividade.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Atividade instance = new Atividade();
        instance.setNome(nome);
        assertEquals("", instance.getNome());
    }

    /**
     * Test of getMensalidade method, of class Atividade.
     */
    @Test
    public void testGetMensalidade() {
        System.out.println("getMensalidade");
        Atividade instance = new Atividade();
        instance.setMensalidade(250.0f);
        float result = instance.getMensalidade();
        assertEquals(250.0f, result, 0.0);
    }

    /**
     * Test of setMensalidade method, of class Atividade.
     */
    @Test
    public void testSetMensalidade() {
        System.out.println("setMensalidade");
        float mensalidade = 1.0F;
        Atividade instance = new Atividade();
        instance.setMensalidade(mensalidade);
        assertEquals(mensalidade, instance.getMensalidade(),1000000.1F);
    }

    /**
     * Test of isIsAtividadeAberta method, of class Atividade.
     */
    @Test
    public void testIsIsAtividadeAberta() {
        System.out.println("isIsAtividadeAberta");
        Atividade instance = new Atividade();
        instance.setAtividadeAberta(true);
        boolean expResult = true;
        boolean result = instance.isAtividadeAberta();
        assertEquals(expResult, result);

    }

    /**
     * Test of setIsAtividadeAberta method, of class Atividade.
     */
    @Test
    public void testSetIsAtividadeAberta() {
        System.out.println("setIsAtividadeAberta");
        Atividade instance = new Atividade();
        instance.setAtividadeAberta(true);
        assertTrue(instance.isAtividadeAberta());
        
    }

    /**
     * Test of getId method, of class Atividade.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Atividade instance = new Atividade();
        instance.setId(123L);
        Long result = instance.getId();
        assertEquals(123L, result,0.0000000000001);
    }

    /**
     * Test of setId method, of class Atividade.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = 123L;
        Mensalidade instance = new Mensalidade();
        instance.setId(id);
        Long resultado = instance.getId();
        assertEquals(id, resultado);
    }
    
}
