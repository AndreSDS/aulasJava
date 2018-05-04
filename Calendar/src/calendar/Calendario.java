/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edube
 */
public class Calendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Calendar hoje = Calendar.getInstance();//singleton
        
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);
        
        System.out.printf("Hoje é : %02d/%02d/%d %02d:%02d:%02d",dia,(mes+1), ano, hora, minutos, segundos);
        
        hoje.add(Calendar.DAY_OF_MONTH, 1);
        
        System.out.println();
        
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
        Calendar data1 = new GregorianCalendar(2010, 2, 20, 14, 32, 25);
        
        System.out.println(sdf.format(data1.getTime()));
        
        Date hoje1 = new Date();
        System.out.println(sdf.format(hoje1));
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        String minhadata = "20-03-2000";
        
        try {
            Date minhadataEmDate = sdf1.parse(minhadata);
            
            System.out.println(minhadataEmDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        
        Locale[] locale1 = Locale.getAvailableLocales();
        for (Locale locales : locale1) {
            System.out.println(locales.getDisplayName());
            System.out.println(locales.getDisplayLanguage());
            System.out.println(locales.getLanguage());
            System.out.println(locales.getCountry());
            System.out.println(locales.getDisplayCountry());
            System.out.println("");
        }
        
        Locale br = new Locale("pt","Brazil");
        
        Locale.setDefault(br);
        
        System.out.println(Locale.getDefault());
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println(nf.format(500000000d));
        
        Date hoje3 = new Date();
        
        System.out.println(Locale.getDefault());
        
        //Locale.setDefault(new Locale("pt", "Brazil"));
        
        String hojeFormatado = DateFormat.getInstance().format(hoje3);
        System.out.println(hojeFormatado);
        
        hojeFormatado = DateFormat.getTimeInstance().format(hoje3);
        System.out.println(hojeFormatado);
        
        hojeFormatado = DateFormat.getDateInstance().format(hoje3);
        System.out.println(hojeFormatado);
        
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje3);
        System.out.println(hojeFormatado);//MEDIUM ou LONG
        
        String dat = "12-02-2018 14:34";
        
        try {
            Date datado = DateFormat.getInstance().parse(dat);
            System.out.println(dat);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
}
