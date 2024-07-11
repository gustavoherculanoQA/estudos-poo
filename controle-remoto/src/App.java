public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c1 = new ControleRemoto(50, false, false);
        ControleRemoto c2 = new ControleRemoto(20, false, false);
        ControleRemoto c3 = new ControleRemoto(20, false, false);

        c1.ligar();
        c1.play();
        c1.abrirMenu();
        System.out.println("");
        System.out.println("=============");

        c2.ligar();
        c2.ligarMudo();
        c2.abrirMenu();
        System.out.println("");
        System.out.println("=============");

        c3.ligar();
        c3.maisVolume();
        c3.maisVolume();
        c3.play();
        c3.abrirMenu();

        
        
       
        
    }
}
