
package calculadora_java;


class Subtrai {

    static void subtrair() {
        
        LeDados r = new LeDados ();
        r.lerValores();
        System.out.println("O valor da subtração é "+ 
                (r.valor2 - r.valor1 ));
    }
    
}
