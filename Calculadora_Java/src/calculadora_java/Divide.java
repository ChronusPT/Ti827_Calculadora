
package calculadora_java;


class Divide {

    static void dividir() {
       LeDados r = new LeDados ();
        r.lerValores("Indique o dividendo", "Indique o divisor");
        System.out.println("O valor da divisão é "+ 
                (r.valor1 / r.valor2 ));
    }
    
}
