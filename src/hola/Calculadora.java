package hola;

public class Calculadora {
    private int num1;
    private int num2;

   public Calculadora(int a, int b) {
       num1 = a;
       num2 = b;
   }
   public int suma() {
       int resul = num1 + num2;
       return resul;
   }
   public int distancia() {
       int resul ;
       if(resta2()) resul =num1-num2;
       else resul= num2-num1;
 
       return resul;
   }
   public boolean resta2() {
  if(num1>=num2)return true;
  else return false;
   }
   public Integer divide2() {
  if(num2==0)return null;
  int resul =num1/num2;
  return resul;
   }
//   crear los test de los 3 metodos ussaando asserTrue(), assertFalse(),
//   assertNull ,ect
   public int multiplica() {
       int resul = num1 * num2;
       return resul;
   }
   public int divide() {
       int resul = num1 / num2;
       return resul;
   }
   
   public int divide0() {  
  if(num2 == 0)
     throw new java.lang.ArithmeticException("Divisi�n por 0");
  else{
     int resul= num1 / num2;
     return resul;
  }
}
}
