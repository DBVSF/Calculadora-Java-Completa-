
package CC.operacoesAvancadas;


public class OperacoesAvancadas {
    
    public double potencia (double num1, double num2){
        
        double resultado = 1;
        
        for (int i = 0; i < num2; i++) {
            
            
            
            resultado = num1 * resultado; 
        }
        
    return resultado;
    }
    
   public double celcius (double num1){
       
      
       
       double resultado = (num1 * 9/5) + 32;
       
       return resultado;
       
   }
   public double fahrenheit (double num1) {
       
       double resultado = (num1 -32) * 5/9;
       
       return resultado;
       
   }    public double IMC (double altura, double peso){
       
       double resultado = peso/(altura*altura);
       
       return resultado;
       
   }
   public double distanciaMetro (double quilometro){
       
       double resultado = quilometro * 1000;
       return resultado;
       
   }public double distanciaMilha (double quilometro){
       
       double resultado = quilometro * 1.609;
       return resultado;
   }public double distanciaCentimetros (double quilometro ){
       
       double resultado = quilometro * 100000;
       return resultado;
   }
}
