import java.util.Scanner;

/**
 *
 * @author geise
 */
public class PrimeiraQuestão {
   public static void Main(String[] args) {
        String[] nomes = {"Anastácia", "Brenda", "Carlos", "Daniela", "Edgar", "Febiana", "Gustavo", "Helena", "Ivone", "Juninho"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome de pessoa: ");
        String nomeBuscado = sc.nextLine();
        boolean achou = false;
        
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nomeBuscado)) {
                achou = true;
                break;
            }
        }
        if (achou) {
            System.out.println("ACHEI");
        }
        else {
            System.out.println("NÃO ACHEI");
        }
        sc.close();
    }
} 
}
