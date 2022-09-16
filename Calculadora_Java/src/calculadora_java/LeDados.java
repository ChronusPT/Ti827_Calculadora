
package calculadora_java;


public class LeDados {
    public float valor1, valor2;
    
    public void lerValores(){
        System.out.println("Insira um valor");
        valor1 = Calculadora_Java.ler.nextFloat();
        System.out.println("Insira outro valor");
        valor2 = Calculadora_Java.ler.nextFloat();
    }
}
