import java.util.Scanner;

public class NomeDeUser20 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = l.nextLine();
        for(int i = 1 ; i<=10;i++){
            System.out.println(i + " "+ nome);
        }
    }
    
}
