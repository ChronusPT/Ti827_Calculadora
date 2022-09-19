
package calculadora_java;


class Subtrai {

    static void subtrair() {
        
        LeDados r = new LeDados ();
        r.lerValores("Indique o valor base", "Indique o valor a subtrair");
        System.out.println("O valor da subtração é "+ 
                (r.valor1 - r.valor2 ));
    }
    
}
