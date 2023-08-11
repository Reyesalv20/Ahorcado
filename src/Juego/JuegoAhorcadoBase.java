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
    String palabraSecreta; // Palabra que fue escogida para adivinar -> HOLA
    String palabraActual; // Palabra "escondida" con guiones -> H-L-
    int intentos;
    
    /** 
     * Actualiza palabraActual (la vista del jugador adivinando la palabraa) mostrando los caracteres adivinados
     * @param letra La letra que el usuario ingreso. TIENE QUE ESTAR EN MAYUSCULA.
     * @returns La palabra escondida acorde a las letras adivinadas.
     */
    String actualizarPalabraActual(char letra) {
        if (!verificarLetra(letra)) return palabraActual; // la letra no esta en la lista asi que no se toma la molestia de actualizar.
        
        String nuevaActual = "";
        for (int i =0; i < palabraSecreta.length() - 1;i++) {
            char letraActual = palabraActual.toUpperCase().charAt(i);
            
            // Adivino una nueva letra
            if (letraActual == '-' && palabraSecreta.toUpperCase().charAt(i) == letra) {
                nuevaActual += letra;
            } else nuevaActual += letraActual;
        }
        
        return nuevaActual;
    }
    
    /**
     * Verifica que la letra este dentro de la palabra.
     * @param letra La letra mayuscula a verificar.
     * @return  
     */
    boolean verificarLetra(char letra) {
        for (int i = 0; i < palabraSecreta.length() - 1; i++) {
            char letraActual = palabraSecreta.toUpperCase().charAt(i);
            
            if (letraActual == letra) return true;
        }
   
        return false;
    }
    
    boolean hasGanado() {
        if (palabraSecreta.toUpperCase().equals(palabraActual.toUpperCase())) {
            return true;
        }
        
        return false;
    }
    
}
 