package estruturadedados;

import java.util.Scanner;

/**
 *
 * @author geise
 */
public class SegudaQuestão {
    public static void Main(String[] args) {
       Scanner number = new Scanner(System.in);
       
       int[] numero = new int[20];
       int[] pares;
       int[] impares;
       
       System.out.println("Digite 20 números inteiros: ");
       for (int i = 0; i < 20; i++) {
        System.out.print("Número "+ (i + 1)+ ":");
        numero[i] = Scanner.nextInt();      
    }
       int countpares = 0;
       int countimpares = 0;
       
       for (int numeros: numeros){
           if (numero % 2 == 0) {
               countpares++;
           } else {
               countimpares;
           }
       }
       pares = new int[countpares];
       impares = new int [countimpares];
       
       int Indexpares = 0;
       int Indeximpares = 0;
       
       for (int numeros: numeros){
           if (numero % 2 == 0) {
           pares[indexPares++] = numero;
            } else {
                impares[indexImpares++] = numero;
            }
        }

        // Impressão dos vetores
        System.out.println("\nNúmeros digitados:");
        imprimirVetor(numeros);

        System.out.println("\nNúmeros PARES:");
        imprimirVetor(pares);

        System.out.println("\nNúmeros ÍMPARES:");
        imprimirVetor(impares);
    }

    // Método para imprimir um vetor de inteiros
    private static void imprimirVetor(int[] vetor) {
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
