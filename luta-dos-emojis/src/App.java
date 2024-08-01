public class App {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Gustavo", "Brasileiro", 22, 1.88, 59, 5, 2, 0);

        l[1] = new Lutador("José", "Angolano", 25, 1.96,90, 10, 2, 1);

        for(int i = 0; i< 2; i++){
            System.out.println(l[i].getNome());
        }
    }
}
