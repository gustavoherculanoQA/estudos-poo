import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner r = new Scanner(System.in); 

    Random rnd = new Random(); 
    int x = rnd.nextInt(10); 
    int j;
    do{
        System.out.println("Digite um número");
        j = r.nextInt();
        if (j > x){
            System.out.println("pensei em um número menor");
        }else if (j< x) {
            System.out.println("Pensei em um número maior");
        }
    }while(j != x);
    System.out.println("Parabéns, pensamos no mesmo número "+ x);
    
    }
}