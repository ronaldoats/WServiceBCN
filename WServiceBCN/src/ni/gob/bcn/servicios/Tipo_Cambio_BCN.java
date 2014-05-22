/**
 * Tipo_Cambio_BCN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ni.gob.bcn.servicios;

public interface Tipo_Cambio_BCN extends javax.xml.rpc.Service {

/**
 * Tipo de Cambio - Banco Central de Nicaragua
 */
    public java.lang.String getTipo_Cambio_BCNSoapAddress();

    public ni.gob.bcn.servicios.Tipo_Cambio_BCNSoap getTipo_Cambio_BCNSoap() throws javax.xml.rpc.ServiceException;

    public ni.gob.bcn.servicios.Tipo_Cambio_BCNSoap getTipo_Cambio_BCNSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
