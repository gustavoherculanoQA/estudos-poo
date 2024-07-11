public class ControleRemoto implements Controlador{
    //ATRIBUTOS

    private int volume;
    private boolean ligado;
    private boolean tocando;
    //MÉTODO CONSTRUTOR
    public ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.volume = volume;
        this.ligado = false;
        this.tocando = false;
    }
    //MÉTODOS ESPECIAIS 
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    @Override
    public void ligar() {
       this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("Ligado: "+getLigado());
        System.out.println("Volume: "+ getVolume());
        System.out.println("Tocando: "+getTocando());
       for(int i = 1; i <= getVolume(); i+=5){
           System.out.print(" | ");
       }
  
    }
    @Override
    public void fecharMenu() {
        System.out.println("Menu desligado...");
    }
    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume()+2);
        }
       
    }
    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume()-2);          
        }
    }
    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() >0){
            this.setVolume(0);
        }
       
    }
    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
        
    }
    @Override
    public void play() {
        if(this.getLigado() && !(getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não é possível pois está desligado");
        }

    }
    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Não é possível pausar pois está desligado");
        }
    }
    
}
