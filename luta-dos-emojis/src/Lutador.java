public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos publicos 
    public void apresentar(){
        System.out.println("====================");
        System.out.println("Chegou a hora, apresentamos o lutador: " + this.getNome());
        System.out.println("Nacionalidade: "+ getNacionalidade());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Com "+ getVitorias() + " Vitórias \n"+ getDerrotas()+" Derrotas\n"+getEmpates()+" Empates ");
    }
    public void status(){
        System.out.println(getNome() + " é um peso "+getCategoria());
        System.out.println("Ganhou "+ getVitorias() + " lutas");
        System.out.println("Perdeu "+ getDerrotas()+ " lutas");
        System.out.println("Empatou "+ getEmpates()+" lutas");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() +1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() +1);
    }
    //MÉTODO CONSTRUTOR
    public Lutador(String nome, String nacionalidade, int idade, double altura, float peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    //

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.peso <52.2){
            this.categoria = "Iválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
