
package calculadora_java;


class Soma {

    static void somar() {
 
      LeDados r = new LeDados ();
        r.lerValores("Indique o valor base", "Indique o valor a adicionar");
        System.out.println("O valor da soma é "+ 
                (r.valor1 + r.valor2 ));
    }
    
}
