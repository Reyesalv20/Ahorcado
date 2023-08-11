/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.util.ArrayList;
import java.util.Random;

public class JuegoAhorcadoAzar extends JuegoAhorcadoBase {
    ArrayList<String> definidas; //arraylist de palabras ya existentes
    private String palabraAdivinar;

    public JuegoAhorcadoAzar(ArrayList<String> definidas) {
        this.definidas = definidas;
       
    }

    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }
    
    public String inicializarPalabraSecreta() {
        Random rand = new Random();
        return definidas.get(rand.nextInt(0, definidas.size()));
    }

    @Override
    public void jugar() {
        Juego.azar azar = new Juego.azar(this);
    }
    
}
