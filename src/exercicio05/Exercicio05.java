package exercicio05;

import java.util.Scanner;

/**
 *
 * @author Wellington F.
 */
public class Exercicio05 {
    public static void main(String[] args) {
    int a;
    int b;
    int c;
    
    Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um valor para A: ");
        a = leitor.nextInt();
        System.out.print("Digite um valor para B: ");
        b = leitor.nextInt();
        System.out.println("O valor de A: " + a + " e valor de B: "+ b);
        c = a;
        a = b;
        b = c;
        System.out.println("O valor de A trocado é: " + a + " e valor de B: "+ b);
        
    
    }
    
}
