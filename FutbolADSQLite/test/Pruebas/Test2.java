/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Clases.Liga;
import Clases.Pais;
import CustomsListModels.CustomListModelLigas;
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
public class Test2 {
    
    CustomListModelLigas ligas = new CustomListModelLigas();
    
    public Test2() {
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

    // TODO add test methods here.
    public void aniadirLigas(int id, String nombre, int division, int id_pais){
        Liga a = new Liga();
        
        
        a.setID_liga(id + 1);
        a.setNombre(nombre);
        a.setDivision(division);
        a.setID_pais(id_pais);
        
        ligas.addLiga(a);
        
    }       
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void guardarLigas() {
        Liga p = new Liga();

        if(ligas.getSize() != 0){
            p = ligas.getLiga(ligas.getSize() - 1);
        }

        aniadirLigas(p.getID_liga(), "Santander", 4, 2);
     }
}
