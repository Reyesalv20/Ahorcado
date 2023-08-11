/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.util.ArrayList;
import java.util.Random;

public class JuegoAhorcadoAzar extends JuegoAhorcadoBase {
    ArrayList<String> definidas; //arraylist de palabras ya existentes
    int intentosRestantes;
    public JuegoAhorcadoAzar(ArrayList<String> definidas) {
        this.definidas = definidas;
        intentos = INTENTOS_DEFAULT;
        intentosRestantes = intentos;
       
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    public String inicializarPalabraSecreta() {
        Random rand = new Random();
        palabraSecreta = definidas.get(rand.nextInt(0, definidas.size()));
        esconderPalabra();
        return palabraSecreta;
    }

    @Override
    public void jugar() {
        azar Azar = new azar(this);
    }
    
}
