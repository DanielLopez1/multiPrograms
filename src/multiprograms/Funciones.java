/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiprograms;

/**
 *
 * @author efrai
 */
public class Funciones {
    /**
    * Funcion para validar el Numero por medio de regex
    * se agregaron caracteres como el punto y el negativo
    * @author efrai
    */
    public static boolean validacionNumero(String text){
        if(text.matches("[0-9.-E-]*")){
            return true;
        }else{
            return false;
        }
    }
    
    
       /**
    * Funciones para la pestaña de temperatura cada una
    * convierte las unidades de temperatura 
    * dependiendo de lo selecionado
    * 
    * @author efrai
    */
    public static double convertirCelcius(double unidades, String eleccion){
        double res;
        switch(eleccion){
            case "Celsius":

                 return unidades;
               
            case "Fahrenheit":
                       res = (unidades * 9 / 5) + 32;
                 return res;
               
            case "Kelvin":
                
                res =unidades + 273.15;
                 return res;
        }
        return unidades;
                
    }
    
     public static double convertirFahrenheit(double unidades, String eleccion){
        switch(eleccion){
            case "Fahrenheit":
                  System.out.println("Estoy adentro del metodo y escogi " + eleccion);
                   System.out.println(unidades);//32
                 return unidades;
               
            case "Celsius":
                  System.out.println("Estoy adentro del metodo y escogi " + eleccion);
                  System.out.println(unidades);
                 return (unidades - 32) * 5 / 9;
               
            case "Kelvin":
               System.out.println("Estoy adentro del metodo y escogi " + eleccion);
                 return ((unidades - 32) * 5/9) + 273.15;
        }
        return unidades;
                
    }
     
    public static double convertirKelvin(double unidades, String eleccion){
        switch(eleccion){
            case "Kelvin":
                 return unidades;
               
            case "Celsius":
                 return unidades - 273.15 ;
               
            case "Fahrenheit":
               
                 return ((unidades - 273.15) * 9/5 )+ 32;
        }
        return unidades;
                
    }
    
      /**
    * Funciones para la pestaña de Longitudes cada una
    * convierte las unidades de lengitud 
    * dependiendo de lo selecionado
    * 
    * @author efrai
    */
    
     public static double convertirKilometros(double unidades, String eleccion){
        switch(eleccion){
            case "Kilometro":
                 return unidades;
               
            case "Metro":
                 return unidades * 1000 ;
               
            case "Centimetro":
                
                 return unidades * 100000;
                 
            case "Milimetro":
               
                 return unidades * 1000000;
       
        }
        return unidades;
                
    }
     
     public static double convertirmMetros(double unidades, String eleccion){
        switch(eleccion){
            case "Metro":
                 return unidades;
               
            case "Kilometro":
                 return unidades / 1000 ;
               
            case "Centimetro":
                
                 return unidades * 100;
                 
            case "Milimetro":
               
                 return unidades * 1000;
       
        }
        return unidades;
                
    }
     
      public static double convertirCentimetros(double unidades, String eleccion){
        switch(eleccion){
            case "Centimetro":
                 return unidades;
               
            case "Metro":
                 return unidades / 100 ;
               
            case "Kilometro":
                
                 return unidades / 100000;
                 
            case "Milimetro":
               
                 return unidades * 10;
       
        }
        return unidades;
                
    }
      
       public static double convertirMilimetros(double unidades, String eleccion){
        switch(eleccion){
            case "Milimetro":
                 return unidades;
               
            case "Metro":
                 return unidades / 1000 ;
               
            case "Centimetro":
                
                 return unidades / 10;
                 
            case "Kilometro":
               
                 return unidades / 1000000;
       
        }
        return unidades;
                
    }
      /**
    * Funciones para la pestaña de masa cada una
    * convierte las unidades de masa 
    * dependiendo de lo selecionado
    * 
    * @author efrai
    */
    
     public static double convertirTonelada(double unidades, String eleccion){
        switch(eleccion){
            case "Tonelada":
                 return unidades;
               
            case "Kilogramo":
                 return unidades * 1000 ;
               
            case "Gramo":
                
                 return unidades * 1000000;
                 
            case "Miligramo":
               
                 return unidades * 1000000000;
       
        }
        return unidades;
                
    }
     
     public static double convertirKilogramo(double unidades, String eleccion){
        switch(eleccion){
            case "Kilogramo":
                 return unidades;
               
            case "Tonelada":
                 return unidades / 1000 ;
               
            case "Gramo":
                
                 return unidades * 1000;
                 
            case "Miligramo":
               
                 return unidades * 1000000;
       
        }
        return unidades;
                
    }
     
      public static double convertirGramo(double unidades, String eleccion){
        switch(eleccion){
            case "Gramo":
                 return unidades;
               
            case "Tonelada":
                 return unidades / 1000000 ;
               
            case "Kilogramo":
                
                 return unidades / 1000;
                 
            case "Miligramo":
               
                 return unidades * 1000;
       
        }
        return unidades;
                
    }
      
       public static double convertirMiligramo(double unidades, String eleccion){
        switch(eleccion){
            case "Miligramo":
                 return unidades;
               
            case "Tonelada":
                 return unidades / 1000000000 ;
               
            case "Kilogramo":
                
                 return unidades / 1000000;
                 
            case "Gramo":
               
                 return unidades / 1000;
       
        }
        return unidades;
                
    }
    
}
