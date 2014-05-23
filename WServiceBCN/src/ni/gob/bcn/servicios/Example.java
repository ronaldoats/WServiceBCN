package ni.gob.bcn.servicios;

import java.util.Calendar;
import java.util.GregorianCalendar;


import org.apache.axis.message.MessageElement;

public class Example {

	public static void main(String a[]) {
		ni.gob.bcn.servicios.Tipo_Cambio_BCNLocator serviceLocator = null;
		Tipo_Cambio_BCNSoap port = null;
		Tipo_Cambio_BCN countryData = null;
		try {
			serviceLocator = new ni.gob.bcn.servicios.Tipo_Cambio_BCNLocator();
			port = serviceLocator.getTipo_Cambio_BCNSoap();
		
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			System.out.println("Tasa del Dia");
			
			Calendar calendario = new GregorianCalendar();
			int dia=calendario.get(Calendar.DAY_OF_MONTH);
			int mes=calendario.get(Calendar.MONTH)+1;
			int ano=calendario.get(Calendar.YEAR);
			
			System.out.println(dia+"/"+mes+"/"+ano+"="+port.recuperaTC_Dia(ano, mes, dia)+"\n");
			//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			
			
			//************************************************************
			
			System.out.println("Tasas del Mes");
			
			RecuperaTC_MesResponseRecuperaTC_MesResult tmr=port.recuperaTC_Mes(ano, mes);
			org.apache.axis.message.MessageElement me[] =tmr.get_any(); 
			
			
			int size=me[0].getLength();
			for(int i=0;i<size;i++){
				MessageElement mei=(MessageElement)me[0].getChildren().get(i);
				for(int j=0;j<mei.getLength();j++){
					MessageElement meii=(MessageElement)mei.getChildren().get(j);
					System.out.println(meii.getName()+"="+meii.getChildren().get(0));
				}
				System.out.println();
			}
			//************************************************************
			
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
}
