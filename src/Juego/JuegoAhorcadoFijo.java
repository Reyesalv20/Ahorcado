package Juego;

public abstract class JuegoAhorcadoFijo extends JuegoAhorcadoBase {
    public JuegoAhorcadoFijo(String palabraFija) {
        palabraSecreta = palabraFija;
        esconderPalabra();
    }

    public String inicializarPalabraSecreta() {
        return palabraSecreta;
    }
    
    

}

