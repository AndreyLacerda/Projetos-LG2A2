package Calculadora;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        String resp = "sim";
        Scanner scan = new Scanner (System.in);
        
        while ("sim".equals(resp) || "Sim".equals(resp) || "SIM".equals(resp)){
            
            System.out.println (" -- CALCULADORA -- ");
            System.out.print ("1º Valor: ");
            float x = scan.nextFloat();
            System.out.print ("Operação (+ - / *): ");
            String operacao = scan.next();
            System.out.print ("2º Valor: ");
            float y = scan.nextFloat();
        
            switch (operacao){
                
                case "+": System.out.printf ("\n%.1f + %.1f = %.1f\n",x, y, x + y); break;
                case "-": System.out.printf ("\n%.1f - %.1f = %.1f\n",x, y, x - y); break;
                case "*": System.out.printf ("\n%.1f + %.1f = %.1f\n",x, y, x * y); break;
                case "/": 
                    if (x != 0) 
                       System.out.printf ("%.1f + %.1f = %.1f\n",x, y, x / y); 
                    else
                       System.out.println ("Operação Inválida: Impossível dividir algo por zero");
                    break;
                default: System.out.println ("Operando Inválido"); break;
               
            }
            
            System.out.print ("Deseja Continuar (sim ou não)? ");
            resp = scan.next();
            
        }
        
    }
    
}
