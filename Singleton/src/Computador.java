


public class Computador {
    private static Computador computador; // null
    
    private Computador (){}
           public static Computador getComputador(){
               
            
            if (computador == null){
                computador = new Computador();
                
            }
                 return computador;
                 
        }
         
    }