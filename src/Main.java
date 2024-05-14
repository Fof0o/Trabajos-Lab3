import Model.Jugador;
import Model.Palabra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jugador jugador = new Jugador();
        Palabra palabra = new Palabra();

        Scanner scn = new Scanner(System.in);

        System.out.println("Bienvenido al Ahorcado");

        System.out.println("Ingresa tu Nombre");

        String Nombre = scn.next();
        jugador.setNombre(Nombre);


        System.out.println("Con Cuantas Vidas Desea Jugar");

        int Vidas = scn.nextInt();
        jugador.setVidas(Vidas);

        System.out.println("Buena Suerte " + jugador.getNombre());
        System.out.println("Vidas: " + jugador.getVidas());

        String palabrafinal = palabra.BuscarPalabra();


        //Basicamente lo que pasa aca es que al repetir por ej 7 veces el _ por la longitud de la palbra

        String guion = "_".repeat(palabrafinal.length());

        //esos 7 guiones se separan 1 por 1 y se almacenan en un array de char[]
        char[] guionArray = guion.toCharArray();
        //en el cual despues segun la posicion del char que se analice se reemplazara si la letra coincide


        System.out.println("Palabra: " + String.valueOf(guionArray));


        do {
            System.out.println("Introduce una letra o adivina la palabra");
            String letra = scn.next().toLowerCase();

            //si es una sola letra
            if (letra.length() == 1){
                for (int i = 0; i < palabrafinal.length(); i++){
                    //recorre cada letra de la palabra en cada iteracion
                    if (palabrafinal.charAt(i) == letra.charAt(0)) //si una char(letra) de la palabra es igual a la letra que se ingreso
                    {
                        guionArray[i] = letra.charAt(0);
                    }
                }
                    if (!ValidarLetra(palabrafinal, letra)) {
                        jugador.DescontarVidas();
                    }
            }
            //si es la palabra o mas de 1 letra
            else if (letra.length() >= 1){
                System.out.println("Debe ingresar 1 letra o la palabra completa");
                if (!letra.equals(palabrafinal)){
                    jugador.DescontarVidas();
                }
            }


            System.out.println(String.valueOf(guionArray));
            System.out.println("Vidas Restantes " + jugador.getVidas());


            if(letra.equals(palabrafinal)){
                System.out.println("Felicidades!!! Adivinaste la palabra "+ palabrafinal);
                break;
            }

            if (jugador.getVidas()==0){
                System.out.println("Te has quedado sin vidas");
                System.out.println("Fin del juego");
            }
        }
        while (jugador.getVidas() > 0);
    }

    public static boolean ValidarLetra(String pal,String let) {
        boolean aux = false;

        if (pal.contains(let)) {
            return true;
        }
        return false;
    }
}
