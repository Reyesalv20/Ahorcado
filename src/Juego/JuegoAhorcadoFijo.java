package Juego;

public class JuegoAhorcadoFijo extends JuegoAhorcadoBase {
    
    int intentosRestantes;
    public JuegoAhorcadoFijo(String palabraFija) {
        palabraSecreta = palabraFija;
        esconderPalabra();
        intentosRestantes = 5;
    }
    public String inicializarPalabraSecreta() {
        return palabraSecreta;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    public void jugar() {
        new fijo(this);
    }
    
    
    
    

}

