/package estruturadedados;

import java.util.Scanner;

/**
 *
 * @author geise
 */
public class TerceiraQuestão {
   public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Digite o número de linhas da matriz A:"); 
        int linhasA = sc.nextInt(); 
        System.out.println("Digite o número de colunas da matriz A:"); 
        int colunasA = sc.nextInt(); 
        System.out.println("Digite o número de linhas da matriz B:"); 
        int linhasB = sc.nextInt(); 
        System.out.println("Digite o número de colunas da matriz B:"); 
        int colunasB = sc.nextInt();


        if (colunasA != linhasB) { 
            System.out.println("As matrizes não são multiplicáveis."); 
            return; 
        } 
        int[][] A = new int[linhasA][colunasA]; 
        int[][] B = new int[linhasB][colunasB]; 
        int[][] C = new int[linhasA][colunasB]; 
        System.out.println("Digite os elementos da matriz A:"); 
        for (int i = 0; i < linhasA; i++) { 
            for (int j = 0; j < colunasA; j++) { 
                A[i][j] = sc.nextInt(); 
            } 
        } 
        System.out.println("Digite os elementos da matriz B:"); 
        for (int i = 0; i < linhasB; i++) { 
            for (int j = 0; j < colunasB; j++) { 
                B[i][j] = sc.nextInt(); 
            } 
        } 

        for (int i = 0; i < linhasA; i++) { 
            for (int j = 0; j < colunasB; j++) { 
             
                C[i][j] = 0;
                for (int k = 0; k < colunasA; k++) { 
                    C[i][j] += A[i][k] * B[k][j]; 
                } 
            } 
        } 
        System.out.println("O resultado da multiplicação das matrizes A e B é:"); 
        for (int i = 0; i < linhasA; i++) { 
            for (int j = 0; j < colunasB; j++) { 
                System.out.print(C[i][j] + " "); 
            } 
            System.out.println(); 
        } 
        sc.close(); 
    }
}
