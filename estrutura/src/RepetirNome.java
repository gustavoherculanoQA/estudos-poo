import java.util.Scanner;

public class RepetirNome {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = l.next();
        System.out.println("Quantas vezes deseja repetir o nome: ");
        int n = l.nextInt();

        for(int i = 1 ; i <= n; i++ ){
            System.out.println(i+ "  "+nome);
        }

    }
    
}
