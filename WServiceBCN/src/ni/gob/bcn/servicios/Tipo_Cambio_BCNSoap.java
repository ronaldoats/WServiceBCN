/**
 * Tipo_Cambio_BCNSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ni.gob.bcn.servicios;

public interface Tipo_Cambio_BCNSoap extends java.rmi.Remote {

    /**
     * Recupera el tipo de cambio del día solicitado.
     * Parametros: (Año, Mes, Día)
     */
    public double recuperaTC_Dia(int ano, int mes, int dia) throws java.rmi.RemoteException;

    /**
     * Recupera el detalle completo de la base de tipos de cambio
     * para el mes solicitado.
     * Parametros: (Año, Mes)
     */
    public ni.gob.bcn.servicios.RecuperaTC_MesResponseRecuperaTC_MesResult recuperaTC_Mes(int ano, int mes) throws java.rmi.RemoteException;
}
