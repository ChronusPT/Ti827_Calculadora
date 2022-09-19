
package calculadora_java;


public class LeDados {
    public float valor1, valor2;
    
    public void lerValores(String S1, String S2){
        System.out.println("S1");
        valor1 = Calculadora_Java.ler.nextFloat();
        System.out.println("S2");
        valor2 = Calculadora_Java.ler.nextFloat();
    }
}
