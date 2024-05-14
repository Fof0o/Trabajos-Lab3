package Model;

public class Jugador {

    private String Nombre;
    private int Vidas;


    public Jugador() {
    }
    public Jugador(String nombre, int vidas) {
        Nombre = nombre;
        Vidas = vidas;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getVidas() {
        return Vidas;
    }

    public void setVidas(int vidas) {
        Vidas = vidas;
    }


    public void DescontarVidas(){
        int Vida = getVidas() - 1;
        setVidas(Vida);
    }
}
