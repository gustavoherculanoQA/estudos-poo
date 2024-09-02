import java.util.Scanner;

public class SomaIdadePessoas {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int soma = 0;
        for(int i = 1 ; i <=10 ;i++){
            System.out.println("Digite a idade da "+i +"º pessoa: ");
            int c = l.nextInt();
            soma = soma + c;
        }
        System.out.println(soma);
    }
    
}
