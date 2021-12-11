package idioma;

import java.util.Locale;

public class Idioma {

    public static void main(String[] args) {
        System.out.println("Seu sistema está em");
        Locale locale = Locale.getDefault();
        System.out.println(locale.getDisplayLanguage());
        
    }
    
}
