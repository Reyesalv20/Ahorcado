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

    public JuegoAhorcadoAzar(String palabra) {
        definidas.add("MAÑANA");
        definidas.add("JUEVES");
        definidas.add("ALMUERZO");
        definidas.add("PARAGUAY");
        definidas.add("GITHUB");
        definidas.add("BUSCADOR");     
        definidas.add("TELEGRAFO");
        definidas.add("RADIO");
        definidas.add("NIÑERA");
        definidas.add("SILICONA");
        this.palabra = palabra;
    }
    public void añadir(String palabra) {
        definidas.add(palabra);
        
    }
    private int posicionRandom(int min, int max) {
        Random rand=new Random();
        return rand.nextInt(max-min+1)+min;
    }
    public String palabraAzar(){
        if(!definidas.isEmpty()){
            for (int i = 0; i < definidas.size(); i++) {
                int index = posicionRandom(0,10);
                return definidas.get(index);
            }
        }
        return "";
    }
    @Override
    public String inicializarPalabraSecreta() {
        if(!definidas.isEmpty()){
            palabraAzar();
            for (int i = 0; i < palabraAzar().length(); i++) {
                return "_";
            }
        }
        return null;
    }

    @Override
    public boolean jugar() {
        
        return true;
    }
    
}
