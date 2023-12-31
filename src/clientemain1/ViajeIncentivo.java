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
public class ViajeIncentivo extends Viaje {

    /**
     * Empresa que patrocina el viaje al empleado
     */
    private String empresa;
//Constructor, getters and setters

    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa) {
        setOrigen(origen);
        setDestino(destino);
        setCosto(costo);
        setFechaSalida(fechaSalida);
        setFechaLlegada(fechaLlegada);
        this.empresa = empresa;
    }

    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + getEmpresa();
    }

    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
