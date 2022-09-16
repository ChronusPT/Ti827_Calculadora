
package calculadora_java;


class Divide {

    static void dividir() {
       LeDados r = new LeDados ();
        r.lerValores();
        System.out.println("O valor da divisão é "+ 
                (r.valor1 / r.valor2 ));
    }
    
}
