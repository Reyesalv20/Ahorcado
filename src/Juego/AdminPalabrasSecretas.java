package Juego;

import java.util.ArrayList;


public class AdminPalabrasSecretas {
  
   ArrayList<String> Palabrasecretas;  
   
    public AdminPalabrasSecretas(ArrayList<String> Palabrasecretas) {
        this.Palabrasecretas = Palabrasecretas;
    }

    public ArrayList<String> getPalabrasecretas() {
        return Palabrasecretas;
    }
   
    
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
    @Override
    public String toString() {
        String result="";
        int num=1;
        for (String palabra : Palabrasecretas) {
            result += num + "-" + palabra + "\n";
            num++;
        }
        return result;
    }
    
 }
