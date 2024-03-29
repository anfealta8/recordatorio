/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recordatorio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDRES TALERO
 */
public class Recordatorio {

     //Metodo usado para obtener la fecha actual
    //@return Retorna un <b>STRING</b> con la fecha actual formato "dd-MM-yyyy"
    public  String getFechaActual(Date ahora) {
       // Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
        return formateador.format(ahora);
        
    }
    
    public  Date ParseFecha(String fecha)
{
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
    Date fechaDate = null;
    try {
        fechaDate = formato.parse(fecha);
    } 
    catch (ParseException ex) 
    {
        System.out.println(ex);
    }
    return fechaDate;
}

    //Metodo usado para obtener la hora actual del sistema
    //@return Retorna un <b>STRING</b> con la hora actual formato "hh:mm:ss"
    public static String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        return formateador.format(ahora);
    }

    //Sumarle dias a una fecha determinada
    //@param fch La fecha para sumarle los dias
    //@param dias Numero de dias a agregar
    //@return La fecha agregando los dias
    public static java.sql.Date sumarFechasDias(java.sql.Date fch, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fch.getTime());
        cal.add(Calendar.DATE, dias);
        return new java.sql.Date(cal.getTimeInMillis());
    }

    //Restarle dias a una fecha determinada
    //@param fch La fecha
    //@param dias Dias a restar
    //@return La fecha restando los dias
    public static synchronized java.sql.Date restarFechasDias(java.sql.Date fch, int dias) {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fch.getTime());
        cal.add(Calendar.DATE, -dias);
        return new java.sql.Date(cal.getTimeInMillis());
    }

    //Diferencias entre dos fechas
    //@param fechaInicial La fecha de inicio
    //@param fechaFinal  La fecha de fin
    //@return Retorna el numero de dias entre dos fechas
    public static synchronized int diferenciasDeFechas(Date fechaInicial, Date fechaFinal) {

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
        }

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
        return ((int) dias);
    }

    //Devuele un java.util.Date desde un String en formato dd-MM-yyyy
    //@param La fecha a convertir a formato date
    //@return Retorna la fecha en formato Date
    public  synchronized java.util.Date deStringToDate(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yy");
        Date fechaEnviar = null;
        try {
            fechaEnviar = formatoDelTexto.parse(fecha);
            return fechaEnviar;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    
    public static void main(String[] args) throws ParseException  {
        
        //MenuPrincipal men =new MenuPrincipal();
        //men.setVisible(true);
           
     Recordatorio re =new  Recordatorio();
     Date ahora = new Date();
     System.out.println("fecha en estring"+re.getFechaActual(ahora));
     String fecha=re.getFechaActual(ahora);
     
     
        //System.out.println("fecha en date"+re.deStringToDate(fecha));
     
        Date hoy=re.deStringToDate(fecha);
        
        System.out.println("fecha en date"+hoy);
 
               
          								
           
                
                
                
                
                
                
        //extraer los dos ultimos digitos del nit
     //  String nitocc="900787345";

      //  System.out.println("el nit es : "+nitocc);
      // System.out.println("la cantidad total de digitos es : "+nitocc.length());
      // System.out.println("el ultimo digito es : "+nitocc.substring(nitocc.length()-1,nitocc.length()));
      // System.out.println("los dos ultimos digitos son : "+nitocc.substring(nitocc.length()-2,nitocc.length()));

          
           
           
    }
    
}
