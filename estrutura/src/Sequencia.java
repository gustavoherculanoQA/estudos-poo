
/*15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a
soma desses números. Encerre a execução quando um número negativo for digitado. */
import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int soma=0;
        int n = 0;
        do{
            System.out.println("Digite um número: ");
            n = l.nextInt();
            if(n < 0){
                break;
            }
            soma = soma + n;
        }while(n > 0);
        System.out.println(soma);
        System.out.println("Encerrado.");
    }
}
