
package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Date relogio = new Date();
        Locale loc = Locale.getDefault();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        System.out.print("Hora do sistema é ");
        System.out.println(relogio.toString());
        System.out.print("Idioma do sistema ");
        System.out.println(loc.getDisplayLanguage());
        System.out.print("A resolução da tela é ");
        System.out.println(dim.width+" "+dim.height);
    }
    
}
