import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);
        ContaBanco p1 = new ContaBanco(0, false);
        p1.setNumCont(1111);
        p1.setDono("Gustavo");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco(0, false);
        p2.setNumCont(1112);
        p2.setDono("Isadora");
        p2.abrirConta("CP");
        
        p1.depositar(752);
        p2.depositar(320);

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
