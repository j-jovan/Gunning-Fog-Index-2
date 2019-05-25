package gunning.fog.index;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GunningFogIndex {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi tekst");
        String unetTekst = scanner.nextLine();
        
        List<String> unetTekstLista = new ArrayList<String>(Arrays.asList(unetTekst.split(" ")));
      
        int brojReci = unetTekstLista.size();
        List<String> brojRecenicaLista = new ArrayList<String>(Arrays.asList(unetTekst.split(".")));
        int brojRecenica = brojRecenicaLista.size();
          System.out.println(brojRecenicaLista);
    }
    
}
