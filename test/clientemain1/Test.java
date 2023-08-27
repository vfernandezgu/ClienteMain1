/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientemain1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author Valentina Fernández y Andres collazos
 */
public class Test {
    
    public Test(){
        
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
    
    //@Test
    
    @org.junit.Test
    public void testViajeFamiliar() throws ParseException {
        ViajeFamiliar viaje1;

        viaje1 = new ViajeFamiliar("Popayan", "Bogota", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);

        assertEquals(viaje1.getOrigen(), "Popayan");
        assertEquals(viaje1.getDestino(), "Bogota");
        assertEquals(viaje1.getCosto(), 1250000);
        assertEquals(viaje1.getFechaSalida(),new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"));
        assertEquals(viaje1.getFechaLlegada(),new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"));
        assertEquals(viaje1.getFamilia(), 5);

    }
    
    @org.junit.Test
    public void testViajeIncentivo() throws ParseException {
        ViajeIncentivo viaje1;

        viaje1 = new ViajeIncentivo("Popayan", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");

        assertEquals(viaje1.getOrigen(), "Popayan");
        assertEquals(viaje1.getDestino(), "Medellin");
        assertEquals(viaje1.getCosto(), 2100000);
        assertEquals(viaje1.getFechaSalida(),new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"));
        assertEquals(viaje1.getFechaLlegada(),new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        assertEquals(viaje1.getEmpresa(),"Emtel");

    }
    
    @org.junit.Test
    public void testViajeIndividual() throws ParseException {
        ViajeIndividual viaje1;

        viaje1 = new ViajeIndividual("Popayan", "San Andres", 4250000,
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
            SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));

        assertEquals(viaje1.getOrigen(), "Popayan");
        assertEquals(viaje1.getDestino(), "San Andres");
        assertEquals(viaje1.getCosto(), 4250000);
        assertEquals(viaje1.getFechaSalida(),new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"));
        assertEquals(viaje1.getFechaLlegada(),new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
    }
    
    @org.junit.Test
    public void testViajeTodoIncluido() throws ParseException {
        ViajeTodoIncluido viaje1;

        viaje1 = new ViajeTodoIncluido("Popayan", "Cartagena", 7350000,
            new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new
            SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));

        assertEquals(viaje1.getOrigen(), "Popayan");
        assertEquals(viaje1.getDestino(), "Cartagena");
        assertEquals(viaje1.getCosto(), 7350000);
        assertEquals(viaje1.getFechaSalida(),new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"));
        assertEquals(viaje1.getFechaLlegada(),new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));

    }
}
