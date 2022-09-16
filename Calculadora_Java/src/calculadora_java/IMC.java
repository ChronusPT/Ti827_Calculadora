
package calculadora_java;


class IMC {

    static void calculaIMC() {
        float IMC = 0;
        
        LeDados r = new LeDados ();
        r.lerValores();
        IMC = (float) (r.valor1 / Math.pow (r.valor2,2));
        System.out.println("O valor do IMC = "+ IMC);
        
        if (IMC < 18.5){
            System.out.println("Encontra-se abaixo do peso indicado -> "+ IMC);
        }
        else if ((IMC >= 18.5) & (IMC < 25)){
            System.out.println("Encontra-se na proporção correta -> "+ IMC);
        }
        else if ((IMC >= 25) & (IMC < 30)){
            System.out.println("Encontra-se com excesso de peso -> "+ IMC);
        }
        else if ((IMC >= 30) & (IMC < 35)){
            System.out.println("Encontra-se em obesidade classe I -> "+ IMC);
        }
        else if ((IMC >= 35) & (IMC < 40)){
            System.out.println("Encontra-se em obesidade classe II -> "+ IMC);
        }
        else if (IMC > 40){
            System.out.println("Encontra-se em obesidade classe III -> "+ IMC);
        } 
    }
    
}
