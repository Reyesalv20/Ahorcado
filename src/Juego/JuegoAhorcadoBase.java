/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

/**
 *
 * @author Jorge Hernandez
 */
public abstract class JuegoAhorcadoBase implements JuegoAhorcado {
    String palabraSecreta;
    String palabraActual;
    int intentos;
    
    /**
     * Actualiza palabraActual (la vista del jugador adivinando la palabraa) mostrando los caracteres adivinados
     * @param letra 
     */
    void actualizarPalabraActual(char letra) {
        String nuevaActual = "";
        for (int i =0; i < palabraSecreta.length();i++) {
            char letraActual = palabraActual.charAt(i);
            
            // Adivino una nueva letra
            if (letraActual == '-' && palabraSecreta.toUpperCase().charAt(i) == letra) {
            }
            
        }
    }
    
}
