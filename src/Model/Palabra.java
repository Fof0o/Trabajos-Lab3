package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Palabra {

    private List<String> lstPalabras;
    public Palabra() {
        lstPalabras = new ArrayList<>(Arrays.asList("calabozo","mondongo",
                "martillo","osvaldo","beatle","bananaasesina","mandarima",
                "panaderia", "juan"));
    }

    public List<String> getLstPalabras() {
        return lstPalabras;
    }

    Random rand = new Random();

    public String BuscarPalabra(){
        String pal = "";
        int num;

        num = rand.nextInt(5);
        pal = lstPalabras.get(num);
        return pal;
    }






}
