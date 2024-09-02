import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        
        /*14) Faça um algoritmo que leia 10 números e, ao final, escreva quantos estão entre 0 e
        100, quantos estão entre 101 e 200 e quantos são maiores de 200. */

        Scanner l = new Scanner(System.in);
        int soma1 = 0;
        int soma2 = 0;
        int soma3 = 0;
        int soma4 = 0;
        for(int i = 1 ;i<=10;i++){
            System.out.println("Digite um número: ");
            int j = l.nextInt();
            if ( j >= 0 && j <= 100){
                soma1 = soma1 + 1;
            }else if(j > 100 && j <= 200){
                soma2 = soma2 + 1;
            }else if(j >200 && j <=300){
                soma3 = soma3 + 1;
            }else if (j > 300){
                soma4 = soma4 +1;
            }
        }
        System.out.println("Numeros de 0 - 100 "+ soma1);
        System.out.println("NUmero de 101 - 200 "+ soma2);
        System.out.println("Números de 201- 300 "+ soma3);
        System.out.println(soma4);
    }
    
}
