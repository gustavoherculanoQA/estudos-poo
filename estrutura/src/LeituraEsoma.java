import java.util.Scanner;

public class LeituraEsoma {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int j=0;
        int soma = 0;
        for(int i = 1 ; i<=10; i++){
            System.out.println("Digite o "+ i +"º número da soma");
            j = l.nextInt();
            soma = soma + j; 
        }
        System.out.println(soma);

    }
    
}
