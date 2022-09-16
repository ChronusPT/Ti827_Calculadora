
package calculadora_java;


class Multiplica {

    static void multiplicar() {
        LeDados r = new LeDados ();
        r.lerValores();
        System.out.println("O valor da multiplicação é "+ 
                (r.valor1 * r.valor2 ));
        
    }
    
}
