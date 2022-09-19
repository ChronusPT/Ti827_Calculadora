
package calculadora_java;


class Multiplica {

    static void multiplicar() {
        LeDados r = new LeDados ();
        r.lerValores("Indique o multiplicador", "Indique o multiplicando");
        System.out.println("O valor da multiplicação é "+ 
                (r.valor1 * r.valor2 ));
        
    }
    
}
