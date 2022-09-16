
package calculadora_java;


class Soma {

    static void somar() {
 
      LeDados r = new LeDados ();
        r.lerValores();
        System.out.println("O valor da soma é "+ 
                (r.valor1 + r.valor2 ));
    }
    
}
