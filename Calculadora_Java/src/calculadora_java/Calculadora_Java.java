
package calculadora_java;

import java.util.Scanner;

public class Calculadora_Java {
    
    public static Scanner ler = new Scanner (System.in);
  
    public static void main(String[] args) {
        char op;
        do {
        System.out.println("_--MENU CALCULADORA--_");
        System.out.println("+ -> Soma ");
        System.out.println("- -> Subtração ");
        System.out.println("* -> Multiplicação ");
        System.out.println("/ -> Divisão ");
        System.out.println("e -> Expoente ");
        System.out.println("I -> IMC ");
        System.out.println("s -> Sair ");
        System.out.println("Indique a operação pretendida :");
        op = ler.next().charAt(0);
        switch(op){
            case '+': Soma.somar(); break;
            case '-': Subtrai.subtrair(); break;
            case '*': Multiplica.multiplicar(); break;
            case '/': Divide.dividir(); break;
            case 'E':
            case 'e': Expoente.potencia(); break;
            case 'i':
            case 'I': IMC.calculaIMC(); break;
            
            default: System.out.println("Operador Incorreto!");
        }
           
    }while (op != 's' && op != 'S');
    
}
}