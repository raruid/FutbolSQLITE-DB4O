/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Clases.Liga;
import CustomsListModels.CustomListModelLigas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
public class Test5 {
    
    CustomListModelLigas ligas = new CustomListModelLigas();
    
    public Test5() {
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
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void escribirLigas() throws FileNotFoundException, IOException{
        
        File borrar = new File("FichLigas.txt");
        borrar.delete();        
        File fichero = new File("FichLigas.txt");//declara el fichero
        FileOutputStream fileout = new FileOutputStream(fichero, true);  //crea el flujo de salida
        ObjectOutputStream dataOS = new ObjectOutputStream(fileout); 
            
        Liga l = new Liga();    
        for (int i = 0; i < ligas.getSize(); i++) {
            l = ligas.getLiga(i);
            dataOS.writeObject(l); //escribo la persona en el fichero
        }
    } 
}
