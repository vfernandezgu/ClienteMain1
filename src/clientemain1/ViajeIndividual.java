/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientemain1;

import java.util.Date;

/**
 *
 * @author Valentina Fernández y Andres Collazos
 */
public class ViajeIndividual extends Viaje {

    // Constructor
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        setOrigen(origen);
        setDestino(destino);
        setCosto(costo);
        setFechaSalida(fechaSalida);
        setFechaLlegada(fechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
//No se sobreescribe cualquierMetodo2()
}
