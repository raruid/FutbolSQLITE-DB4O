/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Clases.Pais;
import CustomsListModels.CustomListModelPaises;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class Test1 {
    
    CustomListModelPaises paises = new CustomListModelPaises();
    
    public Test1() {
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

    public void aniadirPaises(Pais p, String nombre, String zona_horaria, String continente){
        Pais a = new Pais();
        
        a.setID_pais(p.getID_pais() + 1);
        a.setNombre(nombre);
        a.setZona_horaria(zona_horaria);
        a.setContinente(continente);
        
        int tamano = paises.getSize();
        paises.addPais(a);
        Assert.assertEquals(paises.getSize(), tamano+1);
    }
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void guardarPaises() {
        Pais p = new Pais();

        if(paises.getSize() != 0){
            p = paises.getPais(paises.getSize() - 1);
        }

        aniadirPaises(p, "España", "CMT", "Europa");
     }
}
