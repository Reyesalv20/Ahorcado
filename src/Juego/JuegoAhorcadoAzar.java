/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.util.ArrayList;
import java.util.Random;

public class JuegoAhorcadoAzar extends JuegoAhorcadoBase {
    ArrayList<String> definidas;
    private String palabra;
    
    private int posicionRandom(int min, int max) {
        Random random=new Random();
        return random.nextInt(max-min+1)+min;
    }
    
    public String palabraAcar(){
        definidas.remove(palabra);
        return palabra;
    }
    @Override
    public void inicializarPalabraSecreta() {
        
    }

    @Override
    public boolean jugar() {
        return true;
    }
    
}
/*
4. Clase JuegoAhorcadoAzar:
En esta clase, define un conjunto de palabras posibles y selecciona una al azar para que los jugadores adivinen. 
Implementa los métodos abstractos de manera coherente.
*/