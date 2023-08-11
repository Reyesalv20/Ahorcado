package Juego;

import java.util.ArrayList;


public class AdminPalabrasSecretas {
  
   ArrayList<String> Palabrasecretas;   
    
    public void agregarpalabras(String palabagreg){
        
     Palabrasecretas.add(palabagreg); 
          
   
    }
    public void borrarpalabras(String palabraborrar){
                        
        for (int i = 0; i < Palabrasecretas.size(); i++) {
          
             if(Palabrasecretas.get(i).contains(palabraborrar)){
                 
                 Palabrasecretas.remove(i);
             }
            
        }
       
    }
 
}
