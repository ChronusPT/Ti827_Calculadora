
package calculadora_java;


public class LeDados {
    public float valor1, valor2;
    
    public void lerValores(String s1,String s2){
        System.out.println(s1);
        valor1 = Calculadora_Java.ler.nextFloat();
        System.out.println(s2);
        valor2 = Calculadora_Java.ler.nextFloat();
    }
}
