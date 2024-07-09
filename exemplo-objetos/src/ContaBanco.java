public class ContaBanco {
    //ATRIBUTOS
    public int numCont;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //MÉTODOS 
    
    //MÉTODO CONSTRUTOR
    public ContaBanco(float saldo, boolean status) {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //MÉTODOS ESPECIAIS 
    public int getNumCont() {
        return this.numCont;
    }

    public void setNumCont(int numCont) {
        this.numCont = numCont;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //MÉTODOS PERSONALIZADOS
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumCont());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(String t){
        this.setTipo(t);
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta sem dinheiro");
        }else{
            setStatus(false);
        }
        System.out.println("Conta fechada com sucesso");
    }
    public void depositar(float v){
        if(getStatus() == true){
            setSaldo(getSaldo() + v);
            System.out.println("Depóstio realizado na conta de "+ getDono());
        }else{
            System.out.println("Não é possível depositar");
        }
    }
    
    public void sacar(float v){
        if(getStatus()){
                if(this.getSaldo() >= v){
                   this.setSaldo(this.getSaldo() - v);
                   System.out.println("Saque realizado na conta de "+getDono()); 
            }else{
                System.out.println("Saldo Insuficiente na conta");
            }
        }else{
            System.out.println("Impossível fazer saque numa conta inexistente");
        }
    }
    public void pagarMensalidade(){
        int v=0;
       if (getTipo() == "CC") {
        v=12;
       } else if(this.getTipo()== "CP") {
        v = 20;
       }
       if(this.getStatus()){
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Mensalidade paga com sucesso por"+ this.getDono());
       }else{
        System.out.println("Não é possível fazer o pagamento");
       }
    }

}